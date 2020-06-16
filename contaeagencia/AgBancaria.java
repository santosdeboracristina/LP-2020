package contaeagencia;

import java.util.*;

public class AgBancaria {

    private static List<Conta> contas = new ArrayList<>();
    private static Map<String, Conta> titularConta = new HashMap<String, Conta>();
    private static Map<String, Conta> numeroConta = new HashMap<String, Conta>();
    private static Map<String, Conta> cpfConta = new HashMap<String, Conta>();

    public static void main(String[] args) {

        //ArrayList<String> contas = new ArrayList()
        Conta conta = new Conta("1234","Debora","000.111.222.33",200);
        contas.add(conta);
        titularConta.put(conta.getTitular(), conta);
        numeroConta.put(conta.getNumero(), conta);
        cpfConta.put(conta.getCpf(), conta);

        conta = new Conta("12345","Adriana","111.222.333-44",300);
        contas.add(conta);
        titularConta.put(conta.getTitular(), conta);
        numeroConta.put(conta.getNumero(), conta);
        cpfConta.put(conta.getCpf(), conta);

        conta = new Conta("123456","Hazel","444.555.666.77",400);
        contas.add(conta);
        titularConta.put(conta.getTitular(), conta);
        numeroConta.put(conta.getNumero(), conta);
        cpfConta.put(conta.getCpf(), conta);



        // Imprimindo os dados
        System.out.println(contas.toString());

        // Imprimindo por nome de titular
        System.out.println("\nTitulares: ");
        for (String key : titularConta.keySet()) {
            //Usar a chave para saber o valor
            Conta value = titularConta.get(key);
            System.out.println(key);
        }

        // Imprimindo por numero de conta
        System.out.println("\nContas Cadastradas: ");
        for (String key : numeroConta.keySet()) {
            //Usar a chave para saber o valor
            Conta value = numeroConta.get(key);
            System.out.println(key);
        }

        // Imprimindo Marcas dos Carros
        System.out.println("\nCpf Cadastrados: ");
        for (String key : cpfConta.keySet()) {
            //Usar a chave para saber o valor
            Conta value = cpfConta.get(key);
            System.out.println(key);
        }

        //buscando por titular
        System.out.println("\n");
        Scanner ler = new Scanner(System.in);
        String placa;
        System.out.printf("Digite o nome do titular:\n");
        placa = ler.nextLine();

        for (String key : titularConta.keySet()) {
            if (key.equalsIgnoreCase(placa)) {
                Conta value = titularConta.get(placa);
                System.out.println(key + " : " + value);
                break;
            }
        }
    // buscando por numero de conta
        System.out.println("\n");
        Scanner r = new Scanner(System.in);
        String preco;
        System.out.printf("Digite o numero da conta:\n");
        preco = r.nextLine();

        for (String key : numeroConta.keySet()) {
            if(key.equalsIgnoreCase(preco)) { //comparar um conteúdo de texto de um objeto com metodo equals
                Conta value = numeroConta.get(preco);
                System.out.println(key + " : " + value);
                break;
            }
        }

        // buscando por cpf do titular
        System.out.println("\n");
        Scanner seila = new Scanner(System.in);
        String marca;
        System.out.printf("Digite o cpf:\n");
        marca = seila.nextLine();

        for (String key : cpfConta.keySet()) {
            if (key.equalsIgnoreCase(marca)) {
                Conta value = cpfConta.get(marca);
                System.out.println(key + " : " + value);
                break;
            }
        }
    }
}
