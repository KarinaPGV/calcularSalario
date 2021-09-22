package com.company;

import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class Main {

    public static void main(String[] args) {
        getUserData();
    }
    private static void print(String message) {
        System.out.println(message);
    }
    private static String input(String message) {
        print(message);
        Scanner entradaEscaner = new Scanner (System.in);//Creación de un objeto Scanner
        return entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    }

    private static void calcularSalario(double porcentaje, String nombre) {
        double salario = Double.parseDouble(input("Ingrese su salario:"));
        double salarioFinal = salario * porcentaje + salario;
        print( nombre + " su salario final es:" + salarioFinal);
    }


    public static void getUserData() {
        print("Empezamos el programa");
        print("Por favor introduzca la información solicitada");
        String nombre = input("Ingrese su nombre:");
        int edad = Integer.parseInt(input("Ingrese su edad:"));


        if (edad <= 16) {
            print("No tiene edad para trabajar");
        }
        else if (edad > 19 && edad < 50) {
            calcularSalario(0.05,nombre);
        }
        else if (edad > 51 && edad < 60) {
            calcularSalario(0.10,nombre);
        }
        else if (edad > 60) {
            calcularSalario(0.15,nombre);
        }
        else {
            print("Revise los datos ingresados");
        }
    }

}
