package com.PlataformasHeterogeneas.proyectoCV.repository;

import com.PlataformasHeterogeneas.proyectoCV.model.PERSONA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface repository extends JpaRepository<PERSONA, String> {
    Optional<PERSONA> findByNombre(String nombre);

    void deleteByNombre(String nombre);

}