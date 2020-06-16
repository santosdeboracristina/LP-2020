package contaeagencia;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    String numero;
    String titular;
    String cpf;
    double saldo;
    double limite;

    public Conta(String numero, String titular, String cpf, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //método que saca uma determinada quantidade.
    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;

        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Você sacou: " + valor);
            return true;

        }
    }//fim do método saca.

    public String toString() {
        return "Titular:  " + titular + ", CPF " + cpf + ", Numero da Conta: " + numero;
    }

    //ARRAY
    public static List<meupacoteste.Conta> contas = new ArrayList<>();

    //método que deposita uma quantia.
    void deposita(double valor) {
        this.saldo += valor; //ou this.saldo = saldo + valor;
        System.out.println("Você depositou: " + valor);
        // *soma quantidade ao valor antigo do saldo
        // e guarda no próprio saldo.
    }//fim do método deposita.

    //método que trasfere uma quantia.
    //void transfere(Conta destino, double valor) {
    // this.saldo = this.saldo - valor;
    //destino.saldo = destino.saldo + valor;
    //  }//fim do método transfere.



}//fim da classe Conta.
