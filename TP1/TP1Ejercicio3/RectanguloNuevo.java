package TP1Ejercicio3;

public class RectanguloNuevo {
    PuntoGeometrico esquinaSuperiorIzquierda;
    PuntoGeometrico esquinaSuperiorDerecha;
    PuntoGeometrico esquinaInferiorIzquierda;
    PuntoGeometrico esquinaInferiorDerecha;
    double LadoA;
    double LadoB;

    // CONSTRUCTORES
    public RectanguloNuevo(PuntoGeometrico esquinaSuperiorIzquierda, double ladoA, double ladoB) {
        this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
        LadoA = ladoA;
        LadoB = ladoB;
    }

    public RectanguloNuevo(PuntoGeometrico esquinaSuperiorIzquierda, PuntoGeometrico esquinaSuperiorDerecha,
            PuntoGeometrico esquinaInferiorIzquierda, PuntoGeometrico esquinaInferiorDerecha) {
        this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
        this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
        this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
        this.esquinaInferiorDerecha = esquinaInferiorDerecha;
    }

    // FUNCIONALIDADES
    /*● Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
        Y.
        ● Calcular el Área del rectángulo.
        ● Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
        iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
        del mismo es mayor que la del otro.
        ● Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
        propiedades para que sea un cuadrado.
        ● Determinar el largo del lado superior.
        ● Determinar si está acostado o parado (si el alto es más que el ancho). */
    
    public void desplazarseEnPlano(){
        
    }

    // GETTERS AND SETTERS
    public PuntoGeometrico getEsquinaSuperiorIzquierda() {
        return esquinaSuperiorIzquierda;
    }

    public PuntoGeometrico getEsquinaSuperiorDerecha() {
        return esquinaSuperiorDerecha;
    }

    public PuntoGeometrico getEsquinaInferiorIzquierda() {
        return esquinaInferiorIzquierda;
    }

    public PuntoGeometrico getEsquinaInferiorDerecha() {
        return esquinaInferiorDerecha;
    }

    public double getLadoA() {
        return LadoA;
    }

    public double getLadoB() {
        return LadoB;
    }
    



    

}
