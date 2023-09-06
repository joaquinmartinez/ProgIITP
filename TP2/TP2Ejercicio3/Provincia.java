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
public class Provincia {
    private int id;
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre) {
        //this.id = 1; VER SI EL ID HAY QUE INCREMENTARLO
        this.nombre = nombre;
        this.ciudades = new ArrayList<Ciudad>();
    }

    public boolean getMasMitadDeficit(){
        int contador = 0;
        for(int i = 0; i < ciudades.size(); i++){
            if(ciudades.get(i).getPoblacion() > 100000 &&
                ciudades.get(i).getBalanceTotal() < 0){
                contador++;
            }
        }
        return (contador > (ciudades.size()/2));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
