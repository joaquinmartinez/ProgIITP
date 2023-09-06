package TP4.Ejercicio1y2;
/*2- Alarma Sensorial
Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se
cambien por sensores que poseen un comportamiento y pueden sondear diferentes partes de
la casa. Cada sensor posee el nombre de la zona que controla. Permitir que se incorporen
nuevos sensores. Modificar la alarma para que además de hacer sonar el timbre, imprima por
pantalla el nombre de la zona en conflicto (pueden ser más de una). */
public class Sensor {
    protected String lugar;
    protected boolean rompioVidrio;
    protected boolean seAbrioPuertaOVentana;
    protected boolean detectoMovimiento;

    public Sensor(String lugar){
        this.lugar = lugar;
    }

    public boolean comprobar(){
        if(this.getRompioVidrio() || this.getSeAbrioPuertaOVentana() || this.getDetectoMovimiento() )
            return true;
        else return false;
    }

    public String toString(){
        return "La zona en conflicto es: " + lugar;
    }




    //GETTERS AND SETTERS
    public boolean getRompioVidrio() {
        return rompioVidrio;
    }

    public void setRompioVidrio(boolean rompioVidrio) {
        this.rompioVidrio = rompioVidrio;
    }

    public boolean getSeAbrioPuertaOVentana() {
        return seAbrioPuertaOVentana;
    }

    public void setSeAbrioPuertaOVentana(boolean seAbrioPuertaOVentana) {
        this.seAbrioPuertaOVentana = seAbrioPuertaOVentana;
    }

    public boolean getDetectoMovimiento() {
        return detectoMovimiento;
    }

    public void setDetectoMovimiento(boolean detectoMovimiento) {
        this.detectoMovimiento = detectoMovimiento;
    }

}
