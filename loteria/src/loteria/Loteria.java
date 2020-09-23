package loteria;

import java.util.ArrayList;
import java.util.Scanner;

public class Loteria {


    public static void main(String[] args) {
        
         ArrayList<String> alumnos = new ArrayList<>();
         alumnos.add("Pepe");
         alumnos.add("Juan");
         alumnos.add("Maria");
         alumnos.add("Sofi");
         alumnos.add("Ale");
         alumnos.add("Nati");
         alumnos.add("Serafina");
         alumnos.add("Suarez");
         alumnos.add("Juli");
         alumnos.add("Seba");         
         alumnos.add("Pesquera");
         alumnos.add("Falange");
         alumnos.add("Sue");
         alumnos.add("Isis");
         alumnos.add("Ra");
         alumnos.add("Zeus");
         alumnos.add("Poseidon");
         alumnos.add("Loki");
         alumnos.add("Crisi");
         alumnos.add("YO!!!!");   
         System.out.println(alumnos.get(19));

            System.out.println("¿Desea hacer trampa?: SI O NO"); 
            Scanner myObj = new Scanner(System.in);
            String trampa = myObj.nextLine();
            
            if("Si".equals(trampa)||"si".equals(trampa)||"SI".equals(trampa)){
                System.out.println("Pero que tramposo.. juguemos sucio");               
                double numeroganador1 = Math.random() * 20;  
                int numeroganador = (int)numeroganador1;
                
                while(numeroganador!=19){
                System.out.println("El numero "+numeroganador+" no me gusta. Saca otro numero CHE!");
                numeroganador1 = Math.random() * 20;  
                numeroganador = (int)numeroganador1;
                }
                if(numeroganador==19){
                    System.out.println("19! ESE SI ES BUEN NUMERO!!!");
                }
                System.out.println("NUMERO GANADOR: "+numeroganador);
                System.out.println("Gano: "+alumnos.get(numeroganador));
 
            } else{
                System.out.println("Juguemos honestamente por la remera");
                double numeroganador1 = Math.random() * 19;  
                int numeroganador = (int)numeroganador1;
                System.out.println("NUMERO GANADOR: "+numeroganador);
                System.out.println("Gano: "+alumnos.get(numeroganador));
                
            }
    }
    
}
    

