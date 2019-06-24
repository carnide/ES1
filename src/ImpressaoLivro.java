import java.sql.Date;
import java.sql.Time;

public class ImpressaoLivro {

    private int n_impressao;
    private Livro livro;


    public ImpressaoLivro(int n_impressao, Livro livro) {
        this.n_impressao = n_impressao;
        this.livro = livro;

    }

    public int getN_impressao() {
        return n_impressao;
    }

    public void setN_impressao(int n_impressao) {
        this.n_impressao = n_impressao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }


}
