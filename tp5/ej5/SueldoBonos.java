package tp5.ej5;

public class SueldoBonos extends SueldoVentas {
    int bono;
    int minVentas;

    public SueldoBonos(double sueldoMensual, double ventas, double porcentajePorVentas, int bono, int minVentas) {
        super(sueldoMensual, ventas, porcentajePorVentas);
        this.bono = bono;
        this.minVentas = minVentas;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public int getMinVentas() {
        return minVentas;
    }

    public void setMinVentas(int minVentas) {
        this.minVentas = minVentas;
    }

    public boolean cumpleVentas() {
        return ventas >= minVentas;
    }

    @Override
    public double calcularSueldo() {
        super.calcularSueldo();
        if (cumpleVentas()) {
            return sueldoMensual+((ventas/100)*porcentajePorVentas)+bono;
        }
        else
            return sueldoMensual+((ventas/100)*porcentajePorVentas);
    }
}
