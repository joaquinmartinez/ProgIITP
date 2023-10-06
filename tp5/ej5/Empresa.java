package tp5.ej5;

/*
5 - Facturación de empleados
Una empresa solicitó crear un sistema para organizar la facturación de sus empleados.
Por cada empleado la empresa almacena el nombre, el apellido, el DNI, y el sueldo mensual.
Por ejemplo, el empleado Juan Hernández (DNI: 27.832.123) tiene un sueldo mensual de
$17.000. A su vez, la empresa indicó que algunos de sus empleados se dedican a vender, y
para motivarlos, aparte del sueldo básico les ofrecen un extra por ventas. Este extra consiste
en un porcentaje del total de ventas que haya logrado el empleado durante el mes. Por
ejemplo, el empleado Martin tiene un sueldo de $15.000, y aparte tiene un extra equivalente
al 5% de todas sus ventas, en cambio, Pablo tiene un sueldo de $13.000, pero consigue un
extra equivalente al 10% de sus ventas.
a) Diseñar en POO las clases necesarias para poder modelar cualquiera de los
empleados. Recuerde utilizar los conceptos vistos en clase.
b) A partir del listado de empleados la empresa desea poder saber la suma total de gastos
en sueldos.
c) ¿Cómo debería modificar mi solución para agregar nuevos tipos de empleados?
Empleado con bonos. Algunos empleados reciben un bono adicional a su sueldo si logran
concretar cierto número de ventas. Por ejemplo, Julián recibe un bono de $1000 si logra
concretar al menos 50 ventas, mientras que Mauro recibe un bono de $3000 si concreta al
menos 100 ventas.
 */

import java.util.ArrayList;

// empresa -> almacena X empleado -> nombre, apellido, dni, sueldo mensual
// empresa -> empleado -> sueldo mensual + porcentajePorVentas % de todas sus ventas
// empresa -> a partir de listado de empleados -> suma total de gasto en sueldos
// empresa -> empleadoConBonos -> ej if ventas > 100 dar bono $3000
public class Empresa {
    ArrayList<Empleado> empleados;

    public Empresa(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }


}
