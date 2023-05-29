import redeSocial.*;
import usuario.Usuario;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<RedeSocial> redeSociais = new HashSet<>();
        Usuario u = new Usuario();
        Facebook f = new Facebook();
        GooglePlus g = new GooglePlus();
        Instagram i = new Instagram();
        Twitter t = new Twitter();

        u.setNome("Leticia");
        u.setEmail("oi@gmail.com");

        f.setSenha("123456");
        f.setNumAmigo(1300);
        f.compartilhar();
        f.postarFoto();
        f.postarComentario();
        redeSociais.add(f);

        g.setSenha("A4648");
        g.setNumAmigo(200);
        g.fazStreaming();
        g.fazStreaming();
        g.curtiPublicacao();
        redeSociais.add(g);

        i.setSenha("Ab20654");
        i.setNumAmigo(2000);
        i.postarComentario();
        i.postarVideo();
        i.postarComentario();
        redeSociais.add(i);

        t.setSenha("1236");
        t.setNumAmigo(500);
        redeSociais.add(t);
        
        for(RedeSocial rs : redeSociais) {
            System.out.println("Imprimindo valores: " + rs);
        }
    }
}