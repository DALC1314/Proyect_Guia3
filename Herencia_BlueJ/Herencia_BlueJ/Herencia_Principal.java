
/**
 * Write a description of class Herencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;

public class Herencia_Principal{
    
    public static void main(String[] args) {
        String dato1;
        int dato2;
        Estudiante e = new Estudiante();
        dato1 = JOptionPane.showInputDialog("Nombre:");
        e.setNombre(dato1);
        dato2 = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
        e.setEdad(dato2);
        dato1 = JOptionPane.showInputDialog("Carrera:");
        e.setCarrera(dato1);
        dato1 = JOptionPane.showInputDialog("Matricula:");
        e.setMatricula(dato1);
        
        JOptionPane.showMessageDialog(null, "El nombre de la persona es: "+e.getNombre()+
            "\nSu edad es : "+e.getEdad()+ 
            "\nEstudia: "+e.getCarrera()+
            "\nCon matricula: "+e.getMatricula());
        JOptionPane.showMessageDialog(null, "Desarrollo estos metodos");
        JOptionPane.showMessageDialog(null,"1 "+(e.domir())+
        "\n 2 "+(e.comer())+
        "\n 3 "+(e.estudiar("Programación"))+
        "\n 4 "+(e.hacerExamen()));
    }

}