package Database_Service;

/*
Databse Connection will be facilitated via respective DBMS connector which is in the line of the JPA
*/
public interface DataBaseConnector {

    public Object execute(DataBaseRequest request);
}
