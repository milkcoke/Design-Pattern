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
    DBConnectionFactory factory = new MySQLDBConnectionFactory();
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
    DBConnectionFactory factory = new PostgreSQLDBConnectionFactory();
    // when
    DatabaseConnection dbConnection = factory.getConnection();
    // then
    assertThat(dbConnection).isInstanceOf(PostgreSQLDBConnection.class);
    dbConnection.connect();
  }
}
