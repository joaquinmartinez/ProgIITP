package TP2Ejercicio2;
/*Agenda Personal
Una agenda personal permite registrar reuniones en las que el usuario va a participar. En
tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el
tema que van a tratar y la duración de la misma. Asimismo, deben registrarse lo
contactos telefónicos y mail de los asistentes.
Consejo: No todos los objetos son “palpables”
Extra: ¿Quién detecta un conflicto de horarios? */

import java.time.LocalTime;
import java.util.ArrayList;

public class Reunion {
    private String lugar;
    private ArrayList<Contacto> contactos;
    private String tema;
    private LocalTime horario;
    private int duracionEnMin;

    public Reunion(){
        lugar = "Aca a la vuelta";
        tema = "Messi";
        horario = LocalTime.of(17, 30);
        duracionEnMin = 60;
        contactos = new ArrayList<Contacto>(); //CREO LA LISTA
        for(int i = 0; i <10; i++){ //INTANCIO NUEVOS CONTACTOS
            contactos.add(new Contacto());
        }
    }

    public Reunion(String lugar, ArrayList<Contacto> contactos, String tema, LocalTime horario, int duracionEnMin){
        this.lugar = lugar;
        this.tema = tema;
        this.horario = horario;
        this.duracionEnMin = duracionEnMin;
        this.contactos = contactos;
        //AGREGAR ID
    }

    

    @Override
    public String toString() {
        return "Reunion [lugar=" + lugar + ", contactos=" + contactos + ", tema=" + tema + ", horario=" + horario
                + ", duracionEnMin=" + duracionEnMin + "]";
    }

    // GETTERS AND SETTERS
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public LocalTime getHorario() {
        return horario;
    }
    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }
    public int getDuracionEnMin() {
        return duracionEnMin;
    }
    public void setDuracionEnMin(int duracionEnMin) {
        this.duracionEnMin = duracionEnMin;
    }
    



}
