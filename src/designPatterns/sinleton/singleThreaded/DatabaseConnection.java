package designPatterns.sinleton.singleThreaded;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection() {}

    public static DatabaseConnection createInstance() {
        if (databaseConnection == null) {
           databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }

}
