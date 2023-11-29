package Conta;

public class Usuario{
    private static int contadorUsuario = 1;

    private int numeroUsuario;
    private Pessoa pessoa;
    private double saldo;

    public Usuario(Pessoa pessoa) {
        this.numeroUsuario = contadorUsuario;
        this.pessoa = pessoa;
        contadorUsuario++;
      }
    public int getNumeroUsuario() {
        return numeroUsuario;
    }
    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    public String toString() {
        return "\nNumero do usuario: " + this.getNumeroUsuario() +
               "\nNome: " + pessoa.getNome() +
               "\nCPF: " + pessoa.getCpf() +
               "\nEmail: " + pessoa.getEmail() +
               "\nSaldo: " + getSaldo();
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Valor de: " + valor + " adicionado a sua conta");
        }else{
            System.out.println("Deposito invalido. Coloque um valor positivo!");
        }
    }
    public boolean saque(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor; // Saca saldo da conta
            System.out.println("R$" + valor + " Retirado de sua conta");
            return true;
        } else {
            System.out.println("Voce não tem este dinheiro, saque negado. Seu saldo: " + getSaldo());
            return false;
        }

    }



}


