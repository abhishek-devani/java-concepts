package designPatterns.sinleton;

import designPatterns.sinleton.eagerLoading.DatabaseConnection;

public class Client {

    public static void main(String[] args) {

        // Eager Loading
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();

        // Single Threaded
        designPatterns.sinleton.singleThreaded.DatabaseConnection databaseConnection1 = designPatterns.sinleton.singleThreaded.DatabaseConnection.createInstance();

        // Double Lock Checking (multi threaded)
        designPatterns.sinleton.doubleCheckLocking.DatabaseConnection databaseConnection2 = designPatterns.sinleton.doubleCheckLocking.DatabaseConnection.createInstance();
    }

}
