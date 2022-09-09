package com.peaksoft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.nio.file.*;
import java.util.PrimitiveIterator;

public class Main {

    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson gson = BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Paths.get("./cars.json");


    public static void main(String[] args) {

        Car[] cars = {
                Car.makeCar("X6",5000,Model.BMW),
                Car.makeCar("A6",3000,Model.AUDI),
                Car.makeCar("CAMRY",4000,Model.TOYOTA),
                Car.makeCar("X1",5000,Model.TESLA),
        };
        String allCars = gson.toJson(cars);
        //System.out.println(allCars);

       // writeFile(allCars);
        System.out.println(readFile());



    }
    private static void writeFile(String object) {
        Path write = Paths.get(WRITE_PATH.toUri());

        try {
            Files.writeString(write, object, StandardOpenOption.CREATE
                    , StandardOpenOption.WRITE);
        } catch (Exception e) {
            e.getMessage();
        }
    }
        private static String readFile(){
        String json = "";
        try{

            FileReader reader = new FileReader(String.valueOf(WRITE_PATH));
            int a;
            while((a = reader.read()) != -1){
                json += (char)a;
            }

        }catch (Exception e){
            e.getMessage();
        }

return  json;
    }

}