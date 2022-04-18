
public class SalonDeClases {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Habib", "Jacinto", "19", "4632876", "Ingenieria en software");
        Instructor docente = new Instructor("Jose", "Vergara", "50", "Universidad Veracruzana", "Docente", "732863");
        estudiante.mostrarAlumno();
        docente.mostrarMaestro();
    }

}
