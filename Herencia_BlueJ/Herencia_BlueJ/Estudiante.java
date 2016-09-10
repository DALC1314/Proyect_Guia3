
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
//Atributos de la Clase Estudiante
private String carrera, matricula;   

    public String getCarrera() {
        return carrera;
    }
    
    //Metodo estudiar:
    public String estudiar(String materia){
        return "Estudiando... "+materia;
    }
    
    //Metodo hacer examen:
    public String hacerExamen(){
        return "Haciendo Examen";
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}    