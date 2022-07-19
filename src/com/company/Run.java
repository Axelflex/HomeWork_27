package com.company;

import java.util.*;

public class Run implements Runnable{
    Movies[] movies;
    public Run(Movies[] movies){
        this.movies = movies;
    }
    public void searchByName(String movieName){
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

    @Override
    public void run() {

    }
}
