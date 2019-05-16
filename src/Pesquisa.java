public class Pesquisa {

    private Marcacao_Assistencia Marcacao;
    private Assistente_Pesquisa Assistente;

    public Pesquisa(Marcacao_Assistencia marcacao, Assistente_Pesquisa assistente) {
        Marcacao = marcacao;
        Assistente = assistente;
    }

    public Marcacao_Assistencia getMarcacao() {
        return Marcacao;
    }

    public void setMarcacao(Marcacao_Assistencia marcacao) {
        Marcacao = marcacao;
    }

    public Assistente_Pesquisa getAssistente() {
        return Assistente;
    }

    public void setAssistente(Assistente_Pesquisa assistente) {
        Assistente = assistente;
    }
}
