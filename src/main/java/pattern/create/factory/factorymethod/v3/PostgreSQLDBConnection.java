package pattern.create.factory.factorymethod.v3;

public class PostgreSQLDBConnection implements DatabaseConnection {
  private PostgreSQLDBConnection() {}
  public static class Holder {
    private static final PostgreSQLDBConnection INSTANCE = new PostgreSQLDBConnection();
  }

  public static PostgreSQLDBConnection getInstance() {
    return Holder.INSTANCE;
  }

  @Override
  public void connect() {
    System.out.println("Connecting to PostgreSQL database...");
  }
}
