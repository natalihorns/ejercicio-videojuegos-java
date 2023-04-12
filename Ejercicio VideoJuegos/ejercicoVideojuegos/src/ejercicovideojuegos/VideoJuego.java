
package ejercicovideojuegos;

public class VideoJuego {
    double codigo;
    String titulo;
    String consola;
    int cantJugadores;

    public VideoJuego() {
    }

    public VideoJuego(double codigo, String titulo, String consola, int cantJugadores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    void setCantJugadores(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "VideoJuego{" + "codigo=" + codigo + ", titulo=" + titulo + ", consola=" + consola + ", cantJugadores=" + cantJugadores + '}';
    }
    
    
    
}
