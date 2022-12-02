package app;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class MongoDbTeste {
	public static void main(String[] args) {
		try (MongoClient mongoClient = MongoClients.create()) {
			for (String listDatabaseName : mongoClient.listDatabaseNames()) {
				System.out.println(listDatabaseName);
			}

			MongoDatabase database = mongoClient.getDatabase("ucs");
			MongoCollection<Document> collection = database.getCollection("chess_matches");
			Document doc = collection.find(Filters.eq("title", "Back to the Future")).first();
			assert doc != null;
			System.out.println(doc.toJson());
		}
	}
}
