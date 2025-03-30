package pattern.create.factory.factorymethod.v3;

public class PostgreSQLDBConnection implements DatabaseConnection {
  @Override
  public void connect() {
    System.out.println("Connecting to PostgreSQL database...");
  }
}
