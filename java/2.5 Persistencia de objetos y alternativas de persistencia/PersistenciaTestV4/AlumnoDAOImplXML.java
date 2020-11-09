import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class AlumnoDAOImplXML implements AlumnoDAO {
  // Implementa las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  private Map<Integer, Alumno> alumnos;

  // Crear nuevo alumno en la lista
  public void agregarAlumno(Alumno alumno) {
    alumnos.put(alumno.getMatricula(), alumno);
    escribirXML();
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
    alumnos.replace(alumno.getMatricula(), alumno);
    escribirXML();
  }

  // Eliminar alumno existente
  public void eliminarAlumno(int matricula) {
    alumnos.remove(Integer.valueOf(matricula));
    escribirXML();
  }

  /*----------------- Manejo del archivo XML -----------------*/

  // Carga los registros del archivo
  public AlumnoDAOImplXML() {
    alumnos = leerXML();
  }

  // Escribe el archivo XML
  public void escribirXML() {
    if (alumnos.isEmpty() ) {
      System.out.println("Lista de alumnos sin elementos");
      return;
    } else {
      try {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        DOMImplementation implementation = builder.getDOMImplementation();
        Document document = implementation.createDocument(null, "ALUMNOS", null);
        document.setXmlVersion("1.0");
        Element raiz = document.getDocumentElement();
        for (Alumno alumno : alumnos.values()) {
          Element itemNode = document.createElement("ALUMNO");
          Element matriculaNode = document.createElement("MATRICULA");
          Text nodeMatriculaValue = document.createTextNode(alumno.getMatricula() + "");
          matriculaNode.appendChild(nodeMatriculaValue);
          Element nombreNode = document.createElement("NOMBRE");
          Text nodeNombreValue = document.createTextNode(alumno.getNombre());
          nombreNode.appendChild(nodeNombreValue);
          Element emailNode = document.createElement("EMAIL");
          Text nodeEmailValue = document.createTextNode(alumno.getEmail());
          emailNode.appendChild(nodeEmailValue);
          itemNode.appendChild(matriculaNode);
          itemNode.appendChild(nombreNode);
          itemNode.appendChild(emailNode);
          raiz.appendChild(itemNode);
        }
        Source source = new DOMSource(document);
        Result result = new StreamResult(new File("AlumnosData.xml"));
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.transform(source, result);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  // Lee el archivo XML
  public Map<Integer, Alumno> leerXML() {
    Map<Integer, Alumno> alumnos = new HashMap<Integer, Alumno>();
    try {
      File XMLFile = new File("AlumnosData.xml");
      if (XMLFile.exists()) {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(XMLFile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("ALUMNO");
        for (int temp = 0; temp < nList.getLength(); temp++) {
          Node nNode = nList.item(temp);
          if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            Element el = (Element) nNode;
            int matricula = Integer.valueOf(
                              el.getElementsByTagName("MATRICULA").item(0).getTextContent()
                            );
            String nombre = el.getElementsByTagName("NOMBRE").item(0).getTextContent();
            String email = el.getElementsByTagName("EMAIL").item(0).getTextContent();
            alumnos.put(matricula, new Alumno(matricula, nombre, email));
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return alumnos;
  }
}