package hello;

import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class HelloWorld {
	public static void main(String[] args) {
		try (MongoClient mongoClient = MongoClients.create()) {
			for (String listDatabaseName : mongoClient.listDatabaseNames()) {
				System.out.println(listDatabaseName);
			}

//			MongoDatabase database = mongoClient.getDatabase("sam/*ple_mflix");
//			MongoCollection<Document> collection = database.getCollection("movies");
//			Document doc = collection.find(eq("title", "Back to the Future")).first();
//			assert doc != null;
//			System.out.println(doc.toJson());*/
		}

		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}
