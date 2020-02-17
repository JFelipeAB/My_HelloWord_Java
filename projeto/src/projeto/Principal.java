package projeto;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Galeria de jogos\n ")
		do{
			System.out.println("1 --> listas jogos \n 2 --> cadastrar jogos \\n 3 --> sair")
			
			if (a==1)
			{
				System.out.flush();
				CadastraJogo();
			}
			else if (a==2)
			{
				System.out.flush();
				ListaJogo();
			}
			else
			{
				System.out.flush();			
				System.out.println("Escolha uma das opções")
			}
			https://www.devmedia.com.br/manipulando-datas-em-java/21765 //usando DateTime	
		}while(a!=3)
	}
	
	CadastraJogo(){
		
	}
	
	ListaJogo(){
		
	}
	
	Classe(){				
				//atributos
				private String nome;
				private int codigo;
				private String categoria;
				private Datetime lancamento;
				
				public Jogo() {
					lancamento = datetime.now		
				}

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
				
				public Datetime getLancamento() {
					return codigo;
				}

				public void setCodigo(int c) {
					this.codigo = c;
				}
	}
	
}
