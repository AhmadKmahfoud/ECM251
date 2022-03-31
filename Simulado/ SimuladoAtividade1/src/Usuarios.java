public class Usuarios {
    private String nome;
    private String senha;
    private String email;

    public Usuarios(String nome, String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        
    }

    public void visualizarUsuario(){
        System.out.println("Nome:" + nome);
        System.out.println("Senha:" + senha);
        System.out.println("E-mail:" + email);
        
    }
  //Nome
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    
    //Senha
    public String getsenha(){
        return senha;
    }
    public void setsenha(String senha){
        this.senha = senha;
    }
    
    //Email
    public String getEmail(){
        return email;
    }
   
    public void setEmail(String email){
        this.email = email;
    }
    

}
