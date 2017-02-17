/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmannm.a06;
import java.util.Scanner;
/**
 *
 * @author Lisdy Nadine Rohmann Martínez 
 * 513659
 * Carrera: IIS
 */
public class SPPLRohmannMA06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // Lisdy Nadine Rohmann Martínez 
   //513659
   //Carrera: IIS 
   
   
   // Declaración de variables
  int num=1, sum=0;
        Scanner Sc = new Scanner (System.in);
        while(num >=0){
            try{
                num =SolicitarDatos();
                if (num>=0){
                    sum = CalcularSuma(num,sum);
                }
            }
           catch (Exception ex){
               System.out.println("El valor introducido no es un número entero positivo");
               
           }
        }
        System.out.println("La suma de todos los número introducidos es: " +sum);
    
    }

    static int SolicitarDatos(){
        int num;
        Scanner Sc = new Scanner (System.in) ;
        System.out.println("Introduce un número entero positivo");
        num = Sc.nextInt();
        return num;
        
    }
    static int CalcularSuma(int num, int sum){
      
        return sum = sum + num;


    }
    }  


