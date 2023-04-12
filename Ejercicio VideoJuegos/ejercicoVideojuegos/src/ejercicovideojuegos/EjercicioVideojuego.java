package ejercicovideojuegos;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {

    public static void main(String[] args) {
        //creo la ArrayList    
        List<VideoJuego> listaVideojuegos = new ArrayList<>();
        //declaro los objetos    
        VideoJuego video1 = new VideoJuego(01, "counter strike", "pc", 4);
        VideoJuego video2 = new VideoJuego(02, "fifa 2000", "playStation", 2);
        VideoJuego video3 = new VideoJuego(03, "pac man", "nintendo 64", 1);
        VideoJuego video4 = new VideoJuego(04, "Super Mario", "nintendo 64", 2);
        VideoJuego video5 = new VideoJuego(05, "galaxi", "family", 1);
        //los agrego a la lista juego
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        //recorro la arrayList

        for (VideoJuego video : listaVideojuegos) {
            System.out.println("Titulo: " + video.getTitulo() + " Consola: " + video.getConsola()
                    + " Cntidad de jugadores " + video.getCantJugadores());
        }

            System.out.println("-------------------------");
        //cambio de nombre y jugadores
        video1.setTitulo("Banjo Kazooie II");
        video1.setCantJugadores(1);

        video5.setTitulo("Super Mario Kart");
        video5.setCantJugadores(4);

        //recorrer la arrayList y mostrar los de nintendo 64
        for (VideoJuego video : listaVideojuegos) {
            if (video.getConsola().equals("nintendo 64")) {
                System.out.println(video.toString());
            }

        }
    }
}
