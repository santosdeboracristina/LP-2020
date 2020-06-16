package pessoaelugar;

import java.util.*;

public class AgenciaViagem {
    private static List<Pessoa> pessoas = new ArrayList<>();
    private static Map<String, Pessoa> nomePessoa = new HashMap<String, Pessoa>();
    private static Map<String, Pessoa> passaportePessoa = new HashMap<String, Pessoa>();
    private static Map<String, Pessoa> destinoPessoa = new HashMap<String, Pessoa>();

    private static List<Lugar> lugares = new ArrayList<>();
    private static Map<String, Lugar> paisLugar = new HashMap<String, Lugar>();
    private static Map<String, Lugar> idiomaLugar = new HashMap<String, Lugar>();
    private static Map<String, Lugar> moedaLugar = new HashMap<String, Lugar>();


    public static void main(String[] args) {

        //ArrayList<String> LUGARES = new ArrayList()
        Lugar lugar = new Lugar("Italia", "Italiano", "Euro");
        lugares.add(lugar);
        paisLugar.put(lugar.getPais(), lugar);
        idiomaLugar.put(lugar.getIdioma(), lugar);
        moedaLugar.put(lugar.getMoeda(), lugar);

        lugar = new Lugar("Estados Unidos","Ingles","Dolar");
        lugares.add(lugar);
        paisLugar.put(lugar.getPais(), lugar);
        idiomaLugar.put(lugar.getIdioma(), lugar);
        moedaLugar.put(lugar.getMoeda(), lugar);


        lugar = new Lugar("Japao","Japones","Iene");
        lugares.add(lugar);
        paisLugar.put(lugar.getPais(), lugar);
        idiomaLugar.put(lugar.getIdioma(), lugar);
        moedaLugar.put(lugar.getMoeda(), lugar);


        //ArrayList<String> PESSOAS = new ArrayList()
        Pessoa pessoa = new Pessoa("A1B2C3", "Debora Cristina", "Franca");
        pessoas.add(pessoa);
        nomePessoa.put(pessoa.getNome(), pessoa);
        passaportePessoa.put(pessoa.getPassaporte(), pessoa);
        destinoPessoa.put(pessoa.getDestino(), pessoa);

        pessoa = new Pessoa("B3C3D4", "Matheus Antero", "Espanha");
        pessoas.add(pessoa);
        nomePessoa.put(pessoa.getNome(), pessoa);
        passaportePessoa.put(pessoa.getPassaporte(), pessoa);
        destinoPessoa.put(pessoa.getDestino(), pessoa);

        pessoa = new Pessoa("E5F6G7", "Felipe Marini", "Suecia");
        pessoas.add(pessoa);
        nomePessoa.put(pessoa.getNome(), pessoa);
        passaportePessoa.put(pessoa.getPassaporte(), pessoa);
        destinoPessoa.put(pessoa.getDestino(), pessoa);

        // Imprimindo os dados de pessoas
        System.out.println(pessoas.toString());

        // Imprimindo os dados de LUGARES
        System.out.println(lugares.toString());

        // Imprimindo os nomes dos viajantes
        System.out.println("\nViajantes Cadastrados: ");
        for (String key : nomePessoa.keySet()) {
            //Usar a chave para saber o valor
            Pessoa value = nomePessoa.get(key);
            System.out.println(key);
        }

        // Imprimindo passaportes
        System.out.println("\n*--------------------------*");
        System.out.println("\nPassaportes Cadastrados: ");
        for (String key : passaportePessoa.keySet()) {
            //Usar a chave para saber o valor
            Pessoa value = passaportePessoa.get(key);
            System.out.println(key);
        }
        System.out.println("*--------------------------*");

        // Imprimindo destinos
        System.out.println("\nDestinos Cadastrados: ");
        for (String key : destinoPessoa.keySet()) {
            //Usar a chave para saber o valor
            Pessoa value = destinoPessoa.get(key);
            System.out.println(key);
        }

        // Imprimindo lista de lugares
        System.out.println("\nLugares Cadastrados: ");
        for (String key : paisLugar.keySet()) {
            //Usar a chave para saber o valor
            Lugar value = paisLugar.get(key);
            System.out.println(key);
        }

        //buscando por viajante
        System.out.println("\n");
        Scanner ler = new Scanner(System.in);
        String nome;
        System.out.printf("Digite o nome do viajante:\n");
        nome = ler.nextLine();

        for (String key : nomePessoa.keySet()) {
            if (key.equalsIgnoreCase(nome)) {
                Pessoa value = nomePessoa.get(nome);
                System.out.println(key + " : " + value);
                break;
            }
        }

        //buscando por numero do passaporte
        System.out.println("\n");
        Scanner r = new Scanner(System.in);
        String passaporte;
        System.out.printf("Digite o número do passaporte:\n");
        passaporte = r.nextLine();

        for (String key : passaportePessoa.keySet()) {
            if (key.equalsIgnoreCase(passaporte)) {
                Pessoa value = passaportePessoa.get(passaporte);
                System.out.println(key + " : " + value);
                break;
            }
        }

        //buscando por destinos
        System.out.println("\n");
        Scanner seila = new Scanner(System.in);
        String destino;
        System.out.printf("Digite o destino pra saber quem vai pra la :D:\n");
        destino = seila.nextLine();

        for (String key : destinoPessoa.keySet()) {
            if (key.equalsIgnoreCase(destino)) {
                Pessoa value = destinoPessoa.get(destino);
                System.out.println(key + " : " + value);
                break;
            }
        }

        //BUSCANDO POR NOME DO PAIS
        System.out.println("\n");
        Scanner read = new Scanner(System.in);
        String pais;
        System.out.printf("Digite o nome do pais:\n");
        pais = read.nextLine();

        for (String key : paisLugar.keySet()) {
            if (key.equalsIgnoreCase(pais)) {
                Lugar value = paisLugar.get(pais);
                System.out.println(key + " : " + value);
                break;
            }
        }

        //BUSCANDO POR IDIOMA
        System.out.println("\n");
        Scanner h = new Scanner(System.in);
        String idioma;
        System.out.printf("Digite o idioma:\n");
        idioma = h.nextLine();

        for (String key : idiomaLugar.keySet()) {
            if (key.equalsIgnoreCase(idioma)) {
                Lugar value = idiomaLugar.get(idioma);
                System.out.println(key + " : " + value);
                break;
            }
        }

        //BUSCANDO POR MOEDA
        System.out.println("\n");
        Scanner c = new Scanner(System.in);
        String moeda;
        System.out.printf("Digite a moeda:\n");
        moeda = c.nextLine();

        for (String key : moedaLugar.keySet()) {
            if (key.equalsIgnoreCase(moeda)) {
                Lugar value = moedaLugar.get(moeda);
                System.out.println(key + " : " + value);
                break;
            }
        }
    }
}

