package entidades;

import java.util.Random;
import entidades.qualidade.RankDeQualidades;
import entidades.qualidade.iQualidadeAleatoria;

public abstract class Produto implements iQualidadeAleatoria {
    private String nome;
    protected Double preco;
    private String indentificacao;
    private int quantidade;
    public String tipo;
    private RankDeQualidades qualidade;
    
    public Produto(String nome, Double preco, String indentificacao, int quantidade, String tipo) {
        this.preco = preco;
        this.nome = nome;
        this.indentificacao = indentificacao;
        this.quantidade = quantidade;
        this.tipo = tipo;
        atribuicaoAleatoria();
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIndentificacao() {
        return indentificacao;
    }



    public void setIndentificacao(String indentificacao) {
        this.indentificacao = indentificacao;
    }

    public RankDeQualidades getQualidade() {
        return qualidade;
    }



    public void setQualidade(RankDeQualidades qualidade) {
        this.qualidade = qualidade;
    }
    
    
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preço= " + preco + ", indentificação=" + indentificacao + ", quantidade="
                + quantidade + ", tipo=" + tipo + "]";
    }

    @Override
    public void atribuicaoAleatoria() {
        Random random = new Random();
        RankDeQualidades[] qualidades = RankDeQualidades.values();
        this.qualidade = qualidades[random.nextInt(qualidades.length)];
    }

    public abstract void ajustarQuantidade();
}
