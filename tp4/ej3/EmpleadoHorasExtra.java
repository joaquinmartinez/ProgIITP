package tp4.ej3;

public class EmpleadoHorasExtra extends EmpleadoContratado{
    int horasExtra;
    double pagoPorHora;

    public EmpleadoHorasExtra(String nombre, double salarioSemanal, int horasExtra, double pagoPorHora) {
        super(nombre, salarioSemanal);
        this.horasExtra = horasExtra;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSueldo() {
        super.calcularSueldo();
        return getSalarioSemanal()+horasExtra*pagoPorHora;
    }
}
