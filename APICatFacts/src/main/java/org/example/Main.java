package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Window window = new Window();
        ObjectMapper objectMapper = new ObjectMapper();
        IntStream.range(1,100).forEach(number ->{
                try {
                    String response = (Unirest.get("https://jsonplaceholder.typicode.com/todos/" + number).asString().getBody());
                    toDo  toDo1= objectMapper.readValue(response,toDo.class);
                    System.out.println(toDo1.getTitle());
                }catch (UnirestException e) {
                    throw new RuntimeException();
                }catch (IOException e){
                    System.out.println("didnt work");
                }
        }
        );
    }
}