package TP4.Ejercicio1y2;

public class SensorLiving extends Sensor{
    
    public SensorLiving(String lugar){
        super(lugar);
    }

    public String mostrarZonaEnConflicto(){
        if(this.comprobar()){
           return this.toString();
        }
        else return "No hay zona en conflicto";
    }

    


}
