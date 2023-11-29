package Conta;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private static int contadorPessoa = 1;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        contadorPessoa++;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    
    public String toString() {
        
       return "\nNome: " + getNome() + 
              "\nCPF: " + getCpf() + 
              "\nEmail: " + getEmail();

    }
    
}
