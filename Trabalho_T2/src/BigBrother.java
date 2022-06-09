public class BigBrother extends Membros {

    
    public BigBrother(String email, String nome, EnumFuncoes funcao) {
        super(email, nome, funcao);
       
    }

    
    public void apresentar() {
        System.out.println(toString());
        
    }

    
   
  
    public void mensagem(EnumHorarios horario) {
        switch (horario) {
            default:
                break;
            case NORMAL:
                System.out.println("Sempre ajudando as pessoas membros ou não S2!");
                break;
            case EXTRA:
                System.out.println("...");
                break;
        }
        
    }

}

