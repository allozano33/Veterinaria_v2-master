package com.company;

import com.company.DAO.AnimalDAO;
import com.company.DAO.MedicoDAO;
import com.company.DAO.ProprietarioDAO;
import com.company.model.Animal;
import com.company.model.AnimalDeFazenda;
import com.company.model.Medico;
import com.company.model.Proprietario;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
//
//        //------------------Cadastra Médico------------------
//        List<Medico> medicos = new ArrayList<>();
//        Medico medico2 = new Medico("20747082030", "Rafael", "Teste", 5555555L, "neuro");
//        medicos.add(medico2);
//
//        MedicoDAO medicoDAO = new MedicoDAO();
//        medicoDAO.cadastrar(medicos);
//
//        System.out.println("------------------Lista Médicos------------------");
//        for (Medico medico: medicoDAO.listar()) {
//            System.out.println(medico.getNome());
//        }
//
//        //------------------Atualiza de arquivo json Medico------------------
//        List<Medico> listaMedico = medicoDAO.listar();
//        Medico medico3 = new Medico("20747082030", "Alessandro", "Souza", 5555555L, "neuro");
//        listaMedico.add(medico3);
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

        List<Animal> animais = new ArrayList<>();
        Proprietario proprietario3 = new Proprietario("20747082030", "João Animal", "Peppa", LocalDate.of(1998,07,23),"Rua dos Bobos, 0","56634639");
        AnimalDeFazenda animalDeFazenda = new AnimalDeFazenda("Vaca","Quarto de Milha","Preta",LocalDate.of(2020,7,10),"Paloma",proprietario3);
        animais.add(animalDeFazenda);

        AnimalDAO animalDAO = new AnimalDAO();
        animalDAO.cadastrar(animais);

//        System.out.println("------------------Lista Proprietarios------------------");
//        for (Animal ani: animalDAO.listar()) {
//            System.out.println(ani.getNome());
//        }

    }


//        Proprietario proprietario = new Proprietario("20747082030", "Godofredo", "Peppa", LocalDate.of(1998,07,23),"Rua dos Bobos, 0","56634639");
//        AnimaisDeFazenda animaisDeFazenda = new AnimaisDeFazenda("Cavalo","Quarto de Milha","Marrom",LocalDate.of(2020,7,10),"Josefa",proprietario);
//        AnimaisDomesticos animaisDomesticos = new AnimaisDomesticos("Gato","Siames","Caramelo",LocalDate.of(2018,11,9),"kiko",proprietario);
//        System.out.println(animaisDeFazenda);
}
