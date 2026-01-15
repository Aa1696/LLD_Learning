package Database_Service;

public class MongoDBConnector implements DataBaseConnector{
    @Override
    public Object execute(DataBaseRequest request) {
        return "MongoDB connection is established";
    }
}
