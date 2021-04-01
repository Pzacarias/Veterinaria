import java.util.Date;

public class Empleado extends Persona {
    public String puesto;
    public int numeroDeEmpleado;
    public Date fechaDeIngreso;
    public int numeroDeCuil;
    public String diasDeTrabajo;
    public String turnoDeTrabajo;
    public String cbu;
    public double sueldo;

    public boolean esValidoCBU() {
        if (this.cbu.length()==23) {
            return true;
        }
        return false;
    }
    
}
