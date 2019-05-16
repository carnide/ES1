import java.sql.Date;
import java.sql.Time;

public class Marcacao_Assistencia {
    private String Descricao;
    private Utilizador User;
    private Date Data;
    private Time Hora; //hora de inicio
    private int Duration; //duracao da reserva

    public Marcacao_Assistencia(String descricao, Utilizador user, Date data, Time hora, int duration) {
        Descricao = descricao;
        User = user;
        Data = data;
        Hora = hora;
        Duration = duration;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Utilizador getUser() {
        return User;
    }

    public void setUser(Utilizador user) {
        User = user;
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

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

}
