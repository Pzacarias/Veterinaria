import java.util.Date;

public class Insumo {
    public String nombre;
    public int codigoDelInsumo;
    public Date fechaDeVencimiento;
    public int cantidad;
    public double precio;
    public double costo;

    public boolean estaVencido(){
        Date hoy = new Date();
        if(this.fechaDeVencimiento.after(hoy)){
            return true;
        }
        return false;

    }

}
