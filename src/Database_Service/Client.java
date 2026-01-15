package Database_Service;

public class Client {

    public static void main(String[] args) {

        DataBaseRequest request = new DataBaseRequest();
        request.setDatbaseType("MYSQL");
        request.setQuery("Select * from databse");
        request.setOperation("Read");

        DatabaseService dbservcie = new DatabaseService();
        Object response = dbservcie.process(request);

    }
}
