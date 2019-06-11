import java.sql.Date;
import java.sql.Time;

public class ImpressaoLivro {

    private int n_impressora;
    private Date Data;
    private Time Hora;

    public ImpressaoLivro(int n_impressora, Date data, Time hora) {
        this.n_impressora = n_impressora;
        Data = data;
        Hora = hora;
    }

    public int getN_impressora() {
        return n_impressora;
    }

    public void setN_impressora(int n_impressora) {
        this.n_impressora = n_impressora;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time hora) {
        Hora = hora;
    }
}
