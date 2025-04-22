package entidades.foodType;

import entidades.Produto;
import entidades.exceptions.PrecoInvalidoException;

public abstract class Comida extends Produto {
    public int saude;
    public int energia;
    
    public Comida(String nome, Double preco, String indentificacao, int quantidade, String tipo, int saude, int energia) {
        super(nome, preco, indentificacao, quantidade, tipo);
        this.saude = saude;
        this.energia = energia;
        if (preco == null || preco <= 0) throw new PrecoInvalidoException("PREÇO IVALIDO");
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    
    
    @Override
    public String toString() {
        return "Comida [saude=" + saude + ", energia=" + energia + ", preco=" + preco + ", tipo=" + tipo + "]";
    }
    public abstract void ajustarQuantidade();
    
}
