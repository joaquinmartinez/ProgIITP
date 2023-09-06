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
public class Impuesto {
    private String nombreImpuesto;
    private int importe;

    

    public Impuesto(String nombreImpuesto, int importe) {
        this.nombreImpuesto = nombreImpuesto;
        this.importe = importe;
    }

    

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public int getImporte() {
        return importe;
    }
    public String getNombreImpuesto() {
        return nombreImpuesto;
    }
    public void setNombreImpuesto(String nombreImpuesto) {
        this.nombreImpuesto = nombreImpuesto;
    }


    

}
