public class Reproductor {

    public String cancion = " ";
    public boolean reproduciendo = false;

    public void reproducir (String cancion){
        this.cancion = cancion;
    }

    public void pausar(){
        this.reproduciendo = false;
    }

    public void estado(){
        System.out.println("Esta sonando: "+this.cancion);
        if (this.reproduciendo){
            System.out.println("Esta en reproducion");
        }else{
            System.out.println("Esta en pausa");
        }
    }
}