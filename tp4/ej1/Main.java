package tp4.ej1;

public class Main {
    public static void main(String[] args) {
        AlarmaLuminosa alarma = new AlarmaLuminosa();

        Sensor sensor1 = new Sensor("cocina",false,false,false);
        Sensor sensor2 = new Sensor("baño", false,true,false);
        Sensor sensor3 = new Sensor("habitacion 1", true,false,true);
        Sensor sensor4 = new Sensor("habitacion 2", false, false, true);
        Sensor sensor5 = new Sensor("garage", false, true,true);
        Sensor sensor6 = new Sensor("patio", true, false, false);

        alarma.addSensor(sensor1);
        alarma.addSensor(sensor2);
        alarma.addSensor(sensor3);
        alarma.addSensor(sensor4);
        alarma.addSensor(sensor5);
        alarma.addSensor(sensor6);
        alarma.comprobar();

    }
}
