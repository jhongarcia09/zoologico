package org.example;

public class Zoologico {
    public static void main(String[] args) {




        Animal animal2 = new Animal( "pantera", 200) {
        };
        animal2.nombre="pantera";
        animal2.genero="M";

        Animal animal1 = new Animal ("caballo", 100 );
        animal1.nombre="caballo";
        animal1.genero="F";



        animal1.encontrarPareja(animal1.genero);


        Familia familia = new Familia("pantera","caaballo");


        familia.tenerHijo("Cebrallo" );


        familia.imprimirFamilia("pantera","caballo","cebrallo");




    }
}