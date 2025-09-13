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

}