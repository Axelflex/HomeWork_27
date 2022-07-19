package com.company;

import com.google.gson.JsonSerializer;

import java.io.IOException;
import java.util.*;
public class Task_1{

    public static void main(String[] args) {run();}
    public static void run() {
        try {
            Movies[] movies = FileService.readFile();
            Run run = new Run(movies);
//            System.out.println(Arrays.toString(movies));
//            String getMovie = new Scanner(System.in).nextLine();
//            run.searchByName(getMovie);
            run.sortByProducerName();


        }catch (IOException ignored){}
    }

}






















