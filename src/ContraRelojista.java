public class ContraRelojista extends Ciclista {
    private double velocidadMaxima;

    public ContraRelojista (int id, String nombre, double velocidadMaxima){
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }
    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public void setVelocidadMaxima( double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public String imprimirTipo(){
        return imprimirTipo();
    }
    
    public void imprimirDatos(){
        System.out.println("La velocidad maxima: " + velocidadMaxima);
        System.out.println("Tipo: " + imprimirTipo());
    }
}
