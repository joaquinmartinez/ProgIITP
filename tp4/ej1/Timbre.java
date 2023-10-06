package tp4.ej1;

public class Timbre {
    private boolean prendida;

    public Timbre() {
        this.prendida = false;
    }

    public void hacerSonar() {
        this.prendida = true;
        System.out.println("Timbre sonando");
    }

    public void apagar() {
        this.prendida = false;
        System.out.println("Timbre apagado");
    }
}
