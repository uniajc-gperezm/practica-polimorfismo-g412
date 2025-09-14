public class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador (int id, String nombre, float aceleracionPromadio, float gradoRampa){
        super(id, nombre);
        this.aceleracionPromedio = aceleracionPromadio;
        this.gradoRampa = gradoRampa;
    }

    public  float getAceleracionPromedio (){
        return aceleracionPromedio;
    }
    public void setAceleracionPromedio(float aceleracionPromedio){
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa (){
        return gradoRampa;
    }

    public void setGradoRampa (float gradoRampa){
        this.gradoRampa = gradoRampa;
    }



    public String imprimirTipo (){
        return imprimirTipo();
    }

    public void imprimirDatos (){
        System.out.println("La aceleracion promedio: " + aceleracionPromedio);
        System.out.println("El grado de rampa: " + gradoRampa);
        System.out.println("Tipo: " + imprimirTipo());

    }
    
}
