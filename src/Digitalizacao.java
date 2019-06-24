import java.sql.Date;
import java.sql.Time;

public class Digitalizacao{

    private int ID;
    private LivroDanificado livro;



    public Digitalizacao(int ID, LivroDanificado livro) {
        this.ID = ID;
        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(LivroDanificado livro) {
        this.livro = livro;
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
