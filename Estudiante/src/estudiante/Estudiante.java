
package estudiante;


public class Estudiante {
    
    private  String Apellido;
    private  String codigo;
    private  String especialidad;
    private  int nota1;
    private  int nota2;
    private  int nota3;
    private  int nota4;
    float promedio;        

    public Estudiante(String Apellido,String codigo,String especialidad,int nota1,int nota2,int nota3, int nota4){
        
        this.Apellido=Apellido;
        this.codigo=codigo;
        this.especialidad=especialidad;
        this.nota1=nota1;
        this.nota2=nota2;      
        this.nota3=nota3;
        this.nota4=nota4; 
    
    }
    
    
    
    
    public String getApellido(){
        return Apellido;
    }
        
    public float getpromedio(){
        return promedio;
        
    }
    public void promedio (){
        int menor = nota1;
        if (menor>nota2)   {
            menor = nota2;  
        }
        if (menor>nota3)   {
            menor=nota3;
        }
        if (menor>nota4)   {
            menor=nota4;
            
        }
        float   Promedio = (nota1 + nota2 + nota3 + nota4 - menor) /3;
        this.promedio = Promedio;     
           
    }
    
}
