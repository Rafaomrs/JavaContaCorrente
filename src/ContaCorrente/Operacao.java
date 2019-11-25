package ContaCorrente;

import java.util.Date;

public class Operacao {
    private String tipo;
    private Date data;
    private Double valor;

    public Operacao(String tipo, Double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = new Date();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
