package com.company.DAO;

import java.util.List;

public interface DAO<T> {

    String cadastrar(List<T> obj);

    List<T> listar();

    String atualizar(List<T> obj);
}
