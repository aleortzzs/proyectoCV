package com.PlataformasHeterogeneas.proyectoCV.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Column;

import java.io.Serializable;
@JsonSerialize
public class PERSON {
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("carrera")
    private String carrera;
    @JsonProperty("direccion")
    private String direccion;
    @JsonProperty("email")
    private String email;
    @JsonProperty("descs")
    private String descs;
    @JsonProperty("cel")
    private String cel;
    @JsonProperty("edad")
    private String edad;
    @JsonProperty("idiomas")
    private String idiomas;
    @JsonProperty("hab1")
    private String hab1;
    @JsonProperty("hab2")
    private String hab2;
    @JsonProperty("hab3")
    private String hab3;
    @JsonProperty("hab4")
    private String hab4;
    @JsonProperty("hab5")
    private String hab5;
    @JsonProperty("hab6")
    private String hab6;
    @JsonProperty("yearsED")
    private String yearsED;
    @JsonProperty("escuela")
    private String escuela;
    @JsonProperty("descED")
    private String descED;
    @JsonProperty("yearsEX")
    private String yearsEX;
    @JsonProperty("empresa")
    private String empresa;
    @JsonProperty("descEX")
    private String descEX;

    //constructor
    public PERSON(){}
    public PERSON(String nombre, String carrera, String direccion, String email, String descs, String cel, String edad, String idiomas, String hab1, String hab2, String hab3, String hab4, String hab5, String hab6, String yearsED, String escuela, String descED, String yearsEX, String empresa, String descEX){
        this.nombre=nombre;
        this.carrera=carrera;
        this.direccion=direccion;
        this.email=email;
        this.descs=descs;
        this.cel=cel;
        this.edad=edad;
        this.idiomas=idiomas;
        this.hab1=hab1;
        this.hab2=hab2;
        this.hab3=hab3;
        this.hab4=hab4;
        this.hab5=hab5;
        this.hab6=hab6;
        this.yearsED=yearsED;
        this.escuela=escuela;
        this.descED=descED;
        this.yearsEX=yearsEX;
        this.empresa=empresa;
        this.descEX=descEX;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getDesc() {
        return descs;
    }

    public String getCel() {
        return cel;
    }

    public String getEdad() {
        return edad;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public String getHab1() {
        return hab1;
    }

    public String getHab2() {
        return hab2;
    }

    public String getHab3() {
        return hab3;
    }

    public String getHab4() {
        return hab4;
    }

    public String getHab5() {
        return hab5;
    }

    public String getHab6() {
        return hab6;
    }

    public String getYearsED() {
        return yearsED;
    }

    public String getEscuela() {
        return escuela;
    }

    public String getDescED() {
        return descED;
    }

    public String getYearsEX() {
        return yearsEX;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getDescEX() {
        return descEX;
    }

    //SETS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDesc(String desc) {
        this.descs = desc;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public void setHab1(String hab1) {
        this.hab1 = hab1;
    }

    public void setHab2(String hab2) {
        this.hab2 = hab2;
    }

    public void setHab3(String hab3) {
        this.hab3 = hab3;
    }

    public void setHab4(String hab4) {
        this.hab4 = hab4;
    }

    public void setHab5(String hab5) {
        this.hab5 = hab5;
    }

    public void setHab6(String hab6) {
        this.hab6 = hab6;
    }

    public void setYearsED(String yearsED) {
        this.yearsED = yearsED;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setDescED(String descED) {
        this.descED = descED;
    }

    public void setYearsEX(String yearsEX) {
        this.yearsEX = yearsEX;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setDescEX(String descEX) {
        this.descEX = descEX;
    }

}
