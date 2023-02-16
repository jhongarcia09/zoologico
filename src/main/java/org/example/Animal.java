package org.example;

public class Animal {

     String nombre;
    String genero;
    double peso=1;
    private String pareja;


    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    void encontrarPareja(String pareja){
        this.pareja=pareja;
    }






}
