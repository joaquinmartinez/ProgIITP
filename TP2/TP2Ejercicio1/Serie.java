package TP2Ejercicio1;

import java.util.ArrayList;

public class Serie {
    private ArrayList<Temporada> temporadas;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;

    public Serie(){
        temporadas = new ArrayList<Temporada>();
        for (int i = 0; i < 10; i++) {
            temporadas.add(new Temporada());
        }
    }
    
    /*● Obtener el promedio de las calificaciones dadas para una temporada particular. */
    public double promedioEpisodiosVistos(int numeroTemporada){
        return temporadas.get(numeroTemporada+1).getPromedioEpisodiosVistos();
    }

    /*● Obtener el total de episodios vistos de una serie. */
    public int totalEpisodiosVistosSerie(String titulo){
        int total = 0;
        for(int i = 0; i<temporadas.size(); i++){
            total += temporadas.get(i).totalEpisodiosVistosTemporada();
        }
        return total;
    }

    /*● Obtener el promedio de las calificaciones dadas para una serie. */
    public double promedioSerie(){
        int total = 0;
        for (Temporada temp : temporadas) {
            total += temp.getPromedioEpisodiosVistos();
        }
        return total / temporadas.size();
    }

    /*● Determinar si se vio todos los episodios de la serie. */
    public boolean vioTodosLosEpisodios(){
        for (Temporada temp: temporadas) {
            if(temp.getVioTodosEpisodios() == false){ 
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Temporada> temporadas = new ArrayList<Temporada>();
        for (int i = 0; i < temporadas.size(); i++) {  // ESTA BIEN??
            temporadas.add(new Temporada());
        }
    }

    //GETTERS AND SETTERS
    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }


    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getCreador() {
        return creador;
    }


    public void setCreador(String creador) {
        this.creador = creador;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    

    

}
