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
public class Pais {
    private ArrayList<Provincia> provincias;

    public Pais(){
        this.provincias = new ArrayList<Provincia>();
        //ArrayList<Provincia> provincias = new ArrayList<Provincia>();
    }

    public ArrayList<Provincia> getProvinciasMitadDeficit(){
        ArrayList<Provincia> provinciasDeficit = new ArrayList<Provincia>();
        for(int i = 0; i < provincias.size(); i++){
            if(provincias.get(i).getMasMitadDeficit()){
                provinciasDeficit.add(provincias.get(i));
            }
        }
        return provinciasDeficit;
        //O CREAR UN METODO EN PROVINCIA QUE DEVUELVA EL STRING DE LAS CIUDADES QUE LE LLEGUEN 
        // POR PARAMETRO?? O QUE LE LLEGUE LA LISTA A IMPRIMIR DIRECTAMENTE?? ToString??
    }

    //public ciudadesEnDeficit

}
