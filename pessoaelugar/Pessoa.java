package pessoaelugar;

public class Pessoa {
    public String passaporte;
    public String nome;
    public String destino;

    public Pessoa(String passaporte, String nome, String destino) {
        this.passaporte = passaporte;
        this.nome = nome;
        this.destino = destino;

    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Viajante:  " + nome + ", Passaporte " + passaporte + ", Destino: " + destino;
    }
}
