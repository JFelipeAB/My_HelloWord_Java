package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Galeria de jogos\n ")
		do{
			System.out.println("1 --> listas jogos \n 2 --> cadastrar jogos \\n 3 --> sair")
			
			String resposta = scan.nextLine();
			if (resposta==1)
			{
				System.out.flush();
				CadastraJogo();
			}
			else if (resposta==2)
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
		}while(resposta!=3)
	}
	
	CadastraJogo(){
		new jogo = new
		System.out.println("Cadastro de Jogo")
		System.out.println("Nome:")
		String resposta = scan.nextLine();
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
