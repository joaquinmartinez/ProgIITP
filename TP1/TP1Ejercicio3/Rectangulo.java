package TP1Ejercicio3;

/*Implementar la clase Rectángulo.
Para esta clase es necesario definir el rectángulo utilizando los puntos como vértices. Se
trabajará con Rectángulos cuyos lados estén paralelos a los ejes.
Nota. Definir la estructura que deber poseer un rectángulo y en base a esto implementar
los atributos de la clase.
La funcionalidad que debe proveer un rectángulo es la siguiente
● Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
Y.
● Calcular el Área del rectángulo.
● Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
del mismo es mayor que la del otro.
● Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
propiedades para que sea un cuadrado.
● Determinar el largo del lado superior.
● Determinar si está acostado o parado (si el alto es más que el ancho) */

public class Rectangulo {
    private PuntoGeometrico esquinaSuperiorIzquierda;
    private PuntoGeometrico esquinaInferiorDerecha;



    public Rectangulo(PuntoGeometrico esquinaSuperiorIzquierda, PuntoGeometrico esquinaInferiorDerecha) {
        this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
        this.esquinaInferiorDerecha = esquinaInferiorDerecha;
    }

    public void desplazarseEnPlano(PuntoGeometrico esquinaSuperiorIzquierdaNuevo, PuntoGeometrico esquinaInferiorDerechaNuevo ){
        this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierdaNuevo;
        this.esquinaInferiorDerecha = esquinaInferiorDerechaNuevo;
    }

    public double calcularAreaRectangulo(){
        double base = Math.abs(esquinaSuperiorIzquierda.getX() - esquinaInferiorDerecha.getX());
        double altura = Math.abs(esquinaSuperiorIzquierda.getY() - esquinaInferiorDerecha.getY());
        return base * altura;
    }

    public int compararAreaDeRectangulos(Rectangulo r1){
        if(r1.calcularAreaRectangulo() > this.calcularAreaRectangulo())
            return 1;
        else if(r1.calcularAreaRectangulo() < this.calcularAreaRectangulo())
            return -1;
        else return 0;
    }

    public boolean esUnCuadrado(Rectangulo r1){
        double base = Math.abs(r1.getEsquinaSuperiorIzquierda().getX() - r1.getEsquinaInferiorDerecha().getX());
        double altura = Math.abs(r1.getEsquinaSuperiorIzquierda().getY() - r1.getEsquinaInferiorDerecha().getY());
        return base == altura;
    }

    public double largoLadoSuperior(Rectangulo r1){
       return Math.abs(r1.getEsquinaSuperiorIzquierda().getX() - r1.getEsquinaInferiorDerecha().getX());
    }

    public String estaAcostadoOParado(Rectangulo r1){
        double base = Math.abs(r1.getEsquinaSuperiorIzquierda().getX() - r1.getEsquinaInferiorDerecha().getX());
        double altura = Math.abs(r1.getEsquinaSuperiorIzquierda().getY() - r1.getEsquinaInferiorDerecha().getY());
        if(altura > base)
            return "Esta parado";
        else return "Esta acostado";
    }


    // GET AND SET
    public PuntoGeometrico getEsquinaSuperiorIzquierda() {
        return esquinaSuperiorIzquierda;
    }
    public void setEsquinaSuperiorIzquierda(PuntoGeometrico esquinaSuperiorIzquierda) {
        this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
    }
    public PuntoGeometrico getEsquinaInferiorDerecha() {
        return esquinaInferiorDerecha;
    }
    public void setEsquinaInferiorDerecha(PuntoGeometrico esquinaInferiorDerecha) {
        this.esquinaInferiorDerecha = esquinaInferiorDerecha;
    }

}


