package TP1Ejercicio3;
/* posee dos valores de coordenada X, Y.
El valor por defecto de los mismos es (0,0).
La FUNCIONALIDAD que posee la clase es la siguiente:
● Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
(cierto desplazamiento en X y cierto desplazamiento en Y).
● Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
euclídea con otro punto acorde a la siguiente formula:
Distancia2 = ( X1 – X2 )2 + (Y1 – Y2)2
La clase Math de Java define un método de clase sqrt para el cálculo de la raíz
cuadrada.*/

public class PuntoGeometrico {
    private double x;
    private double y;
    
    public PuntoGeometrico(){
        this.x = 0;
        this.y = 0;
    }
 
    public void desplazarPuntoEnPlano(double nuevoX, double nuevoY){
        this.x = nuevoX;
        this.y = nuevoY;
    }
    

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calcularDistanciaEuclidea(double x1, double y1, double x2, double y2){
        double distanciaCuadrada = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        double distancia = Math.sqrt(distanciaCuadrada);
        return distancia;
    }



    
    
}