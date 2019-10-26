
package estudiante;

public class EstudianteMain {
    public static void main (String[] args){
        Estudiante Estudiante1=new Estudiante("QUISPE_FERNANDEZ","27182106","ING",12,14,11,15);
        Estudiante1.promedio();
       
        System.out.println("El promedio de " +Estudiante1.getApellido()+ " es de: " +Estudiante1.getpromedio());
        
    }
    
}
