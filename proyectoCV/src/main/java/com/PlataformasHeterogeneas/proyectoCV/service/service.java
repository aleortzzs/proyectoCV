package com.PlataformasHeterogeneas.proyectoCV.service;
import com.PlataformasHeterogeneas.proyectoCV.model.PERSONA;
import java.util.ArrayList;
import java.util.Optional;
public interface service {
    ArrayList<PERSONA> getAllPERSONAS();
    ArrayList<String> getAllNames();
    Optional<PERSONA> getPersonaByNombre(String nombre);
    PERSONA savePERSONA(PERSONA p);
    boolean deletePERSONA(String nombre);
}
