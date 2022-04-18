
public class Estudiante extends Persona {

    private String matricula;
    private String carrera;
    private String edad;

    public Estudiante(String nombre, String apellido, String edad, String matricula, String carrera) {
        super(nombre, apellido);
        this.matricula = matricula;
        this.carrera = carrera;
        this.edad = edad;
    }

    public void mostrarAlumno() {
        System.out.println("Nombre: " + getNombre()
                + "\nApellido: " + getApellido()
                + "\nEdad: " + edad
                + "\nMatricula: " + matricula
                + "\nCarrera: " + carrera);

    }
}
