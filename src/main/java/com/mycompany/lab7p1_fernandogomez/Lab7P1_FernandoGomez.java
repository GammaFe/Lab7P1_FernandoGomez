package com.mycompany.lab7p1_fernandogomez;

import java.util.Scanner;
import java.util.Random;

public class Lab7P1_FernandoGomez {

    public static void main(String[] args) {
        Scanner CAT = new Scanner(System.in);
        Seleccion pais = new Seleccion();
        int menu;
        while (true){
            System.out.println("escoja un ejercicio 1Futbol 2Aviones");
            menu = CAT .nextInt();
            if(menu ==1){
        int caso = 0;
        while (caso != 3) {
            int goles = new Random().nextInt((12 - 0) + 1) + 0;
            int goles2 = new Random().nextInt((12 - 0) + 1) + 0;

            System.out.println("Ingrese 1 para ver una seleccion y 2 para ver una prediccion 3 para salir");
            caso = CAT.nextInt();
            System.out.println(" ");
            if (caso == 1) {
                CAT = new Scanner(System.in);
                System.out.println("Ingrese una seleccion solo en minusculas");
                String seleccion = CAT.nextLine();
                int jugadoresconcocados = 26;
                switch (seleccion) {
                    case "españa":
                        String grupo = "Grupo E";
                        String ganador = "Si";
                        String director = "Luis Enrique";
                        int posision = 1;
                        System.out.println(seleccion + " pertenese a " + grupo);
                        System.out.println("Su director tecnico es " + director);
                        System.out.println("Tiene " + jugadoresconcocados + " Jugaodres colocados");
                        System.out.println(ganador + " ha ganado un mundial");
                        System.out.println("Esta en la " + posision + "A posision");
                        System.out.println("--------Se ha creado la seleccion de " + seleccion + "--------");
                        caso = 0;
                        break;
                    case "alemania":
                        grupo = "Grupo E";
                        ganador = "Si";
                        director = "Hansi Flick";
                        posision = 3;
                        System.out.println(seleccion + " pertenese a " + grupo + pais);
                        System.out.println("Su director tecnico es " + director);
                        System.out.println("Tiene " + jugadoresconcocados + " Jugaodres colocados");
                        System.out.println(ganador + " ha ganado un mundial");
                        System.out.println("Esta en la" + posision + " posision");
                        System.out.println("--------Se ha creado la seleccion de " + seleccion + "--------");
                        caso = 0;
                        break;
                    case "costarica":
                        grupo = "Grupo E";
                        ganador = "No";
                        director = "Luis Fernando Suarez";
                        posision = 4;
                        System.out.println(seleccion + " pertenese a " + grupo);
                        System.out.println("Su director tecnico es " + director);
                        System.out.println("Tiene " + jugadoresconcocados + " Jugaodres colocados");
                        System.out.println(ganador + " ha ganado un mundial");
                        System.out.println("Esta en la" + posision + " posision");
                        System.out.println("--------Se ha creado la seleccion de " + seleccion + "--------");
                        caso = 0;
                        break;
                    case "japon":
                        grupo = "Grupo E";
                        ganador = "No";
                        director = "Hajime Moriyatsu";
                        posision = 2;
                        System.out.println(seleccion + " pertenese a " + grupo);
                        System.out.println("Su director tecnico es " + director);
                        System.out.println("Tiene " + jugadoresconcocados + " Jugaodres colocados");
                        System.out.println(ganador + " ha ganado un mundial");
                        System.out.println("Esta en la" + posision + " posision");
                        System.out.println("--------Se ha creado la seleccion de " + seleccion + "--------");
                        caso = 0;
                        break;
                    case "belgica":
                        grupo = "Grupo F";
                        ganador = "No";
                        director = "Roberto Martinez";
                        posision = 1;
                        System.out.println(seleccion + " pertenese a " + grupo);
                        System.out.println("Su director tecnico es " + director);
                        System.out.println("Tiene " + jugadoresconcocados + " Jugaodres colocados");
                        System.out.println(ganador + " ha ganado un mundial");
                        System.out.println("Esta en la" + posision + " posision");
                        System.out.println("--------Se ha creado la seleccion de " + seleccion + "--------");
                        caso = 0;
                        break;
                    case "croacia":
                        grupo = "Grupo F";
                        ganador = "No";
                        director = "Zlatko Dalic";
                        posision = 2;
                        System.out.println(seleccion + " pertenese a " + grupo);
                        System.out.println("Su director tecnico es " + director);
                        System.out.println("Tiene " + jugadoresconcocados + " Jugaodres colocados");
                        System.out.println(ganador + " ha ganado un mundial");
                        System.out.println("Esta en la" + posision + " posision");
                        System.out.println("--------Se ha creado la seleccion de " + seleccion + "--------");
                        caso = 0;
                        break;
                    case "canada":
                        grupo = "Grupo F";
                        ganador = "No";
                        director = "John Herdman";
                        posision = 4;
                        System.out.println(seleccion + " pertenese a " + grupo);
                        System.out.println("Su director tecnico es " + director);
                        System.out.println("Tiene " + jugadoresconcocados + " Jugaodres colocados");
                        System.out.println(ganador + " ha ganado un mundial");
                        System.out.println("Esta en la" + posision + " posision");
                        System.out.println("--------Se ha creado la seleccion de " + seleccion + "--------");
                        caso = 0;
                        break;
                    case "marruecos":
                        grupo = "Grupo F";
                        ganador = "No";
                        director = "Walid Regragui";
                        posision = 3;
                        System.out.println(seleccion + " pertenese a " + grupo);
                        System.out.println("Su director tecnico es " + director);
                        System.out.println("Tiene " + jugadoresconcocados + " Jugaodres colocados");
                        System.out.println(ganador + " ha ganado un mundial");
                        System.out.println("Esta en la" + posision + " posision");
                        System.out.println("--------Se ha creado la seleccion de " + seleccion + "--------");
                        caso = 0;
                        break;
                    default:
                        System.out.println("Nombre no valido");
                        break;
                }

            } else if (caso == 2) {
                CAT= new Scanner(System.in);
                System.out.println("Ingrese seleccion 1");
                String A= CAT.nextLine();
                System.out.println("Ingrese seleccion 2");
                String B= CAT.nextLine();
               System .out.println(A+" "+goles + " [] "+B+" "+ goles2);
            }
        }
        
    }else if(menu==2){
                System.out.println("Bienvenido al nuevo systema de torre de control");
                int cont = 0;
                while(cont <=3){
                    System.out.println("Ingrese el modelo del avion");
                    String modelo =CAT.nextLine();
                    System.out.println("Ingrese el codigo");
                    String codigo =CAT.nextLine();
                    System.out.println("Ingrese el año de fabricacion");
                    int año =CAT.nextInt();
                    System.out.println("Ingrese la cantidad maxima de pasajeros");
                    int pasajeros =CAT.nextInt();
                    System.out.println("Ingrese el peso del avion");
                    int peso = CAT.nextInt();
                    System.out.println("Ingrese el nombre de aerolinea");
                }
    }else if ((menu!=1)||(menu!=2)){
        System.exit(0);
    }
        }
    }
}
