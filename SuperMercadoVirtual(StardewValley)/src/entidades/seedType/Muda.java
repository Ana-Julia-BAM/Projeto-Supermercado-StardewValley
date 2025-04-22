package entidades.seedType;

import java.util.Random;

import entidades.Produto;

public class Muda extends Produto {
    public int diasParaCrescer;

    public Muda(String nome, Double preco, String indentificacao, int quantidade, String tipo, int diasParaCrescer) {
        super(nome, preco, indentificacao, quantidade, tipo);
        this.diasParaCrescer = diasParaCrescer;
    }

    @Override
    public void ajustarQuantidade() {
        Random random = new Random();
        int quantidadeAleatoria = random.nextInt(50) + 1;
        setQuantidade(quantidadeAleatoria);
    }
    
}
