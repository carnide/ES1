import java.sql.Date;
import java.time.LocalDate;

public class Main {

    public static void main(String args[]){
        Utilizador u = new Utilizador("Manuel","Ativo", 1, new TipoUtilizador("aluno",10));
        PropostaAquisicao propostaAquisicao = new PropostaAquisicao(LocalDate.now(),u,"Alice no Pais das Maravilhas");
        Livro l = new Livro("Programar em Java", "FCA");
        Copia c = new Copia(1, l);
        RequisicaoCompraCopia requisicaoCompraCopia = new RequisicaoCompraCopia("pendente", LocalDate.now(), "Oficio",l,u);
        Encomenda encomenda = new Encomenda(LocalDate.now(),requisicaoCompraCopia);
        EntradaNovoLivro entradaNovoLivro = new EntradaNovoLivro(LocalDate.now(),encomenda,c);
        //... criação do objeto repositorio
        Repositorio repo = new RepositorioMem();
        repo.adicionaEntradaNovoLivro(entradaNovoLivro);


        /*  declara varaveis */
        Armazenamento armazem = new Armazenamento("Armazento digitalizacao");

        /*cria livro danificado*/
        LivroDanificado ld1 = new LivroDanificado("LIvro Danificado 1","ES",1);
        LivroDanificado ld2 = new LivroDanificado("LIvro Danificado 2","ES",2);
        LivroDanificado ld3 = new LivroDanificado("LIvro Danificado 3","ES",3);

        /* cria  digitalizacao */
        Digitalizacao d1 = new Digitalizacao(1,ld1);
        Digitalizacao d2 = new Digitalizacao(2,ld2);
        Digitalizacao d3 = new Digitalizacao(3,ld3);

        /* juntar digitalizacao ao armazem*/
        armazem.addDigitalizacao(d1);
        armazem.addDigitalizacao(d2);
        armazem.addDigitalizacao(d3);


        /*Impressao vai buscar ao armazem livros */
        int i=0;
        for(Digitalizacao ldigit : armazem.getLdigit())
        {
            ImpressaoLivro impl= new ImpressaoLivro(i,ldigit.getLivro());
            repo.adicionaImpressaoLivro(impl);
        }

    }
}
