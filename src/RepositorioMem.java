import sun.rmi.transport.LiveRef;

import java.security.PrivateKey;
import java.util.ArrayList; // import the ArrayList class

public class RepositorioMem implements Repositorio{
    private ArrayList<Utilizador> UTILIZADOR;
    private ArrayList<TipoUtilizador> TIPO;
    private ArrayList<Requisicao> REQUISICAO;
    private ArrayList<Copia> COPIA;
    private ArrayList<Livro> LIVRO;
    private ArrayList<Emprestimo> EMPRESTIMO;
    private ArrayList<Notificacao> NOTIFICACAO;
    private ArrayList<Devolucao> DEVOLUCAO;
    private ArrayList<Coima> COIMA;
    private ArrayList<Encomenda> ENCOMENDA;
    private ArrayList<EntradaNovoLivro> ENTRADANOVOLIVRO;
    private ArrayList<PropostaAquisicao> PROPOSTAAQUISICAO;
    private ArrayList<RequisicaoCompra> REQUISICAOCOMPRA;

    private ArrayList<Armazenamento> ARMAZENAMENTO;
    private ArrayList<Digitalizacao> DIGITALIZACAO;
    private ArrayList<Permissoes> PERMISSOES;
    private ArrayList<LivroDanificado> LIVRODANIFICADO;
    private ArrayList<ImpressaoLivro> IMPRESSAOLIVRO;

    public RepositorioMem(){
        UTILIZADOR = new ArrayList<>();
        TIPO = new ArrayList<>();
        REQUISICAO = new ArrayList<>();
        COPIA = new ArrayList<>();
        LIVRO = new ArrayList<>();
        EMPRESTIMO = new ArrayList<>();
        NOTIFICACAO = new ArrayList<>();
        DEVOLUCAO = new ArrayList<>();
        COIMA = new ArrayList<>();
        ENCOMENDA = new ArrayList<>();
        ENTRADANOVOLIVRO = new ArrayList<>();
        PROPOSTAAQUISICAO = new ArrayList<>();
        REQUISICAOCOMPRA = new ArrayList<>();

        ARMAZENAMENTO = new ArrayList<>();
        DIGITALIZACAO = new ArrayList<>();
        PERMISSOES = new ArrayList<>();
        LIVRODANIFICADO = new ArrayList<>();
        IMPRESSAOLIVRO = new ArrayList<>();
    }

    public void adicionaUtilizador(Utilizador utilizador) {
        UTILIZADOR.add(utilizador);
    }
    public void adicionaTipoUtilizador(TipoUtilizador tipo){
        TIPO.add(tipo);
    }
    public void adicionaRequisicao(Requisicao requisicao){
        REQUISICAO.add(requisicao);
    }
    public void adicionaCopia(Copia copia){
        COPIA.add(copia);
    }

    public void adicionaLivro(Livro livro){
        LIVRO.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo){
        EMPRESTIMO.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao){
        NOTIFICACAO.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao){
        DEVOLUCAO.add(devolucao);
    }

    public void adicionaCoima(Coima coima){
        COIMA.add(coima);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r){
        int n = EMPRESTIMO.size();
        for (int i = 0 ; i < n ; i++){
            if (EMPRESTIMO.get(i).getRequisicao().equals(r)){
                return EMPRESTIMO.get(i);
            }
        }

        return null;
    }


    public void	adicionaEncomenda(Encomenda encomenda){ ENCOMENDA.add( encomenda);}

    public void	adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro){ ENTRADANOVOLIVRO.add(entradaNovoLivro);}

    public void	adicionaPropostaRequisicao(PropostaAquisicao proposta){ PROPOSTAAQUISICAO.add(proposta);}

    public void	adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra){ REQUISICAOCOMPRA.add(requisicaoCompra);}


    public void adicionaArmazenamento(Armazenamento armazenamento){
        ARMAZENAMENTO.add(armazenamento);
    }

    public void adicionaDigitalizacao( Digitalizacao digitalizacao){
        DIGITALIZACAO.add(digitalizacao);
    }

    public void adicionaPermissoes(Permissoes permissoes){
        PERMISSOES.add(permissoes);
    }

    public void adicionaLivroDanificado(LivroDanificado livroDanificado){
        LIVRODANIFICADO.add(livroDanificado);
    }

    public void adicionaImpressaoLivro(ImpressaoLivro impressaoLivro){
        IMPRESSAOLIVRO.add(impressaoLivro);
    }





}
