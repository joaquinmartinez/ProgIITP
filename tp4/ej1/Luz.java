package tp4.ej1;

public class Luz {
    private boolean prendida;

    public Luz() {
        this.prendida = false;
    }

    public void encender() {
        this.prendida = true;
        System.out.println("Luz encendida");
    }

    public void apagar() {
        this.prendida = false;
        System.out.println("Luz apagada");
    }

}
