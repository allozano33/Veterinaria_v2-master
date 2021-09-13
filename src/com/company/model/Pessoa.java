package com.company.model;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Pessoa {
    private String cpf;
    private String nome;
    private String sobrenome;

    public Pessoa(){

    }

    public Pessoa(String cpf, String nome, String sobrenome) throws ParseException {
        this.cpf = validaCpf(cpf);
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String validaCpf(String cpf) throws ParseException {
        MaskFormatter mf = new MaskFormatter("###.###.###-##");
        mf.setValueContainsLiteralCharacters(false);
        return mf.valueToString(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
