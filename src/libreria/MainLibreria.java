package libreria;
public class MainLibreria {
    public static void main(String[] args) {
        //--------------------------------AUTORES-----------------------------------------------------------------------
        Autor pepe = new Autor("A01", "Pepe Palomares");
        Autor maria = new Autor("A02", "María Martínez");
        Autor jaime = new Autor("A03", "Jaime Jimenez");

        //--------------------------------TEMAS-------------------------------------------------------------------------
        Tema terror = new Tema("T01", "Terror");
        Tema cienciaFiccion = new Tema("T02", "Ciencia Ficción");

        //--------------------------------EDITORIALES-------------------------------------------------------------------
        Editorial anaya = new Editorial("ED01", "Anaya");
        Editorial planeta = new Editorial("ED02", "Planeta");

        //--------------------------------LIBROS------------------------------------------------------------------------
        Libro libro1 = new Libro("001", "Terror1", planeta, terror);
        Libro libro2 = new Libro("002", "Terror2", planeta, terror);
        Libro libro3 = new Libro("003", "CC1", anaya, cienciaFiccion);
        Libro libro4 = new Libro("004", "CC2", anaya, cienciaFiccion);

        //--------------------------------EJEMPLARES--------------------------------------------------------------------
        String[] idEjemplar = {"Ejemplar01", "Ejemplar02", "Ejemplar03"};
        Ejemplar ejemplar1 = new Ejemplar(idEjemplar[0], libro1);
        Ejemplar ejemplar2 = new Ejemplar(idEjemplar[1], libro1);
        Ejemplar ejemplar3 = new Ejemplar(idEjemplar[2], libro1);
        Ejemplar ejemplar4 = new Ejemplar(idEjemplar[0], libro2);
        Ejemplar ejemplar5 = new Ejemplar(idEjemplar[1], libro2);
        Ejemplar ejemplar6 = new Ejemplar(idEjemplar[2], libro2);
        Ejemplar ejemplar7 = new Ejemplar(idEjemplar[0], libro3);
        Ejemplar ejemplar8 = new Ejemplar(idEjemplar[1], libro3);
        Ejemplar ejemplar9 = new Ejemplar(idEjemplar[2], libro3);
        Ejemplar ejemplar10 = new Ejemplar(idEjemplar[0], libro4);
        Ejemplar ejemplar11 = new Ejemplar(idEjemplar[1], libro4);
        Ejemplar ejemplar12 = new Ejemplar(idEjemplar[2], libro4);

        //-------------------------------LECTORES-----------------------------------------------------------------------
        Lector lector1 = new Lector("12345678A", "Pedro");
        Lector lector2 = new Lector("98765432A", "Teresa");
        Lector lector3 = new Lector("12345678B", "Juan");
        Lector lector4 = new Lector("12345678C", "Mario");

        //-------------------------------HISTORICOS---------------------------------------------------------------------
        Historico historico1 = new Historico("enero", "febrero", lector1, ejemplar2);
        Historico historico2 = new Historico("febrero", "marzo", lector2, ejemplar2);
        Historico historico3 = new Historico("junio", "julio", lector2, ejemplar7);
        Historico historico4 = new Historico("junio", "agosto", lector3, ejemplar5);
        Historico historico5 = new Historico("noviembre", "diciembre", lector4, ejemplar11);

        //-------------------------------AÑADIENDO----------------------------------------------------------------------
        //LIBROS DE CADA AUTOR Y AUTORES DE CADA LIBRO
        pepe.addLibro(libro1);
        maria.addLibro(libro1);
        maria.addLibro(libro2);
        maria.addLibro(libro3);
        jaime.addLibro(libro4);
        libro1.addAutor(pepe);
        libro1.addAutor(maria);
        libro2.addAutor(maria);
        libro3.addAutor(maria);
        libro4.addAutor(jaime);

        //Libros por editoriales
        anaya.addLibro(libro3);
        anaya.addLibro(libro4);
        planeta.addLibro(libro1);
        planeta.addLibro(libro2);

        //Añadir los ejemplares a los libros
        libro1.addEjemplar(ejemplar1);
        libro1.addEjemplar(ejemplar2);
        libro1.addEjemplar(ejemplar3);
        libro2.addEjemplar(ejemplar4);
        libro2.addEjemplar(ejemplar5);
        libro2.addEjemplar(ejemplar6);
        libro3.addEjemplar(ejemplar7);
        libro3.addEjemplar(ejemplar8);
        libro3.addEjemplar(ejemplar9);
        libro4.addEjemplar(ejemplar10);
        libro4.addEjemplar(ejemplar11);
        libro4.addEjemplar(ejemplar12);

        //HISTORICOS ENTRE LECTORES Y EJEMPLARES
        lector1.addHistorico(historico1);
        lector2.addHistorico(historico2);
        lector2.addHistorico(historico3);
        lector3.addHistorico(historico4);
        lector4.addHistorico(historico5);

        ejemplar2.addHistorico(historico1);
        ejemplar2.addHistorico(historico2);
        ejemplar7.addHistorico(historico3);
        ejemplar5.addHistorico(historico4);
        ejemplar11.addHistorico(historico5);

        ejemplar2.addFechaPrestamo("enero");
        ejemplar2.addFechaPrestamo("febrero");
        ejemplar7.addFechaPrestamo("junio");
        ejemplar5.addFechaPrestamo("junio");
        ejemplar11.addFechaPrestamo("noviembre");

        //RECORRIENDO LAS CLASES
        imprimir(anaya);
        imprimir(planeta);
    }
    private static void imprimir(Editorial editorial){
        System.out.println("EDITORIAL: "+editorial.getNombre());
        for(Libro l:editorial.getLibros()){
            System.out.println("\tLibro: "+l+" Tema: "+l.getTema());
            for(Autor a:l.getAutores()){
                System.out.println("\t\tAutor: "+a);
            }
            for (Ejemplar e: l.getEjemplares()){
                System.out.println("\t\t\tEjemplar: "+e);
                for(Historico h:e.getHistoricos()){
                    System.out.println("\t\t\t\tLector: "+h.getLector());
                    System.out.println("\t\t\t\tInicio Préstamo: "+h.getFechaInicio());
                    System.out.println("\t\t\t\tFin de Préstamo: "+h.getFechaFin());
                    System.out.println("\t\t\t\tHistoricos: "+h);
                }
            }
        }
    }
}
