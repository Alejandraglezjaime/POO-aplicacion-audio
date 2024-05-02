package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        cancion.setTitulo("Forever");
        cancion.setCantante("Kis");

        Podcast podcast = new Podcast();
        podcast.setPresentador("Gabriela Aguilar");
        podcast.setTitulo("Cafe.Tech");

        for (int i = 0; i <10000; i++) {
            cancion.meGusta();
        }
        for (int i = 0; i < 6000; i++) {
            cancion.reproduce();
        }
        for (int i = 0; i <50; i++) {
            podcast.meGusta();
        }
        for (int i = 0; i < 500; i++) {
            podcast.reproduce();
        }

        System.out.println("Número de reproducciones: "+cancion.getTotalDeReproducciones());
        System.out.println("Número de me gusta: "+cancion.getTotalMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(podcast);
        favoritos.adicione(cancion);

        //NOTA: A NUMERO DE REPRODUCCIONES Y ME GUSTA AGREGARLE EL TITULO

    }
}
