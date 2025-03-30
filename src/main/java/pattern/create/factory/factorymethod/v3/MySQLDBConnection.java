package pattern.create.factory.factorymethod.v3;

public class MySQLDBConnection implements DatabaseConnection {
  @Override
  public void connect() {
    System.out.println("Connecting to MySQL database...");
  }
}
