package Database_Service;

/*
* Based on the type of the database request
* Database service is going to delegate the respective
* object creation to the Factory class which has the sole responsbility to create the
* database object based on the type
* */
public class DatabaseService {

    //will recieve the request

    public Object process(DataBaseRequest request){

        DataBaseConnector connector = DataBaseFactory.getConnector(request.getDatbaseType());
        return connector;

    }
}
