package meupacoteste;

public class Carro {

    private String modelo;
    private String marca;
    private String placa;
    private String preco;

    //construtor
    public Carro(String marca, String Modelo, String placa, String preco){
        modelo = Modelo;
        this.marca = marca;
        this.placa = placa;
        this.preco = preco;
    }

    //setters
    public void setMarca(String ma){
        marca=ma;
    }

    public void setModelo(String m){
        modelo=m;
    }

    public void setPreco(String p){
        preco=p;
    }

    public void setPlaca(String placa){
        this.placa=placa;
    }

    //getters

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String getPlaca(){
        return placa;
    }

    public String getPreco(){
        return preco;
    }

    public String toString() {
        return "Marca:  " + marca + ", Modelo: " + modelo + ", Preco: " + preco;
    }

    //metodos

    //start
    public void setLigar() {
        System.out.println("ON");
    }

    //turn it off
    public	void desligar() {
        System.out.println("OFF");
    }

}
