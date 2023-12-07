package classes;

public class Recurso {
    private Parte parteRecorrente; 
    private Processo processoOriginal; 
    private boolean aceito; 

    public Recurso(Parte parteRecorrente, Processo processoOriginal) {
        this.parteRecorrente = parteRecorrente;
        this.processoOriginal = processoOriginal;
        this.aceito = false;
    }

    public Parte getParteRecorrente() {
        return parteRecorrente;
    }

    public void setParteRecorrente(Parte parteRecorrente) {
        this.parteRecorrente = parteRecorrente;
    }

    public Processo getProcessoOriginal() {
        return processoOriginal;
    }

    public void setProcessoOriginal(Processo processoOriginal) {
        this.processoOriginal = processoOriginal;
    }

    public boolean isAceito() {
        return aceito;
    }

    public void aceitarRecurso() {
        this.aceito = true;
    }
}
