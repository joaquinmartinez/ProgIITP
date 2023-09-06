package TP4.Ejercicio3;
/*3 - Sueldos
Una empresa de informática posee tres tipos de empleados. Los empleados contratados
reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados
por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
cantidad de ventas realizadas.
Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al finalizar
la semana. */
public class Empleado {
    String nombre;
    String dni;
    int salarioFijo;
    
    public Empleado(String nombre, String dni, int salarioFijo) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioFijo = salarioFijo;
    }

    public double getSalarioTotal(){
        return this.getSalarioFijo(); //CHUSMEAR
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(int salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    
}
