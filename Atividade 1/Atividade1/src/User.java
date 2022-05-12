public class User {
    private String Nome;
    private Veiculo Alugado;

public User(String Nome) {
    this.Nome = Nome;
    }
public String getNome(){
        return Nome;
}   
public void setNome(String Nome){
        this.Nome = Nome;
}
public Veiculo getAlugado(){
    return Alugado;
}
public void setAlugado(Veiculo Alugado){
    this.Alugado = Alugado;
}

public void alugar(Veiculo Alugado){
    setAlugado(Alugado);
}

}

    


