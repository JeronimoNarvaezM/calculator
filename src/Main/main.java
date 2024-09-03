/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Operaciones.operaciones;
import java.util.Scanner;

/**
 *
 * @author 57320
 */
public class main {
    
    public static void main(String[]args){
        
        operaciones Operaciones = new operaciones();
        Scanner entrada = new Scanner(System.in);
        String opcion= "";
        System.out.println("1.Suma, 2.Resta. 3.Multiplicar, 4.Division, 5.Limpiar Acomulado 6.Salir");
        opcion = entrada.nextLine();
        while(!opcion.equals("6"))
        if(opcion.equals("1")){
            System.out.println("Ingrese un numero");
            double numero1 = entrada.nextDouble();
            System.out.println("Ingrese otro numero");
            double numero2= entrada.nextDouble();
            double resultado =Operaciones.sumar(numero1,numero2);
            System.out.println("El resultado es:"+resultado);
            
        }
        if(opcion.equals("2")){
            System.out.println("Ingrese un numero");
            double numero1 = entrada.nextDouble();
            System.out.println("Ingrese otro numero");
            double numero2= entrada.nextDouble();
            double resultado = Operaciones.restar(numero1,numero2);
            System.out.println("El resultado es:"+resultado);        
    }
        if(opcion.equals("3")){
            System.out.println("Ingrese un numero");
            double numero1 = entrada.nextDouble();
            System.out.println("Ingrese otro numero");
            double numero2= entrada.nextDouble();
            double resultado =Operaciones.multiplicar(numero1,numero2);
            System.out.println("El resultado es:"+resultado);        
    
    }
        if(opcion.equals("4")){
            System.out.println("Ingrese un numero");
            double numero1 = entrada.nextDouble();
            System.out.println("Ingrese otro numero");
            double numero2= entrada.nextDouble();
            double resultado =Operaciones.dividir(numero1,numero2);
            System.out.println("El resultado es:"+resultado);        
        }
    }
   }
   
    
    

