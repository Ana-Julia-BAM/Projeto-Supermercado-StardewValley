package entidades.exceptions;

public class ProdutoNaoEncontradoException extends Exception {
    public ProdutoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
