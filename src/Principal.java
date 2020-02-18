import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Galeria de jogos\n ");
		String resposta;
		
		do {
			System.out.println("1 --> listas jogos \n 2 --> cadastrar jogos \n 3 --> sair");
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
		
	}
	
	public static void ListaJogo(){
		
	}
}