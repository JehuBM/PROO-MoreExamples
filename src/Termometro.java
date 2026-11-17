public class Termometro {

    public double temperatura = 0.0;

    public void Subir(double grados){
        this.temperatura += grados;
    }

    public void Bajar(double grados){
        this.temperatura -= grados;
    }

    public void MostrarTemperatura(){
        System.out.println("La temperatura actual es: " + this.temperatura + " grados");
    }
}
