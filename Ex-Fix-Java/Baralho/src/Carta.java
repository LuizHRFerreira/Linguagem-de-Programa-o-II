import java.util.Arrays;

public class Carta {

    private String nome;
    private String naipe;

    public Carta(String nome, String naipe) {
        this.nome = nome;
        this.naipe = naipe;
    }

    public String getNome() {
        return nome;
    }

    public String getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return nome + " de " + naipe;
    }

}