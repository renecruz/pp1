import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlumnoDAOImplBIN implements AlumnoDAO {
  // Implementa las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  private Map<Integer, Alumno> alumnos = new HashMap<>();

  // Crear nuevo alumno en la lista
  public void agregarAlumno(Alumno alumno) {
    alumnos.put(alumno.getMatricula(), alumno);
    creaArchivoAlumno(alumno);
    leerArchivosDAT();
  }

  // Recuperar todos los alumnos
  public List<Alumno> recuperarAlumnos() {
    return new ArrayList<Alumno>(alumnos.values());
  }

  // Recuperar un alumno
  public Alumno recuperarAlumno(int matricula) {
    return alumnos.get(Integer.valueOf(matricula));
  }

  // Actualizar alumno existente
  public void actualizarAlumno(Alumno alumno) {
    //alumnos.replace(alumno.getMatricula(), alumno);
    alumnos.put(alumno.getMatricula(), alumno);
    creaArchivoAlumno(alumno);
    leerArchivosDAT();
  }

  // Eliminar alumno existente
  public void eliminarAlumno(int matricula) {
    borrarArchivoAlumno(matricula);
    leerArchivosDAT();
  }

  /*------------ Operaciones con archivos *.dat ------------*/
  private Map<Integer, File> archivosDAT = new HashMap<>();

  public AlumnoDAOImplBIN() {
    leerArchivosDAT(); // Lee los registros existentes
  }

  // Busca archivos *.dat en el directorio actual
  private void buscarArchivosDAT() {
    String sCarpAct = System.getProperty("user.dir");
    File carpeta = new File(sCarpAct);
    FileFilter filtro = new FileFilter() {
      @Override
      public boolean accept(File arch) {
        return arch.isFile();
      }
    };
    File[] archivos = carpeta.listFiles(filtro);
    if (archivos == null || archivos.length == 0) {
      System.out.println("No hay elementos dentro de la carpeta actual");
      return;
    } else {
      for (int i = 0; i < archivos.length; i++) {
        File archivo = archivos[i];
        if (archivos[i].getName().endsWith("dat")) {
          String str = archivo.getName();
          str = str.substring(0, str.lastIndexOf("."));
          archivosDAT.put(Integer.valueOf(str), archivo);
        }
      }
    }
  }

  // Lee los datos guardados en cada archivo *.dat
  private void leerArchivosDAT() {
    alumnos.clear();
    archivosDAT.clear();
    buscarArchivosDAT();
    ObjectInputStream ois = null;
    try {
      for (File file : archivosDAT.values()) {
        ois = new ObjectInputStream(new FileInputStream(file));
        Alumno alumno = (Alumno) ois.readObject();
        alumnos.put(alumno.getMatricula(), alumno);
        ois.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Crea un archivo .dat para cada nuevo alumno
  private void creaArchivoAlumno(Alumno alumno) {
    ObjectOutputStream oos = null;
    try {
      oos = new ObjectOutputStream(new FileOutputStream(
      														 	new File(alumno.getMatricula() + ".dat")
      														 ));
      oos.writeObject(alumno);
      oos.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Elimina el archivo de un alumno 
  private void borrarArchivoAlumno(int matricula) {
    File archivo = new File(matricula + ".dat");
    if (archivo.delete()) {
      archivosDAT.remove(matricula);
      alumnos.remove(matricula);
    }
  }
}