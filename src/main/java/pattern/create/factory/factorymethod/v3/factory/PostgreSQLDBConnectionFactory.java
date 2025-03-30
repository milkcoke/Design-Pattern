package pattern.create.factory.factorymethod.v3.factory;

import pattern.create.factory.factorymethod.v3.DatabaseConnection;
import pattern.create.factory.factorymethod.v3.PostgreSQLDBConnection;

public class PostgreSQLDBConnectionFactory extends DBConnectionFactory {
  private PostgreSQLDBConnectionFactory(){}
  private static class Holder {
    private static final PostgreSQLDBConnectionFactory INSTANCE = new PostgreSQLDBConnectionFactory();
  }
  public static PostgreSQLDBConnectionFactory getInstance() {
    return Holder.INSTANCE;
  }

  @Override
  protected DatabaseConnection createDBConnection() {
    return PostgreSQLDBConnection.getInstance();
  }
}
