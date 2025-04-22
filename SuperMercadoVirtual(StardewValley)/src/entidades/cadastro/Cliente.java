package entidades.cadastro;

import entidades.exceptions.MenorDeIdadeException;
import entidades.exceptions.NomeInvalidoException;

public class Cliente {
    public String nome;
    public int idade;
    private double id;
    protected String genero;
    
    
    public Cliente(String nome, int idade, double id, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.genero = genero;
        if (nome == null ) throw new NomeInvalidoException("NOME INVALIDO, TROCAR POR FAVOR");
        if (idade < 18) throw new MenorDeIdadeException("Site somente para propietarios de fazendas! ");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", id=" + id + ", genero=" + genero + "]";
    }
}
