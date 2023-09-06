package TP4.Ejercicio3;

public class EmpleadoHorasExtras extends Empleado{
    int cantHorasExtras;
    int montoHoraExtra;
    
    public EmpleadoHorasExtras(String nombre, String dni, int salarioFijo, int cantHorasExtras, int montoHoraExtra) {
        super(nombre, dni, salarioFijo);
        this.cantHorasExtras = cantHorasExtras;
        this.montoHoraExtra = montoHoraExtra;
    }

    @Override
    public double getSalarioTotal(){
        return this.getSalarioFijo() + this.getCantHorasExtras() * this.getMontoHoraExtra();
    }

    

    public int getMontoHoraExtra() {
        return montoHoraExtra;
    }

    public void setMontoHoraExtra(int montoHoraExtra) {
        this.montoHoraExtra = montoHoraExtra;
    }

    public int getCantHorasExtras() {
        return cantHorasExtras;
    }

    public void setCantHorasExtras(int cantHorasExtras) {
        this.cantHorasExtras = cantHorasExtras;
    }

    
}
