package com.company.model;

import java.text.ParseException;
import java.time.LocalDate;

public class Proprietario extends Pessoa{

    private LocalDate dataDeNascimento;
    private String endereco;
    private String telefoneContato;

    public Proprietario(String cpf, String nome, String sobrenome, LocalDate dataDeNascimento, String endereco, String telefoneContato) throws ParseException {
        super(cpf, nome, sobrenome);
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
