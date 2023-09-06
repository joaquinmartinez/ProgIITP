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

public class AgendaPersonal {
    private ArrayList<Reunion> reuniones;
    private ArrayList<Contacto> contactos;

    public AgendaPersonal(){
        this.reuniones = new ArrayList<Reunion>();
        this.contactos = new ArrayList<Contacto>();
    }
    
    // Directamente le paso la reunion O que me llegue por parametros los valores de cada Atributo de esa Reunion??
    public void agregarReunion(String lugar, ArrayList<Contacto> contactos, String tema, LocalTime horario, int duracionEnMin){
        reuniones.add(new Reunion(lugar, contactos, lugar, null, 0));
    }

    //LO MISMO QUE ARRIBA
    public void agregarContacto(String numeroTelefonico, String mail){
        contactos.add(new Contacto(numeroTelefonico, mail));
    }

    public void verReunion(int indiceReunion){
        reuniones.get(indiceReunion).toString();
    }

    public void verContacto(int indiceContacto){
        contactos.get(indiceContacto).toString();
    }

    public static void main(String[] args) {
        AgendaPersonal agenda = new AgendaPersonal();
        agenda.agregarContacto("2271244", "joaquin@gmail");
        //agenda.agregarReunion("lUGARR", "2281417344", );
        //agenda.verReunion();


    }
    
}
