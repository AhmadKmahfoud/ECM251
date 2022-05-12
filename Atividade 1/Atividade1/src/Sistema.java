public class Sistema {
    public static void iniciar (){
        Carro c1 = new Carro(15000,"Tesla");
        Moto m1 = new Moto(6000,"Toyota");
        Bicicleta b1 = new Bicicleta(160,"Giant");
        Patinete p1 = new Patinete(2900,"Valorant");
    
    User U1 = new User("Murilão");
    
    User U2 = new User("Pedrão");

    User U3  = new User("Zeeba");

    User U4 = new User("Feppão");


    System.out.println("Aluguel 1");
    U1.alugar(c1);
    System.out.println(U1);
    System.out.println(c1);

    System.out.println("Aluguel 2");
    U4.alugar(p1);
    System.out.println(U4);
    System.out.println(p1);

    System.out.println("Aluguel 3");
    U2.alugar(b1);
    System.out.println(U2);
    System.out.println(b1);

    System.out.println("Aluguel 4");
    U1.alugar(m1);
    System.out.println(U3);
    System.out.println(m1);
}

}



