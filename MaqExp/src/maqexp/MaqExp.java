
package maqexp;

import java.util.Scanner;

public class MaqExp {
    Scanner scan = new Scanner(System.in);
     
   
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean seguir = true;
        int saldo;
        
        
        producto uno = new producto("chetos",2,10);
        producto dos = new producto("agua",5,30);
        
        while (seguir == true){
            
            System.out.println("Ingresa tu dinero");
            saldo = scan.nextInt();
            
            System.out.println("Escoja un producto");
            int prod = scan.nextInt();
         
            if (prod==1){
             uno.venta(saldo);
             uno.mostrar();
             saldo = uno.cambio;
             uno.cambio = 0;
            
            }
            else{
             dos.venta(saldo);
             dos.mostrar();
             saldo = dos.cambio;
             dos.cambio = 0;
            }
            
            
             System.out.println("Recoge tus $"+saldo);
             saldo = 0;
             
             
             System.out.println("Seguir?");
             int cont = scan.nextInt();
             if(cont == 0){
                 seguir = false;
             }
        }
    }
    
   
   
    
}
