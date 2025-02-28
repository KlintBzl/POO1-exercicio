package atividade6;


public class Usuario {
    private String login;
    private String senha;
    
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public boolean autenticar(String login, String senha){
        if(senha == this.senha && login == this.login){
            System.out.println("Entrando...");
            return true;
        } else {
            System.out.println("Senha ou login errados");
            return false;
        }  
    }
    
    public String getLogin(){
         return login;
     }
    public void setLogin( String login){
        this.login = login;
    }
    
    public  String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
}
