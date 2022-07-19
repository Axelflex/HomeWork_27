package com.company;

import java.util.*;

public class Run implements Runnable{
    Movies[] movies;
    public Run(Movies[] movies){
        this.movies = movies;
    }
    public void searchByFilmName(String movieName){
        Map<String, Movies> moviesMap = new HashMap<>();
        for (Movies movie : movies) {
            int check = movie.getName().toLowerCase().indexOf(movieName.toLowerCase());
            if (movieName.length() >= 2 && check >= 0) {
                moviesMap.put(movie.getName(), movie);
            }
        }
        System.out.println(moviesMap);
    }
    public void sortByDate(){
        Map<Integer, Movies> moviesMap = new HashMap<>();
        for (Movies movie : movies) {
            moviesMap.put(movie.getYear(), movie);
        }
        int i = 1;
        TreeMap<Integer, Movies> sortedByYear = new TreeMap<>(moviesMap);
        for (Map.Entry<Integer, Movies> m : sortedByYear.entrySet()){
            System.out.println(i + ")" +  m.getKey() + "(" + m.getValue() + ")");
            i++;
        }
    }
    public void sortByFilmName(){
        Map<String, Movies> moviesMap = new HashMap<>();
        for (Movies movie : movies) {
            moviesMap.put(movie.getName(), movie);
        }
        int i = 1;
        TreeMap<String, Movies> sortedByName = new TreeMap<>(moviesMap);
        for (Map.Entry<String, Movies> m : sortedByName.entrySet()){
            System.out.println(i + ")" +  m.getKey());
            i++;
        }
    }
    public void sortByProducerName(){
        Map<String, Movies> moviesMap = new HashMap<>();
        for (Movies movie : movies) {
            Director name = movie.getDirector();
            moviesMap.put(name.getFullName(), movie);
        }
        int i = 1;
        TreeMap<String, Movies> sortedByName = new TreeMap<>(moviesMap);
        for (Map.Entry<String, Movies> m : sortedByName.entrySet()){
            System.out.println(i + ")" +  m.getKey());
            i++;
        }
    }
    public void searchByActorName(String actorName){
        Map<String, Movies> moviesMap = new HashMap<>();
        for (Movies movie : movies) {
            Cast[] name = movie.getCast();
            for (Cast cast : name) {
                int check = cast.getFullName().toLowerCase().indexOf(actorName.toLowerCase());
                if (actorName.length() >= 2 && check >= 0) {
                    moviesMap.put(cast.getFullName(), movie);
                }
            }

        }
        System.out.println(moviesMap);
    }
    public void searchByDirectorName(String directorName){
        Map<String, Movies> moviesMap = new HashMap<>();
        for (Movies movie : movies) {
            Director name = movie.getDirector();
            int check = name.getFullName().toLowerCase().indexOf(directorName.toLowerCase());
            if (directorName.length() >= 2 && check >= 0) {
                moviesMap.put(name.getFullName(), movie);
            }

        }
        System.out.println(moviesMap);
    }
    public void searchByYear(int year){
        Map<Integer, Movies> moviesMap = new HashMap<>();
        for (Movies movie : movies) {
            int check = movie.getName().toLowerCase().indexOf(year);
            if (check >= 0) {
                moviesMap.put(movie.getYear(), movie);
            }
        }
        System.out.println(moviesMap);
    }
    public void searchListByActorName(String actorName){
        Map<String, Movies> moviesMap = new HashMap<>();
        for (Movies movie : movies) {
            Cast[] name = movie.getCast();
            for (Cast cast : name) {
                int check = cast.getFullName().toLowerCase().indexOf(actorName.toLowerCase());
                if (actorName.length() >= 2 && check >= 0) {
                    moviesMap.put(cast.getFullName(), movie);
                    System.out.println(cast.getFullName() + " " + movie.getName());
                }
            }
        }
        System.out.println(moviesMap);
    }

    @Override
    public void run() {

    }
}
