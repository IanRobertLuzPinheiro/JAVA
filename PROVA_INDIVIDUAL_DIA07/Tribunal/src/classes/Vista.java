package classes;

class Vista {
    private Juiz juizSolicitante; 
    private Processo processo; 
    private boolean emAndamento; 

    public Vista(Juiz juizSolicitante, Processo processo) {
        this.juizSolicitante = juizSolicitante;
        this.processo = processo;
        this.emAndamento = true;
    }

    public Juiz getJuizSolicitante() {
        return juizSolicitante;
    }

    public void setJuizSolicitante(Juiz juizSolicitante) {
        this.juizSolicitante = juizSolicitante;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public boolean isEmAndamento() {
        return emAndamento;
    }

    public void encerrarVista() {
        this.emAndamento = false;
    }
}
