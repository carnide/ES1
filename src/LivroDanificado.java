public class LivroDanificado extends Livro{

    private int nivel; //nivel de danificacao

    public LivroDanificado(String titulo, String editora, int nivel) {
        super(titulo, editora);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
