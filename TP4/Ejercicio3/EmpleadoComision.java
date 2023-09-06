package TP4.Ejercicio3;

public class EmpleadoComision extends Empleado{
    int nroVentas;
    double comisionPorVenta;


    public EmpleadoComision(String nombre, String dni, int salarioFijo, int nroVentas, double comisionPorVenta) {
        super(nombre, dni, salarioFijo);
        this.nroVentas = nroVentas;
        this.comisionPorVenta = comisionPorVenta;
    }

    @Override
    public double getSalarioTotal(){
        return this.getSalarioFijo() + this.getNroVentas() * this.getComisionPorVenta();
    }


    public int getNroVentas() {
        return nroVentas;
    }


    public void setNroVentas(int nroVentas) {
        this.nroVentas = nroVentas;
    }


    public double getComisionPorVenta() {
        return comisionPorVenta;
    }


    public void setComisionPorVenta(double comisionPorVenta) {
        this.comisionPorVenta = comisionPorVenta;
    }

    


    

    
}
