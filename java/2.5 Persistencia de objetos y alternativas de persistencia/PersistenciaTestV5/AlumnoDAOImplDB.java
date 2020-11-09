import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAOImplDB implements AlumnoDAO {
  // Implementa las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  Connection connection = null;

  // Establece conexión con la DB
  public AlumnoDAOImplDB() {
    try {
      connection = DriverManager.getConnection("jdbc:sqlite:alumno.db");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Crear nuevo alumno en la lista
  public void agregarAlumno(Alumno alumno) {    
    String INSERT_SQL = "INSERT INTO Alumno (matricula, nombre, email) VALUES(?, ?, ?)";
    try {
      PreparedStatement ps = connection.prepareStatement(INSERT_SQL);
      ps.setInt(1, alumno.getMatricula());
      ps.setString(2, alumno.getNombre());
      ps.setString(3, alumno.getEmail());
      ps.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Recuperar todos los alumnos
  public List<Alumno> recuperarAlumnos() {
    List<Alumno> alumnos = new ArrayList<>();
    String SELECT_SQL = "SELECT matricula, nombre, email FROM Alumno";
    try {
      PreparedStatement pstmt = connection.prepareStatement(SELECT_SQL);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        alumnos.add(new Alumno(rs.getInt("matricula"), 
                               rs.getString("nombre"), 
                               rs.getString("email")));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return alumnos;
  }

  // Recuperar un alumno
  public Alumno recuperarAlumno(int matricula) {
    Alumno alumno = null;
    String SELECT_SQL = "SELECT matricula, nombre, email FROM Alumno WHERE matricula = ?";
    try {
      PreparedStatement pstmt = connection.prepareStatement(SELECT_SQL);
      pstmt.setInt(1, matricula);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        alumno = new Alumno(rs.getInt("matricula"), 
                            rs.getString("nombre"), 
                            rs.getString("email"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return alumno;
  }

  // Actualizar alumno existente
  public void actualizarAlumno(Alumno alumno) {
    String UPDATE_SQL = "UPDATE Alumno SET matricula = ? , " + 
                                          "nombre = ? , " + 
                                          "email = ? " + 
                                          "WHERE matricula = ?";
    try {
      PreparedStatement pstmt = connection.prepareStatement(UPDATE_SQL);
      pstmt.setInt(1, alumno.getMatricula());
      pstmt.setString(2, alumno.getNombre());
      pstmt.setString(3, alumno.getEmail());
      pstmt.setInt(4, alumno.getMatricula());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Eliminar alumno existente
  public void eliminarAlumno(int matricula) {
    String DELETE_SQL = "DELETE FROM Alumno WHERE matricula = ?";
    try {
      PreparedStatement pstmt = connection.prepareStatement(DELETE_SQL);
      pstmt.setInt(1, matricula);
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}