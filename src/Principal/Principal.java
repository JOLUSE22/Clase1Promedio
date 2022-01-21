package Principal;

//Clase princial

import static java.lang.Double.parseDouble;
import java.util.Scanner;




public class Principal {

    //el main
    public static void main(String[] args) {
        
        //Scanner nombre= new Scanner(Sustem.in);
        Scanner capturaPantalla=new Scanner(System.in);
        System.out.println("Escriba el nombre del alumno:");
        
        
        //Recuperar de la pantalla con el nextLine();
        String n_alumno=capturaPantalla.nextLine();
        
        
        
        
        //Parsear 
        System.out.println("Escriba la primer nota:");
        String nota1=capturaPantalla.nextLine();
        double n1 = Double.parseDouble(nota1);
        
        System.out.println("Escriba la segunda nota:");
        String nota2=capturaPantalla.nextLine();
        double n2 = Double.parseDouble(nota2);
        
        System.out.println("Escriba la tercera nota:");
        String nota3=capturaPantalla.nextLine();
        double n3 = Double.parseDouble(nota3);
        
        System.out.println("Escriba la cuarta nota:");
        String nota4=capturaPantalla.nextLine();
        double n4 = Double.parseDouble(nota4);
        
        System.out.println("Escriba la quinta nota:");
        String nota5=capturaPantalla.nextLine();
        double n5 = Double.parseDouble(nota5);
        
        double mostrar=promediar(n1,n2,n3,n4,n5);
        
        System.out.println("Alumno:"+n_alumno);
        System.out.println("Nota:"+mostrar);
        
        System.out.println("La primera nota fue:"+n1);
        
 
    }
    
    
    //Metodo static (Si no hay retorno void/en caso de que si va el tipo de datos)
    public static double promediar(double n1,double n2 ,double n3 ,double n4 ,double n5 ){
        
        
        
        
        double resultado= n1+n2+n3+n4+n5;
        
        
        //Salida de pantalla 
        //print TODO JUNTO
        //println SEPARA POR LINEA
       
        
        double promedio = resultado/5;
        
        
        return promedio;
        
        
    
        
    }
    
}
