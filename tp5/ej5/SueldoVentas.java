package tp5.ej5;

public class SueldoVentas extends SueldoFijo {
    double ventas;
    double porcentajePorVentas;

    public SueldoVentas(double sueldoMensual, double ventas, double porcentajePorVentas) {
        super(sueldoMensual);
        this.ventas = ventas;
        this.porcentajePorVentas = porcentajePorVentas;
    }


    /*public SueldoVentas() { //no se porque se hize este, borrar?¿
        this.ventas = ventas;
        this.porcentajePorVentas = porcentajePorVentas;
    }*/


    public double getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public double getPorcentajePorVentas() {
        return porcentajePorVentas;
    }

    public void setPorcentajePorVentas(int porcentajePorVentas) {
        this.porcentajePorVentas = porcentajePorVentas;
    }

    public double calcularSueldo() {
        super.calcularSueldo();
        return sueldoMensual+((ventas/100)*porcentajePorVentas);
    }

}
