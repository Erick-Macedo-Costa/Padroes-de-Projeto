package org.example;

import java.net.URI;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProcessarBoletos {

    private Function<URI, List<Boleto>> leituraRetorno;

    public ProcessarBoletos(Function<URI, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(URI nomeArquivo) {
//        setLeituraRetorno(leituraRetorno);
//        Predicate<Boleto> temMulta = b -> b.getMulta() > 0;
//        var naoTemMulta = temMulta.negate();
        var lista = leituraRetorno.apply(nomeArquivo);
        lista.forEach(System.out::println);
    }

    public void setLeituraRetorno(Function<URI, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

}
