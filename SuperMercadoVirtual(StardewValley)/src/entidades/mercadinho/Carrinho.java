package entidades.mercadinho;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import entidades.Produto;

public class Carrinho {
    private ArrayList<Produto> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }
    
    public void adicionarAoCarrinho(Produto produto) {
        produto.atribuicaoAleatoria();
        itens.add(produto);
    }

    public void removerDoCarrinho(Produto produto) {
        itens.remove(produto);
    }

    public void exibirCarrinho() {
        for (Produto produto : itens) {
            System.out.println(produto);
        }
    }

    public void finalizarCompra() {
        if(itens.isEmpty()) {
            System.out.println("Carrinho vazio...");
        } else {
            System.out.println("Compra finalizada com sucesso! Estes são os produtos que você selecionou: ");
            exibirCarrinho();
            gerarRecibo();
            itens.clear();
        }
    }

    private void gerarRecibo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("boleto.txt"))) {
            writer.write("Recibo da Compra:\n");
            for(Produto produto : itens) {
                writer.write(produto.toString() + ", " + produto.getQualidade() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Erro ao gerar o boleto!!!" + e.getMessage()) ;
        }
    }
}
