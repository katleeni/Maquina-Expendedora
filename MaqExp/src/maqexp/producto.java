
package maqexp;

public class producto {
    String nombre;
    int existencia;
    int precio;
    int saldo;
    int cambio;
    
    
    public producto (String nombre,int existencia,int precio){
         this.nombre = nombre;
         this.existencia = existencia;
         this.precio = precio;
    }
    
    
    public int venta(int saldo){
        
        
        if(existencia==0) {
            System.out.println("Sin existencias");
        }
        else if (saldo-precio>= 0 && existencia>0){
             System.out.println("Usted compro unos: "+nombre);
             existencia--;
             cambio = saldo-precio;
             System.out.println("Su cambio es: $"+cambio);
        }
        else{
            System.out.println("Ssldo Insuficiente");
            cambio = saldo;
        }
        
        saldo = 0;
        return cambio;
    }
    
    public void mostrar(){
        System.out.println(nombre+"\n"+existencia);
    }
}
