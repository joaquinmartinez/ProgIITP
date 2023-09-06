package TP2Ejercicio2;
/*Agenda Personal
Una agenda personal permite registrar reuniones en las que el usuario va a participar. En
tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el
tema que van a tratar y la duración de la misma. Asimismo, deben registrarse lo
contactos telefónicos y mail de los asistentes.
Consejo: No todos los objetos son “palpables”
Extra: ¿Quién detecta un conflicto de horarios? */

public class Contacto {
    String numeroTelefonico;
    String mail;

    public Contacto(){
        numeroTelefonico = "2281417344";
        mail = "joaquinasfaijf@gmail.com.ar";
    }

    public Contacto(String numeroTelefonico, String mail){
        this.numeroTelefonico = numeroTelefonico;
        this.mail = mail;
    }
    

    @Override
    public String toString() {
        return "Contacto [numeroTelefonico=" + numeroTelefonico + ", mail=" + mail + "]";
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }
    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    

}
