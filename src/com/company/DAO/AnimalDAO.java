package com.company.DAO;

import com.company.model.Animal;
import com.company.model.Proprietario;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO implements DAO<Animal>{

    @Override
    public String cadastrar(List<Animal> animal) {

        JSONObject jsonObject = new JSONObject();

        FileWriter writeFile = null;

        jsonObject.put("Animal",animal);

        try {
            writeFile = new FileWriter("animal.json");
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonObject.toJSONString();
    }

    @Override
    public List<Animal> listar() {
        List<Animal> animais = new ArrayList<>();
        JSONObject jsonObject;
        JSONParser parser = new JSONParser();

        try {
            jsonObject = (JSONObject) parser.parse(new FileReader("animal.json"));
            JSONArray lista_animais = (JSONArray) jsonObject.get("Animal");

            System.out.println(lista_animais);

            for (Object ani : lista_animais)
            {
                Animal ani_obj = new Animal();

                JSONObject animal = (JSONObject) ani;

                ani_obj.setNumeroPaciente((String) animal.get("numeroPaciente"));
                ani_obj.setEspecie((String) animal.get("espacie"));
                ani_obj.setRaca((String) animal.get("raca"));
                ani_obj.setCor((String) animal.get("cor"));

                LocalDate dataDeNascimento = LocalDate.parse((String) animal.get("dataDeNascimento"));
                ani_obj.setDataDeNascimento((dataDeNascimento));

                JSONArray prop = (JSONArray) jsonObject.get("proprietario");

                System.out.println(prop.toString());

                for (Object pro : prop){
                    Proprietario p = new Proprietario();

                    JSONObject proprietario = (JSONObject) pro;

                    p.setCpf((String) proprietario.get("cpf"));

                    System.out.println(p.getCpf());
                }

                //ani_obj.setProprietario((String) animal.get("proprietario");

                animais.add(ani_obj);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        return  animais;
    }

    @Override
    public String atualizar(List<Animal> animal) {

        JSONObject jsonObject = new JSONObject();

        FileWriter writeFile = null;

        jsonObject.put("Animal",animal);

        try {
            writeFile = new FileWriter("animal.json");
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonObject.toJSONString();
    }

}
