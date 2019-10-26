
package ventana;


public class Ventana {
    
    String agrandar;
    String achicar;
    String color;
    String cerrado;
    int tamaño1;
    
    public Ventana(String agrandar,String achicar,String color,String cerrado,int tamaño1){
        this.agrandar = agrandar;
        this.achicar=achicar;
        this.cerrado=cerrado;
        this.color=color;
        this.tamaño1=tamaño1;
    }    
    public void mostrarDatos(){ 
        System.out.println("la ventana es  "+agrandar);
        System.out.println("la ventana es "+achicar);
        System.out.println("el ventana esta  "+cerrado);
        System.out.println("la ventana es de color   "+color);
        System.out.println("la ventana es de tamaño "+tamaño1);
    } 
}        
    
    
    
   

