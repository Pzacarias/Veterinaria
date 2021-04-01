public class App {
    public static void main(String[] args) throws Exception {
    Paciente perro = new Paciente();
    perro.nombre = "Emma";
    perro.especie = "Perro caniche.";
    perro.edad = 2;

    Paciente gato = new Paciente ();
    gato.nombre = "Lola";
    gato.especie = "Gato persa.";
    gato.edad = 8;

    Paciente perro2 = new Paciente();
    perro2.nombre = "Rocky";
    perro2.especie = "Perro ovejero alemán.";
    perro2.edad = 3;


    ClinicaVeterinaria vete = new ClinicaVeterinaria();
    vete.nombre = "Pupis";

    System.out.println("El nombre del primer paciente es " + perro.nombre + ".");
    System.out.println("El nombre del segundo paciente es " + gato.nombre + ".");
    System.out.println("El nombre del tercer paciente es " + perro2.nombre + ".");

    Cliente dueño1 = new Cliente ();
    dueño1.nombre = "Paula";
    dueño1.direccion = "Diego Carman 3041.";
    perro.dueño = dueño1;

    System.out.println("El dueño del primer paciente es " + perro.dueño.nombre + ".");

    Cliente dueño2 = new Cliente ();
    dueño2.nombre = "Johanna";
    gato.dueño = dueño2;
    perro2.dueño = dueño2;

    System.out.println("El dueño del segundo paciente es " + gato.dueño.nombre + ".");
    System.out.println("El dueño del tercer paciente es " + perro2.dueño.nombre + ".");
    }
  
}
