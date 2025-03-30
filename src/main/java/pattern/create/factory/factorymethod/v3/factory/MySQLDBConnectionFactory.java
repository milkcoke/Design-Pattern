package pattern.create.factory.factorymethod.v3.factory;

import pattern.create.factory.factorymethod.v3.DatabaseConnection;
import pattern.create.factory.factorymethod.v3.MySQLDBConnection;

public class MySQLDBConnectionFactory extends DBConnectionFactory {
  private MySQLDBConnectionFactory(){}
  private static class Holder {
    private static final MySQLDBConnectionFactory INSTANCE = new MySQLDBConnectionFactory();
  }
  public static MySQLDBConnectionFactory getInstance() {
    return Holder.INSTANCE;
  }

  @Override
  protected DatabaseConnection createDBConnection() {
    return MySQLDBConnection.getInstance();
  }
}
