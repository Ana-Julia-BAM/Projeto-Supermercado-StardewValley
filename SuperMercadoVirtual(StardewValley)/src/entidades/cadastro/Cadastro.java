package entidades.cadastro;

import java.util.List;
import entidades.exceptions.MenorDeIdadeException;
import entidades.exceptions.NomeInvalidoException;

public class Cadastro  {
   private List<Cliente> clientes;

   

    
}


    private void clientesPredefinidos() {
        adicionarCliente("Haley", 22, 001, "F");
        adicionarCliente("Emily", 25, 002, "F");
        adicionarCliente("Abigail", 20, 003, "F");
        adicionarCliente("Leah", 27, 004, "F");
        adicionarCliente("Penny", 23, 005, "F");
        adicionarCliente("Alex", 23, 006, "M");
        adicionarCliente("Sam", 20, 007, "M"); 
        adicionarCliente("Harvey", 28, 010, "M");
        adicionarCliente("Krobus", 999999, 999, "?");
        adicionarCliente("Evelyn", 91, 010, "F");
        adicionarCliente("Gus", 35, 011, "M");
   }


    public void adicionarCliente(String nome, int idade, double id, String genero) {
        clientes.add(new Cliente(nome, idade, id, genero));
        
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
