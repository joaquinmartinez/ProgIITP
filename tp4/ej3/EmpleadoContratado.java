package tp4.ej3;

/*
3 - Sueldos
Una empresa de informática posee tres tipos de empleados. Los empleados contratados
reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados
por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
cantidad de ventas realizadas.
Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al finalizar la semana.
 */

//EmpeladoContratado - salario fijo semanal sin importar horas trabajadas
//EmpleadoHorasExtra - salario fijo semanal + monto X hora extra trabajada
//EmpleadoComision - salario fijo semanal + porcentaje X cant de ventas realizadas

//Implementar sistema que permita saber cuánto se le debe pagar a un empleado al finalizar la semana.
public class EmpleadoContratado {
    String nombre;
    double salarioSemanal;

    public EmpleadoContratado(String nombre, double salarioSemanal) {
        this.nombre = nombre;
        this.salarioSemanal = salarioSemanal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public double calcularSueldo() {
        return getSalarioSemanal();
    }
}
