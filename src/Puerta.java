public class Puerta {

    public boolean abierta = false;

    public void Abrir(){
        this.abierta = true;
    }

    public void Cerrar(){
        this.abierta = false;
    }

    public void Estado(){
        if(this.abierta == true){
            System.out.println("La puerta esta abierta");
        } else {
            System.out.println("La puerta esta cerrada");
        }
    }
}
