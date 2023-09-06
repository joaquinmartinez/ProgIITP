package TP1Ejercicio1;
/*
Implementar una clase llamada Persona con las siguientes características:
Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
Valores por defecto:
El DNI es un valor obligatorio, no posee valor por defecto.
En caso de la fecha de nacimiento será el 1 de enero de 2000.
Sexo será Femenino por defecto.
El nombre por defecto es N y el apellido es N.
El peso y la altura son 1 por defecto.
Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI nombre y
apellido, con DNI nombre apellido y Fecha de nacimiento…..
La responsabilidad de la clase es la siguiente:
Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
de masa corporal el cual es peso / altura2
Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
Saber si está cumpliendo años.
Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
años.
Métodos set de cada parámetro, excepto de DNI.
Saber si puede votar. Es necesario ser mayor de 16 años.
Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
Mostrar toda la información del objeto. Es decir devolver un String con la
información del mismo.
 */

import java.time.LocalDate;

public class Persona {
    private final double minimoIMC = 18.5;
    private final double maximoIMC = 25;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNac;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;
    
    // Constructor dni
    public Persona(int dni){
        this(dni,"N","N",LocalDate.of(2000, 1, 1),"Femenino", 1, 1);
    }
    // Constructor dni, nombre, apellido
    public Persona(int dni, String nombre, String apellido){
        this(dni);
        this.nombre = nombre;
        this.apellido = apellido;
    }
    // Constructor todo
    public Persona(int dni, String nombre, String apellido, LocalDate fechaNac,
                    String sexo, double peso, double altura){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int getEdad(){
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - fechaNac.getYear();
        if(hoy.getMonthValue() > fechaNac.getMonthValue())
        return edad;
        else {
            if(hoy.getMonthValue() < fechaNac.getMonthValue())
            return edad-1;
            else{
                if(hoy.getDayOfMonth() >= fechaNac.getDayOfMonth())
                return edad;
                else return edad-1;
            }
        }
    }
    
    //SETS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getIMC(){
        return peso / (altura * altura);
    }

    //METODOS
    public boolean estaEnForma(){
        double imc = this.getIMC();
        if(imc >= minimoIMC && imc <= maximoIMC)
            return true;
        else return false;
    }

    public boolean hoyCumpleAnios(){
        LocalDate hoy = LocalDate.now();
        return hoy.getMonthValue() == fechaNac.getMonthValue() &&
            hoy.getDayOfMonth() == fechaNac.getDayOfMonth();
    }

    public boolean esMayorDeEdad(){
        if(this.getEdad() >= 18)
            return true;
        else return false;
    }

    public boolean puedeVotar(){
        if(this.getEdad() >= 16)
            return true;
        else return false;
    }
    
    public String mostrarDatos(){
        return "DNI: " + this.dni + ", nombre: " + this.nombre + ", apellido: " + this.apellido + 
                            ", edad: " + this.edad  + ", altura: " + this.altura + ", peso: " + this.peso + 
                            ", sexo: " + this.sexo + ", fnac: " + this.fechaNac;
    }

    public static void main(String[] args) {
        Persona p1 = new Persona(1);
        System.out.println(p1.mostrarDatos());
    }

}