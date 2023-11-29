package Esportes;

public class Futebol extends Esporte {
    private int placarCasa;
    private int placarVisitante;
    private String estadio;

    public Futebol(String timeCasa, String timeFora, String ganhador, String estadio) {
        super(timeCasa, timeFora, ganhador);
        this.estadio = estadio;
    }

    public Futebol(String timeCasa, String timeFora, String estadio) {
        super(timeCasa, timeFora);
        this.estadio = estadio;
    }

    public String toString() {
       return "\nPartida de Futebol - " + getEstadio() + "\n"
        + getTimeCasa() + "(Casa)" + " x " + getTimeFora() + "(Fora)\n" +
        "-------------------------";
    }

    public int getPlacarCasa() {
        return placarCasa;
    }

    public void setPlacarCasa(int placarCasa) {
        this.placarCasa = placarCasa;
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    public String getEstadio() {
        return estadio;
    }
    
    
}
