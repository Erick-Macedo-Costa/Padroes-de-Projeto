package org.example;

import java.net.URI;
import java.util.List;
import java.util.function.Function;

public class ProcessarBoletos {

    private Function<URI, List<Boleto>> leituraRetorno;

    public ProcessarBoletos(Function<URI, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(URI nomeArquivo) {
        leituraRetorno.lerArquivo(nomeArquivo);
    }

    public void setLeituraRetorno(Function<URI, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

}
