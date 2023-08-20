package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Boleto {
    private int id;
    private String codBanco;
    private LocalDate dataVencimento;
    private LocalDateTime dataPagamento;
    private String cpfCliente;
    private double valor;
    private double multa;
    private double juros;
    private String agencia;
    private String contaBancaria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "Boleto: " + id +
                "\n codBanco: " + codBanco +
                "\n dataVencimento: " + dataVencimento +
                "\n dataPagamento: " + dataPagamento +
                "\n cpfCliente: " + cpfCliente +
                "\n valor: " + valor +
                "\n multa: " + multa +
                "\n juros: " + juros +
                "\n agencia: " + agencia +
                "\n contaBancaria: " + contaBancaria;

    }
}
