package tp5.ej5;

public class Empleado {
    String nombre;
    String DNI;
    SueldoFijo sueldoMensualFijo;

    public Empleado(String nombre, String DNI, SueldoFijo sueldoMensualFijo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoMensualFijo = sueldoMensualFijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSueldoMensualFijo() {

        return sueldoMensualFijo.calcularSueldo();
    }

    public void setSueldoMensualFijo(SueldoFijo sueldoMensualFijo) {
        this.sueldoMensualFijo = sueldoMensualFijo;
    }



}
