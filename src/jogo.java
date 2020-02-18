import java.util.Date;

public class jogo {

	
	private String nome;
	private int codigo;
	private String categoria;
	private Date lancamento;
	
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int c) {
		this.codigo = c;
	}

	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String c) {
		this.categoria = c;
	}
	
	public Date getLancamento() {
		return lancamento;
	}
	public void setLacamento(Date c) {
		this.lancamento = c;
	}
	
}