package redeSocial;

public class Instagram extends RedeSocial {
    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("comentou uma publicação no Instagram");
    }
}
