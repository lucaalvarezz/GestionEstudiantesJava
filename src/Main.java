public class Main {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Luis", "A12345", "Ingenieria", 9.3);
        Estudiante e2 = new Estudiante("Ana", "A54321", "Arquitectura", 8.7);

        e1.mostrarDatos();
        System.out.println("--------------------");
        e2.mostrarDatos();
    }
}