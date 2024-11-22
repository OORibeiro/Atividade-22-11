package ex12.model;

public class Cliente {
	  private String nome;
	    private int idade;
	    private String email;
	    public Cliente(String nome, int idade, String email) {
	        this.nome = nome;
	        this.idade = idade;
	        this.email = email;
	    }
	 
	    public String getNome() {
	        return nome;
	    }
	 
	    public int getIdade() {
	        return idade;
	    }
	 
	    public String getEmail() {
	        return email;
	    }
	    @Override
	    public String toString() {
	        return "Nome: " + nome + ", Idade: " + idade + ", E-mail: " + email;
	    }
}