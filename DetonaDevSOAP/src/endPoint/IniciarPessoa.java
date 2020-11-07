package endPoint;

import javax.xml.ws.Endpoint;


import servico.PessoaServiceImpl;

public class IniciarPessoa {


	public static void main(String[] args) {
		
		Endpoint.publish(
				"http://localhost:8085/DetonaDevSOAP/Pessoa", 
				new PessoaServiceImpl());

		System.out.println("Serviço publicado com sucesso");

		

	}

}
