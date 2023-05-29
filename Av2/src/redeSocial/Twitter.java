package redeSocial;

import interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("comentou uma publicação no Twitter");
    }

    @Override
    public void compartilhar() {
            System.out.println("Compartilhou uma publicação no Twitter");

    }
}
