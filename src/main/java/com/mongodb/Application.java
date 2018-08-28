package com.mongodb;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.connector.Connector;
import com.mongodb.entity.Car;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {

    public static void main (String args[]){

        Connector connector = new Connector();
        connector.setDatabase("firstMongoDB");
        MongoDatabase firstMongoDB = connector.getDatabase();

        MongoCollection<Document> cars = firstMongoDB.getCollection("Car");
        FindIterable<Document> carIterator = cars.find();

        Iterator iterator = carIterator.iterator();
        List<Car> carsList = new ArrayList<Car>();


        while(iterator.hasNext()){
            Document document = (Document) iterator.next();
            carsList.add(new Car(document.getDouble("id"), document.getString("name"),
                    document.getString("category"), document.getDouble("doorsAmount")));
        }

        carsList.forEach(System.out::println);
    }
}
