/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesc.a10;
import java.util.Scanner;
/**
 *
 * @author roxana
 */
public class SPP2RREYESCA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int tamaño = solicitartamaño();
        int [][] a = array ("A", tamaño);
        int [][] b = array ("B", tamaño);
        sumaMatriz (a,b);
    }
    public static int solicitartamaño(){
        Scanner Teclado = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Escribe el tamaño del arreglo(considera que es un arreglo cuadrado): ");
                a = Teclado.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Error");
                Teclado.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int solicitarentero(){
        Scanner Teclado = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Escribe un entero: ");
                a = Teclado.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Error");
                Teclado.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int [][] array (String a, int tamaño){
        int [][]array = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + a);
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    array [i][j] = solicitarentero();
        }
        }
        return array;
    }
    public static int [][] sumaMatriz (int [][]a, int[][]b){
        int [][] r = new int [a.length] [a.length];
            System.out.println("Suma: ");
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a[i].length; j++){
                    r[i][j] = a[i][j] - b[i][j];
        System.out.println("["+r[i][j]+"]");   
    }
        System.out.println("");   
    }
        return r; 
    }
    
}
    
    

