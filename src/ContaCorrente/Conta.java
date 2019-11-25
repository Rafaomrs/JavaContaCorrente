package ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class Conta extends Cliente {
    private Double saldo;
    private Agencia agenia;
    private String numero;
    private String digito;
    private Cliente cliente;
    private List<Operacao> operacoes;

    public Conta(String nome, String cpf, Agencia agenia, String numero, String digito, Cliente cliente) {
        super(nome, cpf);
        this.agenia = agenia;
        this.numero = numero;
        this.digito = digito;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.operacoes = new ArrayList<>();
    }


    public void depositar(Double valor){
        if(valor == null){
            throw new RuntimeException("O valor nao pode ser nulo");
        }
        if(valor <= 0.0){
            throw new RuntimeException("Saldo insuficiente");
        }
        this.saldo += valor;
        this.operacoes.add(new Operacao("Entrada", valor));
    }
    public void sacar(Double valor){
        if(valor == null){
            throw new RuntimeException("Valor pra sacar nao pode ser nulo");
        }
        if (valor <= 0.0){
            throw new RuntimeException("valor nao válido");
        }
        if (valor > this.saldo){
            throw new RuntimeException("Saldo insuficiente");
        }
        this.saldo-=valor;
        this.operacoes.add(new Operacao("SAIDA", valor));
    }
    public void transferir(Conta from, Double valor){
        if (from == null){
            throw new SaldoInsuficienteException(valor);
        }
        if (valor == null){
            throw new RuntimeException("Valor de transferencia nao pode ser nulo");
        }
        from.sacar(valor);
        this.depositar(valor);
    }
    public List<Operacao> getExtrato(){
        return this.operacoes;
    }
}