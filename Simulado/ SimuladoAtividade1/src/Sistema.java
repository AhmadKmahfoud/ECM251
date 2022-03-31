public class Sistema {
    public void run(){
        Usuarios cliente = new Usuarios("Perigo", "malucoquemoralogoali", "perigo@bol.com");
        Contas conta = new Contas(1, cliente);
        System.out.println(conta);
    }
}