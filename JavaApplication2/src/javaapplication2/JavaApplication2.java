/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaApplication2 {

    public static String LecturadeFile(String pathname) {

        File archivo = null;


        try{
            archivo = new File(pathname);
            BufferedReader bf = new BufferedReader( new FileReader(archivo));
            String temporal="";
            String bfread;

            while((bfread=bf.readLine())!=null){

                System.out.println(bfread);

            }

        }catch(Exception e){

            System.out.println("La ruta ingresada no es valida o el archivo no existe.");
        }

    return "";
        }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ruta del archivo a trabajar:");
        String ruta="";
        ruta = teclado.next();
        String txtobtenido = LecturadeFile(ruta);
        
    }
    
}
