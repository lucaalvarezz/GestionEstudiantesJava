public class Estudiante {

    // Atributos de la clase
    private String nombre;
    private String matricula;
    private String carrera;
    private double promedio;

    // Constructor para inicializar los datos del estudiante
    public Estudiante(String nombre, String matricula, String carrera, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Método para mostrar los datos del estudiante
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }
}