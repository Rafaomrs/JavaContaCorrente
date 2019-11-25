package ContaCorrente;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(Double valor){
        super ("Voce nao possui o valor de " + "para sacar");
    }
}
