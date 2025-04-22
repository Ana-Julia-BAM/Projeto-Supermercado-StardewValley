package entidades.foodType;

import java.util.Random;

import entidades.exceptions.PrecoInvalidoException;

public class ComidaHumana extends Comida {
    
    public ComidaHumana(String nome, Double preco, String indentificacao, int quantidade, String tipo, int saude,
    int energia) {
        super(nome, preco, indentificacao, quantidade, tipo, saude, energia);
        if (preco == null || preco <= 0) throw new PrecoInvalidoException("PREÇO IVALIDO");
    }

    @Override
    public void ajustarQuantidade() {
        Random random = new Random();
        int quantidadeAleatoria = random.nextInt(200) + 1;
        setQuantidade(quantidadeAleatoria);
    }

}
