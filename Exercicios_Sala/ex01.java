import java.util.ArrayList;

public class Usuario {
	private String nome, email, nacionalidade;

	private ArrayList<String> postagens;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmai() {
		return email;
	}

	public void setEmai(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Usuario(ArrayList<String> postagens) {
		super();
		this.postagens = postagens;
	}
	
	
	
}