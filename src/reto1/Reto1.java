/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;
import java.util.Scanner;
/**
 *
 * @author Oscar
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Digite peso contenedor de rosas");
        int rosas= sc.nextInt();
        
        int margaritas= (2*rosas)+4;
        int hortencias= (rosas+margaritas)/5;
        
        System.out.println(rosas+" "+margaritas+" "+hortencias);
        
        if (rosas>=0 && rosas <=20){
            System.out.println("uno");
        }else if(rosas>=21 && rosas<=40){
            System.out.println("dos");
        }else if(rosas>=41 && rosas<=80){
            System.out.println("tres");
        }else {
            System.out.println("cuatro");
        }
    }
    
}
