public abstract class Ciclista {
  private int identificador;
  private String nombre;
  private int tiempoAcumulado = 0;

  public Ciclista(int identificador, String nombre) {
    this.identificador = identificador;
    this.nombre = nombre;
    this.tiempoAcumulado = 0;
  }

  public int getIdentificador() {
    return identificador;
  }

  public String getNombre() {
    return nombre;
  }

  public int getTiempoAcumulado() {
    return tiempoAcumulado;
  }

  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTiempoAcumulado(int tiempoAcumulado) {
    this.tiempoAcumulado = tiempoAcumulado;
  }

  public abstract String imprimirTipo();

  public void imprimirDatos() {
    System.out.println("ID: " + identificador);
    System.out.println("Nombre: " + nombre);
    System.out.println("Tiempo acumulado: " + tiempoAcumulado + " segundos");
    System.out.println("Tipo: " + imprimirTipo());
  }

}
