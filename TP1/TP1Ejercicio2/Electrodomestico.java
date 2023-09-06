package TP1Ejercicio2;

/* ATRIBUTOS: nombre, precio base, color, consumo energético y peso.
Valores por defecto:
● El color por defecto es gris plata.
● El consumo energético 10 Kw.
● Precio base 100 pesos.
● El peso es 2 kg.
Implementar todos los constructores. 
La FUNCIONALIDAD de la clase es la siguiente:
● Todos los métodos get y set.
● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw).
● Calcular el balance, el mismo es el resultado de dividir el costo por el peso.
● Indicar si un producto es de alta gama, el balance es mayor que 3.
*/

public class Electrodomestico {
    private String nombre;
    private double precioBase;
    private String color;
    private int consumoEnerg;
    private double peso;
    
    // CONSTRUCTORES
    public Electrodomestico(){
    this.color = "gris plata";
    this.consumoEnerg = 10;
    this.precioBase = 100;
    this.peso = 2;
    }

    public Electrodomestico(String nombre, double precioBase, String color, int consumoEnerg, double peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnerg = consumoEnerg;
        this.peso = peso;
    }

    // GET AND SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoEnerg() {
        return consumoEnerg;
    }

    public void setConsumoEnerg(int consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // METODOS

    public boolean esBajoConsumo(){
        if(this.getConsumoEnerg() < 45)
            return true;
        else return false; 
    }

    public double getBalance(){
        return getPrecioBase()/getPeso();
    }

    public boolean esAltaGama(){
        if(getBalance() > 3)
            return true;
        else return false;
    }

    
    






}

