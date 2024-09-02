/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.estructuradedatos.ui;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pedrizquierdo
 */
public class Ejercicios01 {
    
    public static void main(String[] args) {
        
        // Creación de un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
         // EJERCICIO I: Verificación de si una palabra es un palíndromo
        System.out.println("EJERCICIO I.\n");
        
        System.out.println("Ingrese su texto a evaluar: ");
        
        
        String originalStr = scanner.nextLine();
        String reversedStr = "";
        
        // Revertir la cadena de texto ingresada por el usuario
        for (int i = 0; i < originalStr.length(); i++) {
        reversedStr = originalStr.charAt(i) + reversedStr;
        }
        // Comprobar si la cadena original es igual a la cadena invertida
        if(originalStr.equals(reversedStr)) {
            System.out.println("Es palíndromo.");
        }
        else{ 
            System.out.println("No es palíndromo.");
        }
         // EJERCICIO II: Cálculos estadísticos sobre un arreglo de números aleatorios
        System.out.println("\nEJERCICIO II.\n");
        
        int mayor = 0;
        int menor = 100;
        int par = 0;
        int impar =0;
        double suma = 0;
        
        
        Random rand = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        
        // Generar 10 números aleatorios y agregarlos a la lista
        for (int i = 0; i < 10; i++) {
        
        lista.add(rand.nextInt(100)+1);   
        
  }
        // Calcular el mayor, menor, la cantidad de pares/impares y la suma total
        for(int a : lista) {
            if (a > mayor) { 
            mayor = a;
            }
            if (a < menor) {
            menor = a;
           }
            if (a % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            suma += a;
        }
        
        // Calcular el promedio
        double prom = suma/lista.size();
        
        // Mostrar resultados
        System.out.println(lista);
        System.out.println("El promedio del arreglo de números es: " + prom);
        System.out.println("Hay " + par + " números pares.");
        System.out.println("Hay " + impar + " números impares.");
        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);
        
        // EJERCICIO III: Generación del RFC basado en el nombre y la fecha de nacimiento del usuario
        System.out.println("\nEJERCICIO III.\n");
        try{
        System.out.println("Ingrese su primer nombre, apellido paterno y materno: ");
        String infoNombre = scanner.nextLine();
        
        System.out.println("Ingrese su fecha de nacimiento:(dd/mm/yyyy) ");
        String infoFecha = scanner.nextLine();
        
        // Dividir el nombre completo en partes
        String[] nombreRfc = infoNombre.split(" ");
        String paterno = nombreRfc[1];
        String materno = nombreRfc[2];
        String nombre = nombreRfc[0];
        
        // Dividir la fecha en día, mes y año
        String[] fechaRfc = infoFecha.split("/");
        
        // Extraer partes de la fecha para el RFC
        String anio = fechaRfc[2].substring(2, 4);
        String mes = fechaRfc[1];
        String dia = fechaRfc[0];

        // Construir el RFC con las primeras letras de los apellidos, nombre y la fecha de nacimiento
        String rfc = (paterno.substring(0, 2) + materno.substring(0, 1) + nombre.substring(0, 1) + anio + mes + dia).toUpperCase();
        
        
        System.out.println("Su RFC es: " + rfc);
        }catch(Exception ex){
            System.err.println("Error: Datos ingresados incorrectos o incompletos");
        }
        
        }
        
    }  
    

