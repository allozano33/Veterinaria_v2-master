package com.company.DAO;

import com.company.model.Medico;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO implements DAO<Medico> {

    @Override
    public String cadastrar(List<Medico> medicos) {

        JSONObject jsonObject = new JSONObject();

        FileWriter writeFile = null;

        jsonObject.put("Medico",medicos);

        try {
            writeFile = new FileWriter("medico.json");
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonObject.toJSONString();
    }

    @Override
    public List<Medico> listar() {
        List<Medico> medicos = new ArrayList<>();
        JSONObject jsonObject;
        JSONParser parser = new JSONParser();

        try {
            jsonObject = (JSONObject) parser.parse(new FileReader("medico.json"));
            JSONArray lista_medicos = (JSONArray) jsonObject.get("Medico");

            for (Object med : lista_medicos)
            {
                Medico m = new Medico();

                JSONObject medico = (JSONObject) med;

                m.setCpf((String) medico.get("cpf"));
                m.setNome((String) medico.get("nome"));
                m.setSobrenome((String) medico.get("sobrenome"));
                m.setEspecialidade((String) medico.get("especialidade"));
                m.setNumeroDeRegistro((Long) medico.get("numeroDeRegistro"));

                medicos.add(m);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        return medicos;
    }

    @Override
    public String atualizar(List<Medico> medicos) {

        JSONObject jsonObject = new JSONObject();

        FileWriter writeFile = null;

        jsonObject.put("Medico",medicos);

        try {
            writeFile = new FileWriter("medico.json");
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonObject.toJSONString();
    }
}