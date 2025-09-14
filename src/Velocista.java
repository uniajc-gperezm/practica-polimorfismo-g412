public class Velocista extends Ciclista{
private double potenciaPromedio;
private double velocidadPromedioSprint;

public Velocista (int id, String nombre, double potencia, double velocidad){
    super(id, nombre);
    this.potenciaPromedio = potencia ;
    this.velocidadPromedioSprint = velocidad;

}

public double getPotenciaPromedio (){
    return potenciaPromedio;
}
public void setPotenciaPromedio( double potenciaPromedio){
    this.potenciaPromedio = potenciaPromedio;
}

public double getVelocidadPromedioSprint(){
    return velocidadPromedioSprint;
}

public void setVelocidadPromedioSprint (double velocidadPromedioSprint){
    this.velocidadPromedioSprint = velocidadPromedioSprint;
}

public String imprimirTipo (){
    return "Velocista";
}
public void imprimirDatos(){
    System.out.println("La potencia: " + potenciaPromedio);
    System.out.println("La velocidad promedio: " + velocidadPromedioSprint);
    System.out.println("Tipo: " + imprimirTipo());
}
}
