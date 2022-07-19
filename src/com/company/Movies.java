package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Movies implements Comparable<Movies> {
    private String name;
    private int year;
    private String description;
    private Director director;
    private Cast[] cast;

    public Movies (){

    }

    public Cast[] getCast() {
        return cast;
    }

    public void setCast(Cast[] cast) {
        this.cast = cast;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Movies nameDirector) {
        return this.getDirector().getFullName().compareTo(nameDirector.getDirector().getFullName());
    }

    @Override
    public String toString() {
        return "\n" +
                "[name = {" + name + "} \n" +
                " year = {" + year + "} \n" +
                " description = {" + description + "} \n" +
                " director = {" + director.getFullName() + "} \n" +
                " cast = {" + Arrays.toString(cast) + "}]\n" ;
    }
}
