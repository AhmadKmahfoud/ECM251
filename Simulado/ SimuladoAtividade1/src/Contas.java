public class Contas {
    //Atributos da nossa classe
    private int Idconta;
    private double saldo;
    private Usuarios usuarios;

    public Contas(int Idconta, Usuarios usuarios){
        this.Idconta = Idconta;
        this.usuarios = usuarios;
        saldo = 0;
    }

    public String visualizarSaldo(){
        return String.format("R$%.2f", saldo);
    }
    public boolean depositar(double valor){
        if(valor < 0) 
            return false;
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor){
        if(valor > saldo) return false;
        if(valor < 0) return false;
        this.saldo -= valor;
        return true;
    }

    public boolean transferirDinheiro(double valor, Contas destino){
        if(!sacar(valor)) return false;
        if(!destino.depositar(valor)) return false;
        return true;
    }
    public String toString(){
        return "IdConta:"+Idconta
        + "\nUsuario:" + usuarios.getNome()
        + "\nSaldo:" + visualizarSaldo();
    }




}



