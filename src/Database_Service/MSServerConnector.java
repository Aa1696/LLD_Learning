package Database_Service;

public class MSServerConnector implements DataBaseConnector{
    @Override
    public Object execute(DataBaseRequest request) {
        return "MSServer connection is established";
    }
}
