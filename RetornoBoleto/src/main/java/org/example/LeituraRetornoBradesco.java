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

public class LeituraRetornoBradesco implements LeituraRetorno {
    @Override
    public List<Boleto> lerArquivo(URI nomeArquivo) {
        var boletos = new ArrayList<Boleto>();
        try {
            var lista = Files.readAllLines(Paths.get(nomeArquivo));
            for (var linha : lista) {
                var vetor = linha.split(";");
                var boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);
                var format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                var format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                boleto.setDataVencimento(LocalDate.parse(vetor[4], format));
                boleto.setDataPagamento(LocalDateTime.parse(vetor[5], format2));
                boleto.setCpfCliente(vetor[6]);
                boleto.setValor(Double.parseDouble(vetor[7]));
                boleto.setJuros(Double.parseDouble(vetor[8]));
                boleto.setMulta(Double.parseDouble(vetor[9]));
                boletos.add(boleto);
                System.out.println(boleto);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        return boletos;
    }

}
