package Database_Service;

public class MySQLConnector implements DataBaseConnector{
    @Override
    public Object execute(DataBaseRequest request) {
        return "MYSQL Connection";
    }
}
