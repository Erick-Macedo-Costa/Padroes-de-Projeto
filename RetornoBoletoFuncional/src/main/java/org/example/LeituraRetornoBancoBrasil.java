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
import java.util.Arrays;
import java.util.List;

public class LeituraRetornoBancoBrasil extends ProcessarBoletos {

    Boleto processarLinha(String[] vetor) {
                var boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);
                var format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                boleto.setDataVencimento(LocalDate.parse(vetor[2],format));
                boleto.setDataPagamento(LocalDate.parse(vetor[3],format).atTime(0,0));
                boleto.setCpfCliente(vetor[4]);
                boleto.setValor(Double.parseDouble(vetor[5]));
                boleto.setJuros(Double.parseDouble(vetor[6]));
                boleto.setMulta(Double.parseDouble(vetor[7]));
       return boleto;

    }
}
