package com.company;

import com.company.DAO.AnimalDAO;
import com.company.DAO.ConsultaDAO;
import com.company.DAO.MedicoDAO;
import com.company.DAO.ProprietarioDAO;
import com.company.model.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws ParseException {
//
//        //------------------Cadastra Médico------------------
//        List<Medico> medicos = new ArrayList<>();
//        Medico med2 = new Medico("20747082030", "pedro", "Teste", 5555555L, "neuro");
//        medicos.add(med2);
//
//        MedicoDAO medicoDAO = new MedicoDAO();
//        //medicoDAO.cadastrar(medicos);
//
//        System.out.println("------------------Lista Médicos------------------");
//        for (Medico medico: medicoDAO.listar()) {
//            System.out.println(medico.getNome());
//        }
//
//        //------------------Atualiza de arquivo json Medico------------------
//        List<Medico> listaMedico = medicoDAO.listar();
//        Medico med = new Medico("20747082030", "Stela", "Souza", 5555555L, "neuro");
//        listaMedico.add(med);
//        medicoDAO.atualizar(listaMedico);

        //------------------Cadastra Proprietario------------------
//        List<Proprietario> proprietarios = new ArrayList<>();
//        Proprietario proprietario = new Proprietario("20747082030", "Godofredo", "Peppa", LocalDate.of(1998,07,23),"Rua dos Bobos, 0","56634639");
//        proprietarios.add(proprietario);
//
//        ProprietarioDAO proprietarioDAO = new ProprietarioDAO();
//        proprietarioDAO.cadastrar(proprietarios);
//
//        System.out.println("------------------Lista Proprietarios------------------");
//        for (Proprietario pro: proprietarioDAO.listar()) {
//            System.out.println(pro.getDataDeNascimento());
//        }
//
//        //------------------Atualiza de arquivo json Proprietario------------------
//        List<Proprietario> listaProprietario = proprietarioDAO.listar();
//        listaProprietario.add(proprietario);
//        proprietarioDAO.atualizar(listaProprietario);

//        List<Animal> animais = new ArrayList<>();
//        Proprietario proprietario3 = new Proprietario("20747082030", "Alesandro Animal", "Peppa", LocalDate.of(1998,07,23),"Rua dos Bobos, 0","56634639");
//        AnimalDeFazenda animalDeFazenda = new AnimalDeFazenda("Cabrito","Quarto de Milha","Preta",LocalDate.of(2020,7,10),"Paloma",proprietario3);
//        animais.add(animalDeFazenda);
//
//        AnimalDAO animalDAO = new AnimalDAO();
//        //animalDAO.cadastrar(animais);
//
//        System.out.println("------------------Lista Proprietarios------------------");
//        for (Animal ani: animalDAO.listar()) {
//            System.out.println(ani.getProprietario().getNome());
//        }

        //------------------Atualiza de arquivo json Proprietario------------------
//        List<Animal> listaAnimal = animalDAO.listar();
//        Proprietario proprietario4 = new Proprietario("20747082030", "Josicleide", "Peppa", LocalDate.of(1998,07,23),"Rua dos Bobos, 0","56634639");
//        AnimalDeFazenda animalDeFazenda2 = new AnimalDeFazenda("ovelha","Quarto de Milha","branca",LocalDate.of(2020,7,10),"Paloma",proprietario4);
//
//        listaAnimal.add(animalDeFazenda2);
//        animalDAO.atualizar(listaAnimal);


//        List<Consulta> consultas = new ArrayList<>();
//        Proprietario proprietario = new Proprietario("20747082030", "Alesandro", "Peppa", LocalDate.of(1998,07,23),"Rua dos Bobos, 34","56634639");
//        AnimalDeFazenda animalDeFazenda = new AnimalDeFazenda("Cabrito","Quarto de Milha","Preta",LocalDate.of(2020,7,10),"Paloma",proprietario);
//        Medico medico = new Medico("20747082030", "pedro", "Teste", 5555555L, "neuro");
//
//        Consulta consulta = new Consulta(LocalDate.of(1998,07,23),"dor de barriga", "virosa", "remedios e repouso",medico,animalDeFazenda);
//        consultas.add(consulta);
//        System.out.println(consultas);
//
//        ConsultaDAO consultaDAO = new ConsultaDAO();
//        consultaDAO.cadastrar(consultas);

//        System.out.println("------------------Atualizar Consulta------------------");
//        for (Consulta con: consultaDAO.listar()) {
//            System.out.println(con.getAnimal().getProprietario().getCpf());
//        }

        ConsultaDAO consultaDAO = new ConsultaDAO();
//        List<Consulta> listaConsulta = consultaDAO.listar();
//        Proprietario proprietario = new Proprietario("20747082030", "Alessandro", "Lozano", LocalDate.of(1998,07,23),"Rua das ameixas, 66","56634639");
//        AnimalDeFazenda animalDeFazenda = new AnimalDeFazenda("Bode","Quarto de Milha","Marrom",LocalDate.of(2020,7,10),"Lucifer",proprietario);
//        Medico medico = new Medico("20747082030", "pedro", "Teste", 5555555L, "neuro");
//
//        Consulta consulta = new Consulta(LocalDateTime.now(),"machucado", "estresse", "remedios",medico,animalDeFazenda);
//        listaConsulta.add(consulta);
//        consultaDAO.atualizar(listaConsulta);

//        System.out.println("------------------ Lista de consultas => ordenadas em ordem crescente por proprietário ------------------");
//        List<Consulta> listaConsulta = consultaDAO.getByProprietario(consultaDAO.listar());
//        for (Consulta consulta:listaConsulta) {
//            System.out.println(consulta.getAnimal().getProprietario().getNome()+" -> "+consulta);
//        }

//        System.out.println("------------------ Lista de consultas => por nome de animal ordanada em ordem decrescente por data ------------------");
//        List<Consulta> listaConsultaAnimal = consultaDAO.getPacienteByData(consultaDAO.listar(),"Mimosa");
//        for (Consulta consultaByAnimal:listaConsultaAnimal) {
//            System.out.println(consultaByAnimal.getAnimal().getNome()+" -> "+consultaByAnimal);
//        }

//        System.out.println("------------------ Lista de consultas => atribuidas a cada medico ------------------");
//        Map<Object, List<Consulta>> listaConsultaMedico = consultaDAO.getTotalConsulta(consultaDAO.listar());
//        System.out.println(listaConsultaMedico);
//        for (Consulta consultaByAnimal:listaConsultaAnimal) {
//            System.out.println(consultaByAnimal.getAnimal().getNome()+" -> "+consultaByAnimal);
//        }

        System.out.println("------------------ Lista de consultas => consultas do dia ordenada em ordem crescente por data  ------------------");
        List<Consulta> listaConsultasData = consultaDAO.listaConsultaByData(consultaDAO.listar(),LocalDate.of(2021,9,15));

        System.out.println("Agenda de consulta do dia");
        for (Consulta consultaByData:listaConsultasData) {
            System.out.println(" \n "+consultaByData.getAnimal().getNome()+"--> \n Médico=>"+consultaByData.getMedico()+ " \n  Paciente=>"+consultaByData.getAnimal()+ " \n  Proprietário=>"+consultaByData.getAnimal().getProprietario()+"\n");
        }

    }
}
