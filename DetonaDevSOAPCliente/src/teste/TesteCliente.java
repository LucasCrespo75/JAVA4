package teste;

import java.rmi.RemoteException;
import java.util.ArrayList;

import servico.Pessoa;
import servico.PessoaService;
import servico.PessoaServiceProxy;
import servico.RetornoPessoa;

public class TesteCliente {

	public static void main(String[] args) {
		
		//try {
			//PessoaService pessoaServico = new PessoaServiceProxy();
		
			//RetornoPessoa retorno = pessoaServico.buscarPessoa("55555555555");
			//System.out.println(retorno.getCodigoRetorno() +"-"+retorno.getMensagemRetorno());
			//System.out.println(retorno.getPessoaRetorno().getNome());
			
			
		//} catch (RemoteException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
		//try {
			//PessoaService pessoaServico = new PessoaServiceProxy();
			
			//ArrayList<Pessoa> listarTodos = new ArrayList<Pessoa>();
			
		     //Pessoa pessoa = new Pessoa();
			// pessoa.setNome("Juliana");
			//pessoa.setCpf("55555555555");
			//pessoa.setEndereco("Recife");
			//pessoa.setConta(856);
			
			//RetornoPessoa  retorno = pessoaServico.inserirPessoa(pessoa);
			
			//boolean achou = false;
			
			//for(Pessoa usuario : listarTodos){
				//if(usuario.getCpf().equals(pessoa.getCpf())) {
				//achou = true;
			//}
		//}
				
			//if(achou) {
				//retorno.setCodigoRetorno(1);
				//retorno.setMensagemRetorno("Erro, cpf existente");
			

			//}else {
				//retorno.setCodigoRetorno(0);
			   // retorno.setMensagemRetorno("INSERIDO!!!");
				//listarTodos.add(pessoa);
			//}
		
	
	
			
		//} catch (RemoteException e) {
			// TODO Auto-generated catch block
		     //  e.printStackTrace();

		//}

	
		try {
			PessoaService pessoaServico = new PessoaServiceProxy();
		
			RetornoPessoa retorno = pessoaServico.listarTodos();
			System.out.println(retorno.getCodigoRetorno() +"-"+retorno.getMensagemRetorno());
			System.out.println(retorno.getPessoaRetorno().getListarTodos());
			//System.out.println(retorno.getListarTodos().length);
			
			
			
			
		} catch (RemoteException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}
