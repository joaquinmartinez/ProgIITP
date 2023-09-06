package TP2Ejercicio3;
/*3) Sistema de Control de Gastos Públicos:
Un país tiene que controlar el gasto público de las ciudades con más de 100.000
habitantes. Para ello, tiene información del monto recaudado por cada ciudad a través de
cinco diferentes tipos de impuestos (denominados, aquí, de imp1, imp2, imp3, imp4 e
imp5) e información acerca de gastos realizados en mantenimiento de la ciudad. 
Este país necesita un sistema que le informe cuales son las ciudades que gastan más de lo
que recaudan, y las provincias que tienen más de la mitad de las ciudades en condición
de déficit.
Consejo: Tener en cuenta la información que contienen los distintos impuestos
Extra: ¿En que afecta el tamaño de la ciudad?*/
import java.util.ArrayList;
public class Ciudad {
    private ArrayList<Impuesto> impuestos;
    private int poblacion;
    private int gastos;

    public Ciudad(int poblacion){
        this.impuestos = new ArrayList<Impuesto>();
        this.poblacion = poblacion;
    }

    public double getRecaudacionImpuestos(){
        int suma = 0;
        for(int i = 0; i<impuestos.size(); i++){
            suma += impuestos.get(i).getImporte();
        }
        return suma;
    }

    public double getBalanceTotal(){
        return this.getRecaudacionImpuestos() - this.gastos;
    }


    public int getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    public int getGastos() {
        return gastos;
    }
    public void setGastos(int gastos) {
        this.gastos = gastos;
    }

    

}
