package com.company.model;

import java.time.LocalDate;

public class Animal {

    private String numeroPaciente = String.valueOf(Math.random());
    private String especie;
    private String raca;
    private String cor;
    private LocalDate dataDeNascimento;
    private String nome;
    private Proprietario proprietario;

    public Animal(){

    }

    public Animal(String especie, String raca, String cor, LocalDate dataDeNascimento, String nome, Proprietario proprietario) {
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "{" +
                " \"numeroPaciente\":\"" + numeroPaciente + "\""  +
                ", \"especie\":\"" + especie + "\""  +
                ", \"raca\":\"" + raca + "\""  +
                ", \"cor\":\"" + cor + "\""  +
                ", \"dataDeNascimento\":\"" + dataDeNascimento + "\"" +
                ", \"nome=\":\"" + nome + "\""  +
                ", \"proprietario\":" + proprietario +
                "}";
    }

    public String getNumeroPaciente() {
        return numeroPaciente;
    }

    public void setNumeroPaciente(String numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}
