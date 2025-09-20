import java.util.ArrayList;
import java.util.List;

public class Equipo {

  private String nombre;
  private String pais;
  private static int tiempoTotalEquipo = 0;
  private List<Ciclista> ciclistas;

  public Equipo(String nombre, String pais) {
    this.nombre = nombre;
    this.pais = pais;
    this.ciclistas = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public String getPais() {
    return pais;
  }

  public int getTiempoTotalEquipo() {
    return tiempoTotalEquipo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public void setTiempoTotalEquipo(int tiempoTotalEquipo) {
    Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
  }

  public void añadirCiclista(Ciclista ciclista) {
    ciclistas.add(ciclista);
  }

  public void imprimirDatosEquipo() {
    System.out.println("Nombre del equipo: " + nombre);
    System.out.println("País del equipo: " + pais);
    System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo + " segundos");
    System.out.println("Ciclistas del equipo:");
    for (Ciclista ciclista : ciclistas) {
      System.out.println("  ID: " + ciclista.getIdentificador() + ", Nombre: " + ciclista.getNombre()
          + ", Tiempo acumulado: " + ciclista.getTiempoAcumulado() + " segundos");
    }
  }

  public void listarNombresCiclistas() {
    System.out.println("Ciclistas del equipo " + nombre + ":");
    for (Ciclista ciclista : ciclistas) {
      System.out.println("  - " + ciclista.getNombre());
    }
  }

  public void imprimirCiclistaPorId(int id) {
    for (Ciclista ciclista : ciclistas) {
      if (ciclista.getIdentificador() == id) {
        System.out.println("Ciclista encontrado:");
        System.out.println("  ID: " + ciclista.getIdentificador() + ", Nombre: " + ciclista.getNombre()
            + ", Tiempo acumulado: " + ciclista.getTiempoAcumulado() + " segundos");
        return;
      } else {
        System.out.println("No se encontró un ciclista con ID: " + id);
      }
    }
  }

}