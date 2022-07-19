package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class FileService {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static Movies[] readFile() throws IOException{
        try (Reader reader = new FileReader("./movies.json")) {
            return gson.fromJson(reader, Movies[].class);
        }
    }
}
