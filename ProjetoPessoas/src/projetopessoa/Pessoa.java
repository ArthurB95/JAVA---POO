package projetopessoa;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	//M�TODOS PERSONALIZADOS
	public void  fazerAniversario() {
		this.idade++;
	}
	
	//M�TODOS ESPECIAIS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
			return sexo;	
	}
	public void setSexo(String sexo) {
			this.sexo = sexo;	
	}

	@Override
	public String toString() {
		return "Pessoa: " + nome + ", Idade: " + idade + ", Sexo: " + sexo;
	}
	
	
	
}
