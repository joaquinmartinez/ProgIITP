package tp4.ej3;

public class EmpleadoComision extends EmpleadoContratado{
    int ventas;
    int comision;

    public EmpleadoComision(String nombre, double salarioSemanal, int ventas, int comision) {
        super(nombre, salarioSemanal);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcularSueldo() {
        super.calcularSueldo();
        return getSalarioSemanal()+ventas*comision;
    }
}
