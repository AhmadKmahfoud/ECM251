import java.util.ArrayList;

public class Repository implements IRepository {
    private ArrayList<Membros> listaMembros = new ArrayList<Membros>();

    

    public void adicionarMembro(Membros membro) {
        this.listaMembros.add(membro);

    }
    
    public void removerMembros(Membros membro) {
        this.listaMembros.remove(membro);

    }

    public ArrayList<Membros> getMembros() {

        return listaMembros;
    }


}
