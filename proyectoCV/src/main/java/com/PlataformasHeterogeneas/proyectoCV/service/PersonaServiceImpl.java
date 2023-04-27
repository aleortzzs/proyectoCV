package com.PlataformasHeterogeneas.proyectoCV.service;

import com.PlataformasHeterogeneas.proyectoCV.model.PERSONA;
import com.PlataformasHeterogeneas.proyectoCV.repository.repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl{
    @Autowired
    repository personaREP;
    public List<PERSONA> getAllPERSONAS() {
        return personaREP.findAll();
    }
    public List<String> getAllNames() {
        List<PERSONA> userList = personaREP.findAll();
        List<String> nameList = new ArrayList<>();
        for(PERSONA user : userList) {
            nameList.add(user.getNombre());
        }
        return nameList;
    }
    public Optional<PERSONA> getPersonaByNombre(String nombre) {
        return personaREP.findByNombre(nombre);
    }
    public PERSONA savePERSONA(PERSONA p){
        return personaREP.save(p);
    }
    @Transactional
    public void deletePERSONA(String nombre) {
        personaREP.deleteByNombre(nombre);
    }
    public PERSONA updatePERSONA(String nombre, String celular, String direccion, String edad, String email, String idioma, String carrera, String resumen,
                                 String hab1, String hab2, String hab3, String hab4, String hab5, String hab6,
                                 String yearsED, String escuela, String descED,
                                 String yearsEX, String empresa, String descEX) {
        Optional<PERSONA> optionalUsuario = personaREP.findByNombre(nombre);
        if (optionalUsuario.isPresent()) {
            PERSONA usuario = optionalUsuario.get();
            usuario.setCel(celular);
            usuario.setDireccion(direccion);
            usuario.setEdad(edad);
            usuario.setEmail(email);
            usuario.setEscuela(escuela);
            usuario.setIdiomas(idioma);
            usuario.setCarrera(carrera);
            usuario.setDesc(resumen);
            usuario.setHab1(hab1);
            usuario.setHab2(hab2);
            usuario.setHab3(hab3);
            usuario.setHab4(hab4);
            usuario.setHab5(hab5);
            usuario.setHab6(hab6);
            usuario.setYearsED(yearsED);
            usuario.setDescED(descED);
            usuario.setYearsEX(yearsEX);
            usuario.setEmpresa(empresa);
            usuario.setDescEX(descEX);
            return personaREP.save(usuario);
        } else {
            return null;
        }
    }
}