package IDSTAREA2;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class mongodbCon 
{
    public static void main( String[] args )
    {
        //Connect and create a document on a Mongodb Atlas cluster
        MongoClient client = MongoClients.create("ConnectionString");
        MongoDatabase db = client.getDatabase("DatabaseName");

        MongoCollection col = db.getCollection("CollectionName");

        Document sampleDoc = new Document("_id", "1").append("Name", "Name1");

        col.insertOne(sampleDoc);
    }
}
