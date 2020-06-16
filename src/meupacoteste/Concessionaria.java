package meupacoteste;
import java.util.*;

public class Concessionaria {

    private static List<Carro> carros = new ArrayList<>();
    private static Map<String, Carro> placaCarro = new HashMap<String, Carro>();
    private static Map<String, Carro> precoCarro = new HashMap<String, Carro>();
    private static Map<String, Carro> marcaCarro = new HashMap<String, Carro>();

    public static void main(String[] args) {

        //ArrayList<String> carros = new ArrayList()
        Carro carro = new Carro("Tesla","Cybertruck","ELLONMUSK01", "100000.0");
        carros.add(carro);
        placaCarro.put(carro.getPlaca(), carro);
        precoCarro.put(carro.getPreco(), carro);
        marcaCarro.put(carro.getMarca(), carro);

        carro = new Carro("Lamborghini","Veneno Roadster","LAMBOR02", "200000.0");
        carros.add(carro);
        placaCarro.put(carro.getPlaca(), carro);
        precoCarro.put(carro.getPreco(), carro);
        marcaCarro.put(carro.getMarca(), carro);

        carro = new Carro("BMW","Gran Coupé","BMW", "300000.0");
        carros.add(carro);
        placaCarro.put(carro.getPlaca(), carro);
        precoCarro.put(carro.getPreco(), carro);
        marcaCarro.put(carro.getMarca(), carro);


        // Imprimindo os dados
        System.out.println(carros.toString());

        // Imprimindo Placa dos Carros
        System.out.println("\nPlacas cadastradas: ");
        for (String key : placaCarro.keySet()) {
            //Usar a chave para saber o valor
            Carro value = placaCarro.get(key);
            System.out.println(key);
        }

        // Imprimindo Preco dos Carros
        System.out.println("\nPrecos cadastrados: ");
        for (String key : precoCarro.keySet()) {
            //Usar a chave para saber o valor
            Carro value = precoCarro.get(key);
            System.out.println(key);
        }

        // Imprimindo Marcas dos Carros
        System.out.println("\nMarcas cadastradas: ");
        for (String key : marcaCarro.keySet()) {
            //Usar a chave para saber o valor
            Carro value = marcaCarro.get(key);
            System.out.println(key);
        }

        System.out.println("\n");
        Scanner ler = new Scanner(System.in);
        String placa;
        System.out.printf("Digite o número da placa:\n");
        placa = ler.nextLine();

        for (String key : placaCarro.keySet()) {
            if (key.equalsIgnoreCase(placa)) {
                Carro value = placaCarro.get(placa);
                System.out.println(key + " : " + value);
                break;
            }
        }

        System.out.println("\n");
        Scanner r = new Scanner(System.in);
        String preco;
        System.out.printf("Digite o preco do carro:\n");
        preco = r.nextLine();

        for (String key : precoCarro.keySet()) {
            if(key.equalsIgnoreCase(preco)) { //comparar um conteúdo de texto de um objeto com metodo equals
                Carro value = precoCarro.get(preco);
                System.out.println(key + " : " + value);
                break;
            }
        }

        System.out.println("\n");
        Scanner seila = new Scanner(System.in);
        String marca;
        System.out.printf("Digite a marca do carro:\n");
        marca = seila.nextLine();

        for (String key : marcaCarro.keySet()) {
            if (key.equalsIgnoreCase(marca)) {
                Carro value = marcaCarro.get(marca);
                System.out.println(key + " : " + value);
                break;
            }
        }
    }
}
