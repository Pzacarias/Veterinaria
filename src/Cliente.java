import java.util.Date;

public class Cliente extends Persona {
    public int numeroDeCliente;
    public String formaDePago;
    public Date ultimaVisita;
    private String palabraSecreta;

    public void generarPalabraSecreta() {
        this.palabraSecreta = "EmmaSashaG.44";

    }
}