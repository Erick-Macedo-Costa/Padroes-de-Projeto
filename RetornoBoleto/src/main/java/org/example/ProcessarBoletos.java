package org.example;

import java.net.URI;

public class ProcessarBoletos {
    private LeituraRetorno leituraRetorno;

    public ProcessarBoletos(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(URI nomeArquivo) {
        leituraRetorno.lerArquivo(nomeArquivo);
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

}
