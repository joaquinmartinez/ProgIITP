package tp4.ej1;

/*
1 - Alarma
Implementar en Java toodo el codigo necesario para el funcionamiento de una alarma. La
alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
sonora.
Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
encienda una luz cuando alguno de los indicadores está activado.
Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
método encender().
 */

import java.util.ArrayList;

//GRIMVALOR
public class Alarma {
    ArrayList<Sensor> sensores;
    private Timbre timbre;

    public Alarma() {
        this.timbre = new Timbre();
        this.sensores = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        this.sensores.add(sensor);
    }

    public void sonarAlarma() {
        this.timbre.hacerSonar();
    }

    public ArrayList<String> getZonaEnConflicto() {
        ArrayList<String> zonaEnConflicto = new ArrayList<>();
        for (Sensor s:sensores) {       //izq (tipo "Sensor" y nombre del indice "s") , der (la coleccion "sensores")
            if (s.getConflicto()) {
                zonaEnConflicto.add(s.getZona());
            }
        }
        return zonaEnConflicto;
        }

    public void comprobar() {
        if (!getZonaEnConflicto().isEmpty()) {
            sonarAlarma();
            System.out.println("Zonas en conflicto: ");
            for (String s:getZonaEnConflicto()){
                System.out.println( s );
            }
        }
        else {
            System.out.println("Todo en orden mi rey, siga durmiendo y guarda la 9mm");
        }
    }

}
