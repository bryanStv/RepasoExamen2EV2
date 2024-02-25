package network;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Usuario> usuarios = new HashSet<>();
        Usuario maria = new Usuario("Mari");
        Usuario juan = new Usuario("Juan");
        Usuario andres = new Usuario("Andrés");
        usuarios.add(maria);
        usuarios.add(juan);
        usuarios.add(andres);

        Foto f = new Foto(maria, "imagen.png", "Pájaro");
        maria.addPublicacion(f);
        f.like();

        Foto f2 = new Foto(juan, "juan.png", "Pájaro Juan");
        juan.addPublicacion(f2);
        Foto f3 = new Foto(andres, "andres.png", "Pájaro Andrés");
        andres.addPublicacion(f3);
        f3.like();
        f3.like();
        Texto t = new Texto(maria, "Qué tal?");
        Texto t2 = new Texto(maria, "Aquí andamos");
        maria.addPublicacion(t);
        maria.addPublicacion(t2);
        Class clase = maria.getClass();
        Method[] m = clase.getDeclaredMethods();
        for(int i = 0; i < m.length; i++) {
            System.out.println("method = " + m[i].toString());
        }
        Comentario c = new Comentario(f2, andres, "Muy bonita");
        Comentario c2 = new Comentario(f2, juan, "Muy bonita también");
        f2.addComentario(c);
        f2.addComentario(c2);
        for (Usuario u : usuarios) {
            System.out.println(u);
            for (Publicacion p : u.getPublicaciones()) {
                System.out.println("\t" + p);
                for (Comentario comentario: p.getComentarios()) {
                    System.out.println("\t\t" + comentario);
                }
            }
        }

    }
}