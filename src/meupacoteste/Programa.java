package meupacoteste;

import java.util.ArrayList;
import java.util.Collections;

class Programa {
    //método principal.
    public static void main(String[] args) {

        //IMPRIMIR A LISTA DE CONTA - EP4 10-06-20
        System.out.println("*--------------------------------------------*");
        ArrayList<String> contas = new ArrayList<>();
        contas.add("Henry");
        contas.add("Hazel");
        contas.add("Jules");
        contas.add("Grady");
        System.out.println("-----Sem o sort-----");
        System.out.println(contas);
        Collections.sort(contas);
        System.out.println("-----Com o sort-----");
        System.out.println(contas);
        System.out.println("-----Inserindo o nome Cindy na posicao do nome Hazel-----");
        contas.add(1, "Cindy");
        System.out.println(contas);

        //Remover o nome da que esta na posicao 1 da lista
        contas.remove(1);
        System.out.println("----Imprimir nova lista com o item removido----");
        System.out.println(contas);

        System.out.println("*--------------------------------------------*");

        //Testando arraylist com as contas de banco
      // Conta c1 = new Conta(121314, "Rebeca","398.479.83-90",300);
       //contas.add(c1);
       //System.out.println(contas);


        //criando a segunda conta
        Conta minhaConta;
        minhaConta = new Conta(1234, "Debora", "13431356787",100);

        Conta minhaConta2;
        minhaConta2 = new Conta(5678,"Carol","378638767",300);

        //alterando os valores de minhaConta.
        minhaConta.titular = "Debora";
        minhaConta.cpf = "13431356787";
        minhaConta.numero = 1234;
        minhaConta.saldo = 100;


        //alterando os valores de minhaConta2.
        minhaConta2.titular = "Carol";
        minhaConta.cpf = "378638767";
        minhaConta2.numero = 5678;
        minhaConta2.saldo = 300;

        //printar nome e cpf do titular da conta1
        System.out.println("Titular: " + minhaConta.titular);
        System.out.println("CPF: " + minhaConta.cpf);

        //printar numero da conta1
        System.out.println("Conta número: " + minhaConta.numero);

        //verificar saldo atual da conta1
        System.out.println("Saldo atual é de: " + minhaConta.saldo);

        //saca quanto quiser da conta 1
        minhaConta.saca(60);
        System.out.println("Depois do saque agora seu saldo é de : " + minhaConta.saldo);

        //deposita quantia em reais na conta 1
        minhaConta.deposita(999);
        System.out.println("Depois do depósito, agora seu saldo é de: " + minhaConta.saldo);

        //transfere um valor para outra conta
        // minhaConta.transfere(120);
        //System.out.println("Depois da transferência, seu saldo é de: " + minhaConta.saldo);

        //******************************************

        //printar linha pra separar as contas
        System.out.println("-------------------------------------------------------");


        //printar nome do titular da conta2
        System.out.println("Titular: " + minhaConta2.titular);

        //printar numero da conta2
        System.out.println("Conta número: " + minhaConta2.numero);

        //verificar saldo atual da conta2
        System.out.println("Saldo atual é de: " + minhaConta2.saldo);

        //saca quanto quiser da conta 2
        minhaConta2.saca(60);
        System.out.println("Depois do saque agora seu saldo é de : " + minhaConta2.saldo);

        //deposita quantia em reais na conta 2
        minhaConta2.deposita(120);
        System.out.println("Depois do depósito, agora seu saldo é de: " + minhaConta2.saldo);

        //transfere um valor para outra conta
        // minhaConta.transfere(120);
        //System.out.println("Depois da transferência, seu saldo é de: " + minhaConta.saldo);
    }
}

