package classes;

import classes.Setor;

public class Gabinete extends Setor {
    private Juiz juizResponsavel; 
    private Processo processo; 

    public Gabinete(Juiz juizResponsavel) {
        this.juizResponsavel = juizResponsavel;
    }

    public Juiz getJuizResponsavel() {
        return juizResponsavel;
    }

    public void setJuizResponsavel(Juiz juizResponsavel) {
        this.juizResponsavel = juizResponsavel;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }
}