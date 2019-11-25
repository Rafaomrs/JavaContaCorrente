package ContaCorrente;

public class Agencia {
    private String numero;
    private String digito;
    private String uf;
    private String cidade;

    public Agencia(String numero, String digito, String uf, String cidade) {
        if(numero == null || numero.isEmpty()){
            throw new RuntimeException("Numero da agencia e obrigadtorio");
        }
        this.numero = numero;
        this.digito = digito;
        this.uf = uf;
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
