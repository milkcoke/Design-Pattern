package pattern.create.factory.factorymethod.v3;

// Apply BillPugh Pattern
public class MySQLDBConnection implements DatabaseConnection {
  private MySQLDBConnection(){}
  private static class Holder {
    private static final MySQLDBConnection INSTANCE = new MySQLDBConnection();
  }

  public static MySQLDBConnection getInstance() {
    return Holder.INSTANCE;
  }

  @Override
  public void connect() {
    System.out.println("Connecting to MySQL database...");
  }
}
