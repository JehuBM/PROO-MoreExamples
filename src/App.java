public class App {
    public static void main(String[] args) throws Exception {

        Lampara lampara1 = new Lampara("Verde", true);
        lampara1.mostrar();

        Semaforo sem1 = new Semaforo();
        sem1.CambiarAmarrillo();
        sem1.MostrarColor();

        Reproductor cancion = new Reproductor();;
        cancion.reproducir("AUD_200789098_47372384");
        cancion.estado();

        Termometro t = new Termometro();
        t.Subir(5.0);
        t.Bajar(2.0);
        t.MostrarTemperatura();

        Puerta puerta = new Puerta();
        puerta.Abrir();
        puerta.Estado();

    }
}
