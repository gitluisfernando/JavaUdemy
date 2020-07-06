package Secao15.ReservaQuartoException.Model.Exceptions;

public class DomainException extends RuntimeException {

    public DomainException(String mensagem) {
        super(mensagem);
    }

}