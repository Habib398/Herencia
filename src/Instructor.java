
public class Instructor extends Empleado {

    private String Escuela;
    private String edad;

    public Instructor(String nombre, String apellido, String edad, String Escuela, String AreadeTrabajo, String CodigodeEmpleado) {
        super(nombre, apellido, AreadeTrabajo, CodigodeEmpleado);
        this.edad = edad;
        this.Escuela = Escuela;
    }

    public void mostrarMaestro() {
        System.out.println("Nombre: " + getNombre()
                + "\nApellido: " + getApellido()
                + "\nEdad: " + edad
                + "\nEscuela: " + Escuela
                + "\nAreadeTrabajo: " + getAreadeTrabajo()
                + "\nCodigodeEmpleado: " + getCodigodeEmpleado());

    }
}
