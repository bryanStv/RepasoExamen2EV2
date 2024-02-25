package universidad;

public class MainFacultad {
    public static void main(String[] args) {
        Facultad facultad = new Facultad("UJI");

        Catedra catedraInformatica = new Catedra("Catedra Ciencias", facultad);
        facultad.addCatedra(catedraInformatica);
        Departamento depInf = new Departamento("Informatica");
        catedraInformatica.setDepartamento(depInf);

        Profesor victor = new Profesor("Victor", depInf);
        depInf.addProfesor(victor);

        Profesor  maria = new Profesor("Maria", depInf);
        depInf.addProfesor(maria);

        Adscrito ads = new Adscrito(victor, catedraInformatica, "11 - julio");
        victor.addAdscrito(ads);
        catedraInformatica.addAdscrito(ads);
        Adscrito ads2 = new Adscrito(maria, catedraInformatica, "31 - diciembre");
        maria.addAdscrito(ads2);
        catedraInformatica.addAdscrito(ads2);

        for(Catedra catedra : facultad.getCatedras()){
            System.out.println("Catedra: "+catedra);
            System.out.println("\tDepartamento: "+catedra.getDepartamento());
            for (Profesor profesor:catedra.getDepartamento().getProfesores()){
                System.out.println("\t\tProfesor: "+profesor);
                for (Adscrito a: profesor.getAdscritos()){
                    System.out.println("\t\t\tAdscrito desde "+a.getFecha());
                }
            }
            System.out.println("\tFacultad: "+catedra.getFacultad());
            long numeroAds = catedra.getAdscritos().stream().map(Adscrito::getFecha).count();
            System.out.println("Total de adscritos a la catedra "+catedra+": "+numeroAds);
            catedra.getAdscritos().forEach(System.out::println);
        }

    }
}
