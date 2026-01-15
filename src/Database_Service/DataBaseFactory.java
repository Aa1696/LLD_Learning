package Database_Service;

/*
Factory class will called by the Database service
Factory class is being abstracted from the client and service and is the central class
that creates the object for the respective Database

*/
public class DataBaseFactory {

    public static DataBaseConnector getConnector(String databaseType){

        switch(databaseType.toLowerCase()){

            case "mysql":
                return new MySQLConnector();

            case "msserver":
                return new MSServerConnector();

            case "mongodb":
                return new MongoDBConnector();

            default:
                throw new IllegalArgumentException("Unsported Databse");
        }
    }
}
