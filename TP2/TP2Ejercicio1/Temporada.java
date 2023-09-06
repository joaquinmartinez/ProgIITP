package TP2Ejercicio1;

import java.util.ArrayList;

public class Temporada {
    private ArrayList<Episodio> episodios;
    private int numeroTemporada;
    
    public Temporada(){
        episodios = new ArrayList<Episodio>();
        for (int i = 0; i < 10; i++) {
            episodios.add(new Episodio());
        }
    }

    /*● Obtener el total episodios vistos de una temporada particular. */
    public int totalEpisodiosVistosTemporada(){
        int total = 0;
        for (Episodio episodio : episodios) {
           int puntaje = episodio.getPuntuacion();
           if(puntaje > 0){
                total++;
            }
        }
        return total;
    }

    public double getPromedioEpisodiosVistos(){
        int total = 0;
        for (Episodio epis : episodios) {
            total += epis.getPuntuacion();
        }
        return total / episodios.size();
    }

    public boolean getVioTodosEpisodios(){
        boolean vioTodo = true;
        for (Episodio ep : episodios) {
            if(ep.getPuntuacion() == -1){
                return false;
            }
        }
        return vioTodo;
    }
    
    
    // GETTERS AND SETTERS
    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }
    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }
    public int getNumeroTemporada() {
        return numeroTemporada;
    }
    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }



    public static void main(String[] args) {
        ArrayList<Episodio> episodios = new ArrayList<Episodio>();
        Episodio ep1 = new Episodio(4);
        Episodio ep2 = new Episodio(5);
        episodios.add(ep1);
        episodios.add(ep2);
        System.out.println(ep1);
        System.out.println(ep2);
    }

    
    
    
    
    
    
    
    
    
}
