
package com.mycompany.practica11extra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NewMain {

    public static void main(String[] args) {
        
        System.out.println("----- FileWriter -----");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escriba texto para el archivo: ");
            String texto2 = br.readLine();
            
            FileWriter fw = new FileWriter("FW.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            salida.println(texto2);
            
            //Codigo para proyecto.
            for(int i = 0; i<10 ; i++){
                salida.println(i+" Linea del for.");}
            for(int i = 0; i<10 ; i++){
                salida.println(i+" ZAMUDIO,MARTINEZ,ANGEL,317196883,20,50");}
            
            salida.close();
        }
        catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
  
        System.out.println("----- FileReader -----");
        try {
            BufferedReader br = null;
            FileReader fr = new FileReader("FW.csv");
            br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            while(linea!=null){
                StringTokenizer tokenizer = new StringTokenizer(linea,",");
                while(tokenizer.hasMoreTokens()){
                    System.out.println(tokenizer.nextToken());
                //System.out.println(linea);
                linea = br.readLine();}
                
            }
                br.close();
        }
        catch (FileNotFoundException ex) {
             System.out.println(ex.getMessage());
        }
        catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
        
    }
    
}
