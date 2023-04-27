package com.PlataformasHeterogeneas.proyectoCV.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.PlataformasHeterogeneas.proyectoCV.model.PERSONA;

import com.PlataformasHeterogeneas.proyectoCV.service.PersonaServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/personaAPI")

public class personaAPI {
    @Autowired
    PersonaServiceImpl personaService;

    @GetMapping("/")
    public String hola(){
        return "holaaaaaa";
    }
    @GetMapping("/getAll")
    public List<PERSONA> getPersonas(){
        return personaService.getAllPERSONAS();
    }
    @GetMapping("/nombres")
    public List<String> obtenerNombres() {
        return personaService.getAllNames();
    }
    @GetMapping("/find/{nombre}")
    public Optional<PERSONA> getPersona(@PathVariable String nombre){
        return personaService.getPersonaByNombre(nombre);
    }
    @PostMapping("/save")
    public ResponseEntity<PERSONA> savePersona(@RequestBody PERSONA p){
        PERSONA createdUser = personaService.savePERSONA(p);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
    //put
    @PutMapping(value="/update/{id}")
    public ResponseEntity<PERSONA> updateTask(@PathVariable(value="nombre") String nombre, @RequestBody PERSONA act){
        PERSONA usuario = personaService.updatePERSONA(nombre, act.getCel(), act.getDireccion(), act.getEdad(), act.getEmail(), act.getIdiomas(), act.getCarrera(), act.getDesc(),
        act.getHab1(), act.getHab2(), act.getHab3(), act.getHab4(), act.getHab5(), act.getHab6(),
        act.getYearsED(), act.getEscuela(), act.getDescED(),
        act.getYearsEX(), act.getEmpresa(), act.getDescEX());
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/delete/{nombre}")
    public ResponseEntity<String> deletePersona(@PathVariable String nombre){
        if(personaService.getPersonaByNombre(nombre)!= null) {
            personaService.deletePERSONA(nombre);
            return ResponseEntity.ok("Usuario eliminado exitosamente.");
        }
        else {
            return ResponseEntity.ok("No se encontro el usuario.");
        }
    }
}
