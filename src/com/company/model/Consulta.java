package com.company.model;

import java.time.LocalDate;

public class Consulta {
    private LocalDate dataHora = LocalDate.now();
    private String motivo;
    private String diagnostico;
    private String tratamento;
    private Medico medico;
    private Animal animal;

    public Consulta(LocalDate dataHora, String motivo, String diagnostico, String tratamento, Medico medico, Animal animal) {
        this.dataHora = dataHora;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
        this.medico = medico;
        this.animal = animal;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "{" +
                "\"dataHora\":\"" + dataHora + "\""  +
                ", \" motivo\":\"" + motivo + "\""  +
                ", \"diagnostico\":\"" + diagnostico + "\""  +
                ", \"tratamento\":\"" + tratamento + "\""  +
                ", \"medico\":" + medico +
                ", \"animal\":" + animal +
                '}';
    }
}
