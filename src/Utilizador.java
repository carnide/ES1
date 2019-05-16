public class Utilizador {
    private String nome;
    private String estado;
    private int IDUtilizador;
    private TipoUtilizador tipo;

    public Utilizador(String nome, String estado, int IDUtilizador, TipoUtilizador tipo) {
        this.nome = nome;
        this.estado = estado;
        this.IDUtilizador = IDUtilizador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { this.nome = nome; }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) { this.estado = estado; }

    public int getIDUtilizador() { return IDUtilizador; }

    public void setIDUtilizador(int IDUtilizador) { this.IDUtilizador = IDUtilizador; }

    public TipoUtilizador getTipoUtilizador(){
        return tipo;
    }

    public void setTipo(TipoUtilizador tipo) { this.tipo = tipo; }








}
