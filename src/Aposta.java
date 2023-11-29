
import Conta.Usuario;
import Esportes.Basquete;
import Esportes.Futebol;
import Esportes.UFC;


public class Aposta {
    
    private Usuario apostador;
    private final Double odds = 2.0;
   
   public Double getOdds() {
        return odds;
    }
  
    public void apostar(Usuario numeroUsuario,UFC esporte, String vencedor, double valor){
        if(numeroUsuario != null){
            if(valor > 0 && numeroUsuario.getSaldo() >= valor){
                if (vencedor.equals(esporte.getGanhador())) {
                    System.out.println("Aposta realizada com sucesso!");
                    System.out.println("Parabens, voce acertou!");
                    numeroUsuario.depositar(valor * odds);
                    
                }else{
                    System.out.println("Aposta realizada com sucesso!");
                    System.err.println("Infelizmente voce errou");
                    numeroUsuario.saque(valor);                    
                }
                
            }else{
                System.out.println("Valor invalido ou Saldo insuficiente");
            }
        }else{
            System.out.println("Numero de usuario invalido!");
        }

    }



    public void apostar(Usuario numeroUsuario,Futebol esporte, String vencedor, double valor){
        if(numeroUsuario != null){
            if(valor > 0 && numeroUsuario.getSaldo() >= valor){
                if (vencedor.equals(esporte.getGanhador())) {
                    System.out.println("Aposta realizada com sucesso!");
                    System.out.println("Parabens, voce acertou!");
                    numeroUsuario.depositar(valor * odds);
                    
                }else{
                    System.out.println("Aposta realizada com sucesso!");
                    System.err.println("Infelizmente voce errou");
                    numeroUsuario.saque(valor);                    
                }
                
            }else{
                System.out.println("Valor invalido ou Saldo insuficiente");
            }
        }else{
            System.out.println("Numero de usuario invalido!");
        }

    }

    public void apostar(Usuario numeroUsuario,Basquete esporte, String vencedor, double valor){
        if(numeroUsuario != null){
            if(valor > 0 && numeroUsuario.getSaldo() >= valor){
                if (vencedor.equals(esporte.getGanhador())) {
                    System.out.println("Aposta realizada com sucesso!");
                    System.out.println("Parabens, voce acertou!");
                    numeroUsuario.depositar(valor * odds);
                    
                }else{
                    System.out.println("Aposta realizada com sucesso!");
                    System.err.println("Infelizmente voce errou");
                    numeroUsuario.saque(valor);                    
                }
                
            }else{
                System.out.println("Valor invalido ou Saldo insuficiente");
            }
        }else{
            System.out.println("Numero de usuario invalido!");
        }

    }

    

    public Usuario getApostador() {
        return apostador;
    }

    public void setApostador(Usuario apostador) {
        this.apostador = apostador;
    }


}