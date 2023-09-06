package TP2Ejercicio1;
/**Cada EPISODIO posee un título, una descripción, un flag indicando
si ya se vio el episodio y una calificación dada (con valores de 1 a 5). Si no se vio un
episodio particular, la calificación dada será un valor negativo. */
public class Episodio {
    private String titulo;
    private String descripcion;
    private int puntuacion;

    
    public Episodio(){
        titulo = "NN";
        descripcion = "NNNN";
        puntuacion = -1;
    }

    public Episodio(int puntuacion){
        titulo = "JJ";
        descripcion = "JJJJ";
        this.puntuacion = puntuacion;
    }

    /*● Ingresar la calificación de un episodio. Si el valor ingresado como calificación
    no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior. */

    //GETTERS AND SETTERS
    public void setPuntuacion(int puntuacion) {
        if(puntuacion>0 && puntuacion<6)
            this.puntuacion = puntuacion;
        else System.out.println("\"El valor tiene que ser entre 1 y 5\""); 
    }
    public int getPuntuacion() {
        return puntuacion;
    }



    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Descripcion: " + descripcion + ", Puntaje: " + puntuacion;
    }

    

    
    



    
}
