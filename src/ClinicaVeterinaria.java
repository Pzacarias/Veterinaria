import java.util.*;

public class ClinicaVeterinaria {
    public String nombre;
    public String direccion;
    public String codigoDeSucursal;
    public String cuit;
    public int telefono;
    public String email;

    public List<Paciente> pacientes = new ArrayList<>();
    public int capacidadMaxima = 20;

    public boolean hacerRevision(Paciente paciente) {

        System.out.println("Revisando al paciente " + paciente.nombre);
        return true;

    }

    public boolean ingresar(Paciente paciente) {
        if (this.pacientes.size() < this.capacidadMaxima) {
            this.pacientes.add(paciente);
            return true;
        }
        return false;

    }

    public void imprimirListadoPacientes(){
        System.out.println("********************LISTADO*********************");
        for(Paciente paciente : pacientes){
        System.out.println("Paciente Ingresado: " + paciente.nombre);
        }

        System.out.println("************************************************");
    }
}
