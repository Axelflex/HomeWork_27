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

        }catch (IOException ignored){}
    }

}






















