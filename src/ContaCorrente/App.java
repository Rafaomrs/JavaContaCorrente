package ContaCorrente;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rafael", "123456789");
        Agencia agencia = new Agencia("123", "12", "PR", "Mandaguari");
        Conta conta = new Conta("fake", "0000000000", agencia, "123", "12", cliente);

        try{
            conta.sacar(2000.0);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
            System.out.println("enviando email para o gerente");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}