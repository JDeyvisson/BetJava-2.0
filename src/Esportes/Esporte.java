package Esportes;
public abstract class Esporte {
    private String ganhador;
    private String timeCasa;
    private String timeFora;

    
    public Esporte(String timeCasa, String timeFora, String ganhador) {
        this.timeCasa = timeCasa;
        this.timeFora = timeFora;
        if (ganhador.equals(timeCasa) || ganhador.equals(timeFora)) {
            this.ganhador = ganhador;
        }else{
            System.out.println("Vencedor invalido");
        };
        
    }

    public Esporte(String timeCasa, String timeFora) {
        this.timeCasa = timeCasa;
        this.timeFora = timeFora;
        
    }

    public String getTimeFora() {
        return timeFora;
    }

    public void setTimeFora(String timeFora) {
        this.timeFora = timeFora;
    }

    public String getTimeCasa() {
            return timeCasa;
        }

        public void setTimeCasa(String timeCasa) {
            this.timeCasa = timeCasa;
        }

    public String getGanhador() {
        return ganhador;
    }

    public void setGanhador(String ganhador) {
        this.ganhador = ganhador;
    }
    
}
