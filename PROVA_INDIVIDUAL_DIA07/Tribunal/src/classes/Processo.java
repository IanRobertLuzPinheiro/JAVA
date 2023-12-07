package classes;

import java.util.ArrayList;
import java.util.List;

public class Processo {
    private Parte parte;
    private Advogado advogado;
    private List<Juiz> juizes = new ArrayList<>();
    private Setor setorAtual;

    public Processo(Parte parte, Advogado advogado) {
        this.parte = parte;
        this.advogado = advogado;
    }

    public Parte getParte() {
        return parte;
    }

    public void setParte(Parte parte) {
        this.parte = parte;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    }

    public List<Juiz> getJuizes() {
        return juizes;
    }

    public void setJuizes(List<Juiz> juizes) {
        this.juizes = juizes;
    }

    public Setor getSetorAtual() {
        return setorAtual;
    }

    public void setSetorAtual(Setor setorAtual) {
        this.setorAtual = setorAtual;
    }
}
