package com.backend.parcial.service;

import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Odontologo;

public class OdontologoService {

    private IDao<Odontologo> odontologoIDao;


    public OdontologoService(IDao<Odontologo> medicamentoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo guardarOdontologo(Odontologo odontologo) {
        return odontologoIDao.guardar(odontologo);
    }

    public Odontologo listarTodosMedicamentos() {
        return (Odontologo) odontologoIDao.listarTodos();
    }
}
