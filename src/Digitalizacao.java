import java.sql.Date;
import java.sql.Time;

public class Digitalizacao extends Armazenamento{

    private int ID;

    public Digitalizacao(String descricao, Utilizador user, Date data, Time hora, int ID) {
        super(descricao, user, data, hora);
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
