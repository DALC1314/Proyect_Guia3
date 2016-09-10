
package herencia;

/**
 *
 * @author dlatorre8923
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
        return "estudiando... "+materia;
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
