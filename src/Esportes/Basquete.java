package Esportes;

public class Basquete extends Esporte {
    private double mediaPontos;
    
    public Basquete(String timeCasa, String timeFora, String ganhador, int mediaPontos) {
        super(timeCasa, timeFora, ganhador);
        this.mediaPontos = mediaPontos;    
    }
    public Basquete(String timeCasa, String timeFora, int mediaPontos) {
        super(timeCasa, timeFora);
        this.mediaPontos = mediaPontos;    
    }

    public double getMediaPontos() {
        return mediaPontos;
    }
    public void setMediaPontos(double mediaPontos) {
        this.mediaPontos = mediaPontos;
    }
    
    public String toString() {
        return 
               "\nPartida de Basquete\n" 
               + getTimeCasa() + "(Mandante)" + " x " + getTimeFora() + "(Visitante)\n" +
               "-------------------------";
    }
    
}
