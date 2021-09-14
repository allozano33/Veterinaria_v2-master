package com.company.DAO;

import com.company.model.Consulta;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ConsultaDAO implements DAO<Consulta>{

    @Override
    public String cadastrar(List<Consulta> consulta) {
        JSONObject jsonObject = new JSONObject();

        FileWriter writeFile = null;

        jsonObject.put("Consulta", consulta);

        try {
            writeFile = new FileWriter("consulta.json");
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonObject.toJSONString();
    }

    @Override
    public List<Consulta> listar() {
        return null;
    }

    @Override
    public String atualizar(List<Consulta> consulta) {

        JSONObject jsonObject = new JSONObject();

        FileWriter writeFile = null;

        jsonObject.put("Consulta",consulta);

        try {
            writeFile = new FileWriter("consulta.json");
            writeFile.append(jsonObject.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonObject.toJSONString();
    }
}
