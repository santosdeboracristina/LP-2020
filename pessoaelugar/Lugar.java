package pessoaelugar;

public class Lugar {

    //atributos
    private String pais;
    private String idioma;
    private String moeda;

    //metodo construtor
    public Lugar(String pais, String idioma, String moeda) {
        this.pais = pais;
        this.idioma = idioma;
        this.moeda = moeda;
    }

    //get nome do pais
    public String getPais() {
        return pais;
    }

    //set nome do pais
    public void setPais(String pais) {
        this.pais = pais;
    }

    //get idioma
    public String getIdioma() {
        return idioma;
    }

    //set idioma
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    //get moeda
    public String getMoeda() {
        return moeda;
    }

    //set moeda
    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    //metodos
    public void falarfrances() {
        System.out.println("Na " + this.pais + " o idioma é o Francês - Bonjour!");
    }

    public void falaringles() {
        System.out.println("Nos " + this.pais + " o idioma é o Inglês - Hello!");
    }

    public String toString() {
        return "Pais:  " + pais + ", Idioma: " + idioma + ", Moeda: " + moeda;
    }

    public void informarmoeda() {
        System.out.println("A moeda é o: " + this.moeda);
        System.out.println("-----------------------------------------------");
    }


}
