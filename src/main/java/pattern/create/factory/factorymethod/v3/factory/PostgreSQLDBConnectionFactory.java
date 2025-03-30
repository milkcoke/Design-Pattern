package pattern.create.factory.factorymethod.v3.factory;

import pattern.create.factory.factorymethod.v3.DatabaseConnection;
import pattern.create.factory.factorymethod.v3.PostgreSQLDBConnection;

public class PostgreSQLDBConnectionFactory extends DBConnectionFactory {
  @Override
  protected DatabaseConnection createDBConnection() {
    return new PostgreSQLDBConnection();
  }
}
