/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandezbarrera_20250825;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        ingresar_datos();
    }
    
    public static void ingresar_datos(){
        //INICIALIZACION DE CLASE SCANNER
        Scanner scanner = new Scanner(System.in);
        
        //DECLARACION DE VARIABLES
        int[] edades = new int[10];
        int suma = 0;
        int total_pares = 0;
        int total_impares = 0;
        
        //MSJ USUARIO
        System.out.println("Ingrese "+ edades.length +" edades");
        
        //RECORRE EL ARREGLO PARA ASIGNAR VALOR A CADA ELEMENTO
        for(int i = 0; i < edades.length; i++) {
            //SE SOLICITA AL USUARIO EL INGRESO DE UN VALOR
            System.out.println("Edad "+i+": ");
            
            //SE LEE DESDE TECLADO EL VALOR DIGITADO
            //Y SE ASIGNA LA VARIABLE CORRESPONDIENTE
            //SEGÚN LA POSICIÓN DE LA ITERACIÓN
            edades[i] = scanner.nextInt();
            
            //PARA CALCULAR EL PROMEDIO SE REQUIERE SUMAR TODAS
            //LAS EDADES REGISTRADAS EN CADA ELEMENTO
            suma += edades[i];
            
            //ESTABLECER SI EL VALOR ES PAR O IMPAR
            if((edades[i]% 2) == 0) {
                //es par
                //INCREMENTA VARIABLE ACUMULADORA
                total_pares++;
            } else {
                //es impar
                //INCREMENTA VARIABLE ACUMULADORA
                total_impares++;
            }
        }
        //CALCULANDO PROMEDIO Y REALIZANDO CASTING
        //PARA CONVERTIR LOS DATOS INT A DOUBLE AL
        //DEVOLVER RESULTADO5
       
        double promedio = (double) suma/edades.length;
        
        System.out.println("Usted ha ingresado: "+edades.length+" edades");
        System.out.println("El promedio de las edades ingresadas es: "+promedio);
        System.out.println("Ingresó: "+total_pares+" edades pares y "+total_impares+" edades impares");
        
        scanner.close();
    }
}
