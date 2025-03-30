package pattern.create.factory.factorymethod.v3.factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.create.factory.factorymethod.v3.DatabaseConnection;
import pattern.create.factory.factorymethod.v3.MySQLDBConnection;
import pattern.create.factory.factorymethod.v3.PostgreSQLDBConnection;

import static org.assertj.core.api.Assertions.assertThat;

class DBConnectionFactoryTest {

  @DisplayName("Should get MySQL Connection when providing MySQLDBConnectionFactory")
  @Test
  void mySQLConnectionFactoryTest() {
    // given
    DBConnectionFactory factory = MySQLDBConnectionFactory.getInstance();
    // when
    DatabaseConnection dbConnection = factory.getConnection();
    // then
    assertThat(dbConnection).isInstanceOf(MySQLDBConnection.class);
    dbConnection.connect();
  }

  @DisplayName("Should get PostgreSQL Connection when providing PostgreSQLDBConnectionFactory")
  @Test
  void postgreSQLConnectionFactoryTest() {
    // given
    DBConnectionFactory factory = PostgreSQLDBConnectionFactory.getInstance();
    // when
    DatabaseConnection dbConnection = factory.getConnection();
    // then
    assertThat(dbConnection).isInstanceOf(PostgreSQLDBConnection.class);
    dbConnection.connect();
  }

  @DisplayName("MySQLDBConnection should be singleton")
  @Test
  void MySQLDBConnectionSingletonTest() {
    // given
    DBConnectionFactory factory = MySQLDBConnectionFactory.getInstance();
    // when
    DatabaseConnection mysqlDBConnection1 = factory.getConnection();
    DatabaseConnection mysqlDBConnection2 = factory.getConnection();
    // then
    assertThat(mysqlDBConnection1).isSameAs(mysqlDBConnection2);
  }

  @DisplayName("PostgreSQL DB Connection should be singleton")
  @Test
  void PostgreSQLDBConnectionSingletonTest() {
    // given
    DBConnectionFactory factory = PostgreSQLDBConnectionFactory.getInstance();
    // when
    DatabaseConnection postgresqlDBConnection1 = factory.getConnection();
    DatabaseConnection postgresqlDBConnection2 = factory.getConnection();
    // then
    assertThat(postgresqlDBConnection1).isSameAs(postgresqlDBConnection2);
  }
}
