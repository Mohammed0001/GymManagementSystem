
package mms.gymmanagementserver;

/**
 *
 * @author Mohammed ABou Bakr
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.CreateCollectionOptions;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.types.ObjectId;

public class DBConnector {

    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    private Gson gson = new Gson();

    public DBConnector() {
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("GymManagement"); // Database name
        collection = database.getCollection("Depertmant"); // Collection name

    }

    public boolean inserIntoDB(Object obj, String coll) {
        String json = gson.toJson(obj);
        collection = database.getCollection(coll);
        Document document = Document.parse(json);
        try {
            collection.insertOne(document);
        } catch (Exception e) {
            System.out.println("Error Insert : " + e);
            return false;
        }
        return true;
    }

    public ArrayList<Object> readAllFromDB(String coll, Class<?> cls) {
        ArrayList<Object> results = new ArrayList<>();
        collection = database.getCollection(coll);
        try {
            FindIterable<Document> documents = collection.find();
            for (Document document : documents) {
                Object obj = gson.fromJson(document.toJson(), cls);
                results.add(obj);
            }
        } catch (Exception e) {
            System.out.println("Error Read All: " + e);
        }
        return results;
    }

    public <T> T readFromDB(int id, String coll, Class<?> cls) {
        collection = database.getCollection(coll);
        T result = null;
        try {
            Document document = collection.find(eq("id", id)).first();
            if (document != null) {
                result = (T) gson.fromJson(document.toJson(), cls);
            }
        } catch (Exception e) {
            System.out.println("Error Read: " + e);
        }
        return result;
    }

    public boolean updateInDB(int id, Object obj, String coll) {
        String json = gson.toJson(obj);
        Document document = Document.parse(json);
        collection = database.getCollection(coll);
        try {
            UpdateResult result = collection.replaceOne(eq("id", id), document);
            return result.getModifiedCount() > 0;
        } catch (Exception e) {
            System.out.println("Error Update : " + e);
            return false;
        }
    }

    public boolean deleteFromDB(int id, String coll) {
        collection = database.getCollection(coll);
        try {
            DeleteResult result = collection.deleteOne(eq("id", id));
            return result.getDeletedCount() > 0;
        } catch (Exception e) {
            System.out.println("Error Delete : " + e);
            return false;
        }
    }

    public boolean runOnce() {
        String dbName = "GymManagement";
        try {
            boolean dbExists = client.listDatabaseNames().into(new ArrayList<>()).contains(dbName);

            if (!dbExists) {
                MongoDatabase newDatabase = client.getDatabase(dbName);
                createCollection("Payment");
                createCollection("Progress");
                createCollection("Session");
                createCollection("Branch");
                createCollection("Person");
                createCollection("Feedback");
                createCollection("Inventory");
                createCollection("Complaint");
                createCollection("Subscription");
                System.out.println("Database created successfully: " + dbName);
            } else {
                System.out.println("Database already exists: " + dbName);
            }

            return true;
        } catch (Exception e) {
            System.out.println("Error creating database: " + e.getMessage());
            return false;
        }

    }

    public boolean createCollection(String collectionName) {
        try {
            database.createCollection(collectionName);
            System.out.println("Collection created successfully: " + collectionName);
            return true;
        } catch (Exception e) {
            System.out.println("Error creating collection: " + e.getMessage());
            return false;
        }
    }

}
