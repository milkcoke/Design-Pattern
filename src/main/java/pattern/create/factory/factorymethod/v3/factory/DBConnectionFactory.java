package pattern.create.factory.factorymethod.v3.factory;

import pattern.create.factory.factorymethod.v3.DatabaseConnection;

public abstract class DBConnectionFactory {
  public DatabaseConnection getConnection() {
    return this.createDBConnection();
  }

  abstract protected DatabaseConnection createDBConnection();
}
