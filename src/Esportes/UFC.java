package Esportes;

public class UFC extends Esporte {
    private String categoria;

    public UFC(String timeCasa, String timeFora, String ganhador, String categoria) {
        super(timeCasa, timeFora, ganhador);
        this.categoria = categoria;
       
    }

    public UFC(String timeCasa, String timeFora,String categoria) {
        super(timeCasa, timeFora);
        this.categoria = categoria;
       
    }
   
    public String toString() {
        return  "\nPartida de UFC - " + getCategoria() + "\n"
        + getTimeCasa() + "(Casa)" + " x " + getTimeFora() + "(Fora)\n" +
        "-------------------------";
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String metodoVencedor) {
        this.categoria = metodoVencedor;
    }
    
}
