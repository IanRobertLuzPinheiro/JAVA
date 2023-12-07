package classes;

import classes.Estado;

public class Fiscalizacao extends Estado {
    private String orgaoFiscalizador;

    public Fiscalizacao(String nome, String orgaoFiscalizador) {
        super(nome);
        this.orgaoFiscalizador = orgaoFiscalizador;
    }

    public String getOrgaoFiscalizador() {
        return orgaoFiscalizador;
    }

    public void setOrgaoFiscalizador(String orgaoFiscalizador) {
        this.orgaoFiscalizador = orgaoFiscalizador;
    }
}
