package com.company;

import com.company.DAO.MedicoDAO;
import com.company.model.AnimaisDeFazenda;
import com.company.model.AnimaisDomesticos;
import com.company.model.Medico;
import com.company.model.Proprietario;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

        //------------------Cadastra Médico------------------
        List<Medico> medicos = new ArrayList<>();
        Medico medico2 = new Medico("20747082030", "Wagner", "Teste", 5555555L, "neuro");
        medicos.add(medico2);

        MedicoDAO medicoDAO = new MedicoDAO();

        System.out.println("------------------Lista Médicos------------------");
        for (Medico medico: medicoDAO.listar()) {
            System.out.println(medico.getNome());
        }

        //------------------Atualiza de arquivo json------------------
        List<Medico> listaMedico = medicoDAO.listar();
        listaMedico.add(medico2);
        medicoDAO.cadastrar(listaMedico);
    }

//        System.out.println(medico.getCpf());
//        Proprietario proprietario = new Proprietario("20747082030", "Godofredo", "Peppa", LocalDate.of(1998,07,23),"Rua dos Bobos, 0","56634639");
//        AnimaisDeFazenda animaisDeFazenda = new AnimaisDeFazenda("Cavalo","Quarto de Milha","Marrom",LocalDate.of(2020,7,10),"Josefa",proprietario);
//        AnimaisDomesticos animaisDomesticos = new AnimaisDomesticos("Gato","Siames","Caramelo",LocalDate.of(2018,11,9),"kiko",proprietario);
//        System.out.println(animaisDeFazenda);
}
