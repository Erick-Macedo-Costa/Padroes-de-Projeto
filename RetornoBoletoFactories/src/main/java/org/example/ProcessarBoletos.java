package org.example;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProcessarBoletos {


    public void processar(URI nomeArquivo) {
        Function<String[],Boleto>  processarLinha=newLerArquivoRetorno(nomeArquivo);
        var boletos = new ArrayList<Boleto>();
        try {
            var lista = Files.readAllLines(Paths.get(nomeArquivo));
            for (var linha : lista) {
                var vetor = linha.split(";");
                var boleto = processarLinha.apply(vetor);

                boletos.add(boleto);
                System.out.println(boleto);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        boletos.forEach(System.out::println);

    }

    private Function<String[],Boleto> newLerArquivoRetorno(URI nomeArquivo){
        if (nomeArquivo.toString().contains("banco-brasil")) {
            return LeituraRetornoBancoBrasil::processarLinha;
        }
            return LeituraRetornoBradesco::processarLinha;

    }

}
