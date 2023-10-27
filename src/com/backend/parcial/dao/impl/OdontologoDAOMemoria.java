package com.backend.parcial.dao.impl;

import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOMemoria implements IDao <Odontologo>{

    private final Logger LOGGER = Logger.getLogger(OdontologoDAOMemoria.class);
    private List<Odontologo> odontologoRepository;


    public OdontologoDAOMemoria(List<Odontologo> odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }


    public OdontologoDAOMemoria() {
        this.odontologoRepository = new ArrayList<>();
    }

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        int id = odontologoRepository.size() + 1;
        odontologoRepository.add(odontologo);
        Odontologo odontologoGuardado = new Odontologo(id, odontologo.getNombre(), odontologo.getApellido());
        LOGGER.info("Odontólogo guardado: " + odontologoGuardado);
        return odontologoGuardado;
    }
    @Override
    public List<Odontologo> listarTodos() {
        return odontologoRepository;
    }

}