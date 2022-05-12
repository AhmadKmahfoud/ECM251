import java.util.concurrent.ThreadLocalRandom;

public class Veiculo {
    private String tipo;
    private double  custo;
    protected int ID;


    public Veiculo (double custo , String tipo) {
        this.tipo = tipo;
        this.custo = custo;
        genID();
    }
    public double  getcusto() {
        return custo ;
    }
    public  String gettipo() {
        return tipo ;
}
    public void genID () {
          this.ID = ThreadLocalRandom.current().nextInt(10000,99999);
    }

    public void testar () {
        System.out.println("ID:"+ID + "custo por hora:"+ custo);
  }
}
