package redeSocial;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigo;

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha() {
        return senha;
    }

    public void setNumAmigo(int numAmigo) {
        this.numAmigo = numAmigo;
    }
    public int getNumAmigo() {
        return numAmigo;
    }

    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    public void curtiPublicacao(){
        System.out.println("O usuario curtiu sua publicação");
    }
}
