import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal{
	
	public static List<jogo> jogos = new ArrayList<jogo>();
	
	public static void main(String[] args) {		
		int resposta = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("\n   **Galeria de jogos**\n\n Escolha uma opção \n1 --> listar jogos \n2 --> cadastrar jogos \n3 --> sair");
			try {
				resposta = scan.nextInt();
				if (resposta == 2){	
					CadastraJogo();
				}
				else if (resposta == 1){
					ListaJogo();
				}
			} 
			catch (Exception e) {
				System.out.println("Escolha uma opção ");				
			}
		} while(resposta != 3);
	}
	
	
	public static void CadastraJogo(){
		Scanner scan2 = new Scanner(System.in);
		jogo j = new jogo();
		System.out.println("       Dados do jogo");
		System.out.println("Nome: ");
		
		j.setNome(scan2.nextLine());
				
		System.out.println("categoria: ");
		j.setCategoria(scan2.nextLine());
				
		j.setCodigo(jogos.size()+1);
		
		jogos.add(j);
	}
	
	
	public static void ListaJogo(){
		if(jogos.size()==0) {
			System.out.println("  !Não ha jogos ainda...!\n");
			return;
		}
		for(int a = 0;a < jogos.size();a++ ) {
			System.out.println("\nJogo " + (a+1));
			System.out.println("Nome: " + jogos.get(a).getNome());
			System.out.println("Categoria: " + jogos.get(a).getCategoria());
		}
	}
}