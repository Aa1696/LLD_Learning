package Database_Service;

public class DataBaseRequest {

    private String datbaseType;//Mysql,MSServer,MongoDB
    private String query;
    private String operation;
    private Object payload;

    public String getDatbaseType() {
        return datbaseType;
    }

    public void setDatbaseType(String datbaseType) {
        this.datbaseType = datbaseType;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }
}
