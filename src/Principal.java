import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static Scanner scan = new Scanner(System.in);
	public List<Jogo> jogos = new ArrayList<Jogo>();

	public static void main(String[] args) {
		System.out.println("Galeria de jogos\n ");
		String resposta;
		
		do {
			System.out.println("1 --> listas jogos \n2 --> cadastrar jogos \n3 --> sair");
			resposta = scan.nextLine();
			
			if (resposta =="1")
			{
				System.out.flush();
				CadastraJogo();
			}
			else if (resposta=="2")
			{
				System.out.flush();
				ListaJogo();
			}
			else
			{
				System.out.flush();			
				System.out.println("Escolha uma das opções");
			}
			//https//www.devmedia.com.br/manipulando-datas-em-java/21765 //usando DateTime	
		} while(resposta!="3");
	}
	
	public static void CadastraJogo(){
		new jogo j = new jogo;
		System.out.println("       Dados do jogo");
		System.out.println("Nome: ");
		j.setNome(scan.nextLine());

		System.out.println("categoria: ");
		j.setCategoria(scan.nextLine());

		j.setCodigo((jogos().cauth)+1);
		//System.out.println("Data de lançamento");
		jogos.add(j);
		 
	}
	
	public static void ListaJogo(){
		for ()
	}
}