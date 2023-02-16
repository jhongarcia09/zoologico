package org.example;

public class Familia {

    String papa="Dinosaurin";
    String mama="Tiburosin";
    String hijo="Cebrallo";

    public Familia(String papa, String mama) {
        this.papa = papa;
        this.mama = mama;
        this.hijo = hijo;
    }

    public  void imprimirFamilia(String papa, String mama, String hijo){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: "+this.papa+
                        "\nLa mamá es: "+this.mama+
                            "\nEl hijo es: "+this.hijo
        );

    }

    public void tenerHijo(String nombre){

        if(this.papa!=null){

            Animal hijo= new Animal("Cebrallo", 150);
            hijo.nombre=nombre;
            hijo.peso=1;
            double random = Math.random();
            if(random<0.5){
                hijo.genero="F";
            }else{
                hijo.genero="M";
            }

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }




}
