package tp4.ej1;

public class AlarmaLuminosa extends Alarma{
    private Luz luz;

    public AlarmaLuminosa() {
        this.luz = new Luz();
    }

    public void sonarAlarma() {
        super.sonarAlarma();
        this.luz.encender();
    }

}
