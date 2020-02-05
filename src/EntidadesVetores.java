
public class EntidadesVetores {

	private static String nome;
	private static String email;
	
	public EntidadesVetores(String nome, String email) {
		this.nome=nome;
		this.email=email;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return nome + email ;
	}



	
	
	
	
}
