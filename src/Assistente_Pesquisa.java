public class Assistente_Pesquisa {
    private String nome;
    private String estado;
    private String disponibilidade;
    private int IDAssistente;


    public Assistente_Pesquisa(String nome, String estado, String disponibilidade, int IDAssistente) {
        this.nome = nome;
        this.estado = estado;
        this.disponibilidade = disponibilidade;
        this.IDAssistente = IDAssistente;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getIDAssistente() {
        return IDAssistente;
    }

    public void setIDAssistente(int IDAssistente) {
        this.IDAssistente = IDAssistente;
    }
}

