public class Semaforo {

    public String color = "";


    public void CambiarRojo(){
        this.color = "rojo";
    }

    public void CambiarVerde(){
       this.color = "verde";
    }

    public void CambiarAmarrillo(){
        this.color = "amarrillo";
    }

    public void MostrarColor(){
        System.out.println("El color del semaforo es: "+this.color);
    }
    
    
}

