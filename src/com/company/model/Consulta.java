package com.company.model;

import java.time.LocalDate;

public class Consulta {
    private LocalDate dataHora = LocalDate.now();
    private String motivo;
    private String diagnostico;
    private String tratamento;
    private Medico medico;

    public Consulta(String motivo, String diagnostico, String tratamento, Medico medico) {
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "dataHora=" + dataHora +
                ", motivo='" + motivo + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamento='" + tratamento + '\'' +
                ", medico=" + medico +
                '}';
    }
}
