package usuario;

import redeSocial.RedeSocial;

public class Usuario {
    private String nome;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void Usuario(RedeSocial[] redesSociais){
        RedeSocial[] r = new RedeSocial[5];
        System.out.println("Nome: "+nome);
        System.out.println("Email: "+email);
        for(RedeSocial rede : r ){
            try {
                System.out.println("Senha: " +rede.getSenha());
                System.out.println("Numero de amigos: " +rede.getNumAmigo());
            } catch (NullPointerException e) {
                System.out.println("Nao existe rede social");
            }
        }
        }
    }





