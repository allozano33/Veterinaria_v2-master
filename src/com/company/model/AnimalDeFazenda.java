package com.company.model;

import java.time.LocalDate;

public class AnimalDeFazenda extends Animal {

    public AnimalDeFazenda(String especie, String raca, String cor, LocalDate dataDeNascimento, String nome, Proprietario proprietario) {
        super(especie, raca, cor, dataDeNascimento, nome, proprietario);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
