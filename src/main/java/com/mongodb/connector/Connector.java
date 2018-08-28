package com.mongodb.connector;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

public class Connector {

    MongoClient mongoClient;
    MongoDatabase database;

    public Connector(){
        this.mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:25006"));
    }

    public MongoDatabase getDatabase(){
        return this.database;
    }

    public void setDatabase(String database){
        this.database = this.mongoClient.getDatabase(database);
    }

}
