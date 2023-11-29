import java.util.ArrayList;
import java.util.Scanner;



import Conta.Pessoa;
import Conta.Usuario;
import Esportes.Basquete;
import Esportes.Esporte;
import Esportes.Futebol;
import Esportes.UFC;


public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Usuario> usuariosBet;
    static ArrayList<Esporte> listaEsportes;
    static ArrayList<Aposta> listaApostas;
    static UFC partidaUFC = new UFC("João", "Pedro", "Pedro", "Peso Leve");
    static Basquete partidaBasquete = new Basquete("Time1", "Time2", "Time1", 50);
    static Futebol partidaFutebol = new Futebol("Brasil", "Argentina", "Brasil", "Maracana");
    
    
    public static void main(String[] args) {

  
       
        usuariosBet = new ArrayList<Usuario>();
        listaEsportes = new ArrayList<Esporte>();
        listaApostas = new ArrayList<Aposta>();
        listaEsportes.add(partidaFutebol);
        listaEsportes.add(partidaBasquete);
        listaEsportes.add(partidaUFC);
        
        
        menu();
    }
            

    public static void menu(){
           
             
            System.out.println("Bem-vindo(a) a Bet Java");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Criar usario");
            System.out.println("2 - Listar usuarios");
            System.out.println("3 - Depositar ou sacar");
            System.err.println("4 - Realizar aposta");
            System.out.println("5 - Listar jogos");
            System.out.println("6 - Sair");

            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    criarUsuario();
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 3:
                    depositoEsaque();
                    break;
                case 4:
                    realizarAposta();
                    break;
                case 5:
                    listarJogos();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Selecione uma opção valida!");
                    menu();
                    break;
            }
        }

        public static void  criarUsuario(){
            System.out.println("Digite um nome: ");
            String nome = input.next();
            System.out.println("Digite um CPF: ");
            String cpf = input.next();
            System.out.println("Digite um email: ");
            String email = input.next();
            Pessoa pessoa = new Pessoa(nome, cpf, email);
            Usuario usuario = new Usuario(pessoa);
            usuariosBet.add(usuario);
            System.out.println("Conta criada com sucesso!, numero de usuario: " + usuario.getNumeroUsuario());
            menu();
        }

        public static Usuario encontrarUsuario(int numeroUsuario){
            Usuario usuario = null;
            if(usuariosBet.size() > 0){
                for (Usuario i : usuariosBet) {
                    if(i.getNumeroUsuario() == numeroUsuario)
                    usuario = i;
                }
            }
            return usuario;

        }
        
        public static void listarUsuarios(){
            if (usuariosBet.size() > 0){
                for (Usuario usuario : usuariosBet) {
                    System.out.println(usuario);
                }
            }else{
                System.out.println("Não há conta registradas");
            }
            menu();

        }

        
        public static void realizarAposta(){
        
          System.out.println("Digite um numero de usuario");
          int opcaoAposta = input.nextInt();
          Usuario usuario = null;
          if (usuariosBet.size() > 0) {
            for (Usuario i : usuariosBet){
                if (i.getNumeroUsuario() == opcaoAposta) {
                    usuario = i;
                }else{
                    System.out.println("Numero de usuario inexistente!");
                    menu();
                    break;
                    
                }
            }
                for(Esporte esporte : listaEsportes) {
                System.out.println(esporte);
                 }
                System.out.println("Em qual esporte deseja apostar?");  
                String opcaoEsporte = input.next();
                System.out.println("Qual vencedor da partida?");
                String opcaoVencedor = input.next();
                System.out.println("Quanto deseja apostar?");
                double valorApostado = input.nextInt();
                
                Aposta aposta = new Aposta();
                switch (opcaoEsporte) {
                    case "UFC":
                        aposta.apostar(usuario, partidaUFC, opcaoVencedor, valorApostado);                                      
                        break;
                    case "Basquete":
                       aposta.apostar(usuario, partidaBasquete, opcaoVencedor, valorApostado);
                        break;
                    case "Futebol":
                        aposta.apostar(usuario, partidaFutebol, opcaoVencedor, valorApostado);
                        break;
                    default:
                        System.out.println("Opção de esporte invalida");                
                        break;
                    }
                
                menu();
          }else{
            System.out.println("Não há usuarios registrados");
            menu();
          }
       
        }
        
        public static void listarJogos(){
            for(Esporte esporte : listaEsportes) {
                System.out.println(esporte);
            }
            menu();
        }

        public static void depositoEsaque(){
            System.out.println("Qual seu numero de usuario?");
            int numeroUsuario = input.nextInt();
            Usuario usuario = null;
            if (usuariosBet.size() > 0) {
                    for (Usuario i : usuariosBet){
                        if (i.getNumeroUsuario() == numeroUsuario) {
                            usuario = i;
                        }else{
                            System.out.println("Numero de usuario inexistente!");
                            menu();
                            break;
                            
                        }
                    }
                    System.out.println("1 - Sacar\n2 - Depositar");
                    int opcao = input.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Quanto deseja sacar?");
                            double opcaoSaque = input.nextDouble();
                            usuario.saque(opcaoSaque);
                            menu();
                            break;
                        case 2:
                            System.out.println("Quanto deseja depositar?");
                            double opcaoDeposito = input.nextDouble();
                            usuario.depositar(opcaoDeposito);
                            menu();
                            break;
                        default:
                            System.out.println("Opção invalida");
                            menu();
                            break;
                    }
            }else{
                System.out.println("Não há usuarios registrados");
                menu();
                }
        
        }   

        
}