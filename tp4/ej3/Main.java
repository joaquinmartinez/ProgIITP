package tp4.ej3;

public class Main {
    public static void main(String[] args) {
        EmpleadoContratado empleado1 = new EmpleadoContratado("Roberto",200);
        EmpleadoContratado empleado2 = new EmpleadoContratado("Miguel",300);
        EmpleadoHorasExtra empleado3 = new EmpleadoHorasExtra("Marcos",1000,4,100);
        EmpleadoComision empleado4 = new EmpleadoComision("Lucas",2000,100,5);

        System.out.println(empleado1.calcularSueldo());
        System.out.println(empleado2.calcularSueldo());
        System.out.println(empleado3.calcularSueldo());
        System.out.println(empleado4.calcularSueldo());
    }
}
