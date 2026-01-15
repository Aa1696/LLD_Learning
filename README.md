High-Level Architecture

Client Request will create the DataBaseRequest and will call the Database Service

Database service will be calling the DatabaseFactory.

Factor Design pattern is being used to create the DB at the run time.

Strategy DEsign Pattern is being also used as different DB will possess the different behaviour.

Single Responsbility is maintained as each class is given only one responsbility.

It is open for the extension i.e we can add new DB without changing service.


