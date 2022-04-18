
public class Empleado {
    private String nombre;
    private String apellido;
    private String AreadeTrabajo;
    private String CodigodeEmpleado;

    public Empleado(String nombre, String apellido, String AreadeTrabajo, String CodigodeEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.AreadeTrabajo = AreadeTrabajo;
        this.CodigodeEmpleado = CodigodeEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getAreadeTrabajo() {
        return AreadeTrabajo;
    }

    public String getCodigodeEmpleado() {
        return CodigodeEmpleado;
    }
    
    
    
}