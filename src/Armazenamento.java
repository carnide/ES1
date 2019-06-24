import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Armazenamento {

    private ArrayList<Digitalizacao> ldigit ;
    private String Descricao;


    public Armazenamento(String descricao) {
       ldigit = new ArrayList<>();
        Descricao = descricao;

    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }


    public ArrayList<Digitalizacao> getLdigit() {
        return ldigit;
    }

    public void addDigitalizacao(Digitalizacao digiy){
        ldigit.add(digiy);
}

}
