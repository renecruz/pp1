package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
  // Implementa un método estático para devolver una conección
  public static Connection getConnection() {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection("jdbc:sqlite:db/db_ventas.db");
    } catch (SQLException e) {
      System.out.println("ERROR:");
      e.printStackTrace();
    }
    return connection;
  }

  public static java.sql.Date getCurrentDate() {
    java.util.Date today = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(today.getTime());    
    return sqlDate;
  }
}
