package pattern.create.factory.factorymethod.v3.factory;

import pattern.create.factory.factorymethod.v3.DatabaseConnection;
import pattern.create.factory.factorymethod.v3.MySQLDBConnection;

public class MySQLDBConnectionFactory extends DBConnectionFactory {
  @Override
  protected DatabaseConnection createDBConnection() {
    return new MySQLDBConnection();
  }
}
