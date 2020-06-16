package meupacoteste;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Conta {
    ///atributos que todo conta tem

    int numero;
    String titular;
    String cpf;
    double saldo;
    double limite;

    public Conta(int numero, String titular, String cpf, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.cpf = cpf;
        this.saldo = saldo;
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

    //ARRAY
    public static List<Conta> contas = new ArrayList<>();

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