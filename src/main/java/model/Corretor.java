package model;

public class Corretor {
	private int id_corretor;
	private String nome;
	private float comissao;

	public Corretor(int id_corretor, String nome, float comissao) {
		super();
		this.id_corretor = id_corretor;
		this.nome = nome;
		this.comissao = comissao;
	}

	public int getId_corretor() {
		return id_corretor;
	}

	public void setId_corretor(int id_corretor) {
		this.id_corretor = id_corretor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

}
