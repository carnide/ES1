public interface Repositorio { /*porque o repositorio não liga a nada*/
    /*ou public class abstarct*/

     void adicionaUtilizador(Utilizador utilizador);
     void adicionaTipoUtilizador(TipoUtilizador tipo);
     void adicionaRequisicao(Requisicao requisicao);
     void adicionaCopia(Copia copia);
     void adicionaLivro(Livro livro);
     void adicionaEmprestimo(Emprestimo emprestimo);
     void adicionaNotificacao(Notificacao notificacao);
     void adicionaDevolucao(Devolucao devolucao);
     void adicionaCoima(Coima coima);
     Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);
     void adicionaEncomenda(Encomenda encomenda);
     void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);
     void adicionaPropostaRequisicao(PropostaAquisicao proposta);
     void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);

     void adicionaAssistentePesquisa(Assistente_Pesquisa assistente_pesquisa);
     void adicionaMarcacaoAssistencia(Marcacao_Assistencia marcacao_assistencia);
     void adicionaPesquisa (Pesquisa pesquisa);
}
 