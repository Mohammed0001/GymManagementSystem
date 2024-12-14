
package mms.gymmanagementserver;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;
import org.bson.Document;
import services.Progress;
import users.Person;

/**
 *
 * @author Mohammed ABou Bakr
 */
public class DBConnector {

    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    private Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    ;
    private static DBConnector activeConn;

    private DBConnector() {
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        // Initialize
        client = new MongoClient();
        database = client.getDatabase("GymManagement"); // Database name
        collection = database.getCollection("Depertmant"); // Collection name
    }

    public static DBConnector connectDB() {
        if (activeConn == null) {
            activeConn = new DBConnector();
        }
        return activeConn;
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

    public <T> ArrayList<T> readAllFromDB(String coll, Class<T> cls) {
        ArrayList<T> results = new ArrayList<>();
        collection = database.getCollection(coll);
        try {
            FindIterable<Document> documents = collection.find();
            for (Document document : documents) {
                T obj = gson.fromJson(document.toJson(), cls);
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

    public Person login(String email, String password) {
        collection = database.getCollection("Person");
        Person result = null;
        try {
            Document document = collection.find(Filters.and(Filters.eq("email", email), Filters.eq("password", password))).first();
            if (document != null) {
                result = gson.fromJson(document.toJson(), Person.class);
            }
        } catch (Exception e) {
            System.out.println("Error Read: " + e);
        }
        return result;
    }
    
    public Progress getProgressByPersonId(int personId) {
    collection = database.getCollection("Progress");
    Progress result = null;
    try {
        Document document = collection.find(eq("personId", personId)).first();
        if (document != null) {
            result = gson.fromJson(document.toJson(), Progress.class);
        }
    } catch (Exception e) {
        System.out.println("Error fetching progress: " + e.getMessage());
    }
    return result;
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
                createCollection("Report");
                createCollection("TrainingClass");
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
