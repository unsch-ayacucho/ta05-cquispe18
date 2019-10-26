
package empleado;


public class Empleado {
    String codigo;
    String nombre;
    String areaLaboral;
    double sueldo;
    double horasExtras;
    String afiliacion;
            
    public Empleado() {
    }
public double montoHorasEx(double sueldo,float horasExtras){
    double monto;
    this.sueldo=sueldo;
    this.horasExtras=horasExtras;
    monto=(sueldo/240)*horasExtras;
    return monto;  
}
public double afiliacionAFP(double sueldo) {
    
    double descuento;
    this.sueldo=sueldo;
    descuento=(0.11*sueldo);
    return descuento;
}   
public double afiliacionSNP(double sueldo){
    double descuentoSNP;
    this .sueldo=sueldo;
    descuentoSNP=(0.13*sueldo); 
    return descuentoSNP;
}
public double afiliacionSalud(double sueldo){
    double descuentoS;
    this.sueldo=sueldo;
    descuentoS=(0.3 *sueldo);
    return descuentoS;         
}
public double totalDescuento(){
    double descuentoT;
    descuentoT=(afiliacionAFP(sueldo)+ afiliacionSNP (sueldo)+afiliacionSalud(sueldo));
    return descuentoT;
}
public double sueldoTotal(double sueldo){
    this.sueldo=sueldo;
    return sueldo;
}
public double sueldoNeto(double sueldo){
    
    double sueldoNeto;
    this.sueldo=sueldo;
    sueldoNeto=(sueldo-totalDescuento());
    return sueldoNeto;
    
}

    
    
    public String TosTring(){
        
        
        
        return "empleado{"+"codigo="+codigo+",nomgre="+nombre+",arealaboral="+areaLaboral+",suelo="+sueldo+",horasExtras="+horasExtras+",afiliacion="+afiliacion+"}";
    }
    public Empleado(String codigo,String nombre,String areaLaboral,double sueldo,double horasExtras,String afiliacion){
        this.codigo=codigo;
        this.nombre=nombre;
        this.areaLaboral=areaLaboral;
        this.sueldo=sueldo;
        this.horasExtras=horasExtras;
        this.afiliacion=afiliacion;
    }
    


}