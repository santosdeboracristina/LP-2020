package meupacoteste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contas {

    private static List<Conta> contas = new ArrayList<>();
    private static Map<String, Contas> titularContas = new HashMap<String, Contas>();
    private static Map<Integer, Contas> numeroContas = new HashMap<Integer, Contas>();
    private static Map<String, Contas> cpfContas = new HashMap<String, Contas>();

        int numero;
        String titular;
        String cpf;
        double saldo;

        //Construtor
        public Contas(int numero, String titular, String cpf) {
            this.numero = numero;
            this.titular = titular;
            this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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

    public String toString() {
            return "Titular:  " + titular + ", Numero: " + numero + ", CPF: " + cpf;
        }
}
