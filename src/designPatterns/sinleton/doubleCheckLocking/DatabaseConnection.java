package designPatterns.sinleton.doubleCheckLocking;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection() {}

    public static DatabaseConnection createInstance() {
        if (databaseConnection == null) { // t1, t2 -> first check is without lock
            synchronized (DatabaseConnection.class) { // Taking a lock
                if (databaseConnection == null) { // Second check after taking a lock
                    databaseConnection = new DatabaseConnection();
                }
            }
        }
        return databaseConnection;
    }

}
