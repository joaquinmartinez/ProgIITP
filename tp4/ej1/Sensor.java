package tp4.ej1;

import java.util.ArrayList;

public class Sensor extends Alarma{
    String zona;
    Boolean seRompioVidrio;
    Boolean seAbrioAlgo;
    Boolean seDetectoMovimiento;

    public Sensor(String zona, Boolean seRompioVidrio, Boolean seAbrioAlgo, Boolean seDetectoMovimiento) {
        this.zona = zona;
        this.seRompioVidrio = seRompioVidrio;
        this.seAbrioAlgo = seAbrioAlgo;
        this.seDetectoMovimiento = seDetectoMovimiento;
    }

    public boolean getConflicto() {
        if ((seRompioVidrio) || (seAbrioAlgo) || (seDetectoMovimiento)){
            return true;
        }
        else
            return false;
    }

    public String getZona() {
        return zona;
    }
}
