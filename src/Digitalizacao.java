import java.sql.Date;

public class Digitalizacao {

    private String Descricao;
    private int ID;
    private Date Data;  //data de adicao

    public Digitalizacao(String descricao, int ID, Date data) {
        Descricao = descricao;
        this.ID = ID;
        Data = data;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }
}
