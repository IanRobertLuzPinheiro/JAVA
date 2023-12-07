package classes;

public class Juiz {
    private PapelJuiz papel;

    // Construtor, getters e setters
    public Juiz(PapelJuiz papel) {
        this.papel = papel;
    }

    public PapelJuiz getPapel() {
        return papel;
    }

    public void setPapel(PapelJuiz papel) {
        this.papel = papel;
    }
}