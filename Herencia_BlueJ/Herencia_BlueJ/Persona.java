
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona 
{
    //Atributos de la Clase Persona
    protected String nombre;
    protected int edad;
    
    public Persona() {
    
    }
    
    //Metodo dormir:
    public String domir(){
        return "Dormir toda la noche";
    }
    
    //Metodo comer:
    public String comer(){
        return "Comer todo...";
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}