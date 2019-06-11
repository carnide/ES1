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

     void adicionaDigitalizacao(Digitalizacao digitalizacao);
     void adicionaArmazenamento(Armazenamento armazenamento);
     void adicionaImpressaoLivro(ImpressaoLivro impressaoLivro);
     void adicionaLivroDanificado(LivroDanificado livroDanificado);
     void adicionaPermissoes(Permissoes permissoes);
}
 