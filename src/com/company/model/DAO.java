package com.company.model;

import java.util.List;

public interface DAO<T> {
    String cadastrar(List<T> obj);

    List<Medico> listar();
}
