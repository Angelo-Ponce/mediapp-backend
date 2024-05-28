package com.mitocode.service.impl;

import com.mitocode.repository.IGenericRepo;
import com.mitocode.service.ICRUD;

import java.util.List;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID> {

    // Poliformismo
    // un metodo que pueda devolver un objetos que se comporte de diferentes formas, dependiendo de quien lo invoque
    protected abstract IGenericRepo<T, ID> getRepo();

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public T update(ID id, T t) {
        //getRepo().findById(id).orElseThrow(() -> new ModelNotFoundException("ID not found: " + id));
        return getRepo().save(t);
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        // Cambiar el NULL POR EXCEPTION
        // Supplier = sin parametros de ingreso pero devuelve algo
        //getRepo().findById(id).orElseThrow(() -> new ModelNotFoundException("ID not found: " + id));
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public void delete(ID id) {
        //getRepo().findById(id).orElseThrow(() -> new ModelNotFoundException("ID not found: " + id));
        getRepo().deleteById(id);
    }
}
