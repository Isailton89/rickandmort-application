import com.edu.rickmortapi.application.service.Address;
import com.edu.rickmortapi.application.service.Connection;

public class App {
	public static void main(String[] args){
		Connection connection = new Connection();
		String urlTeste = "https://rickandmortyapi.com/api/character/1";
		Address retornoBodyUrl = connection.sendAddress(urlTeste);
		System.out.println(retornoBodyUrl);
	}
}