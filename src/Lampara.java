public class Lampara {
    
    public String color = "";
    public boolean estado = false;

    public Lampara(String color, boolean estado){
        this.color = color;
        this.estado = estado;
    }
    
    public void encender (boolean estado){
        this.estado = estado;
    }

    public void mostrar(){
        System.out.println("El color de la lampara es: "+color);
        if(this.estado){
            System.out.println("Esta encendido");
        }else{
            System.out.println("Esta apagado");
        }
    }

}
