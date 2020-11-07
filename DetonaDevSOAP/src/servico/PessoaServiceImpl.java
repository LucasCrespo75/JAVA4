package servico;

import java.util.ArrayList;

import javax.jws.WebService;

import entidade.Pessoa;
import entidade.RetornoPessoa;

@WebService(endpointInterface = "servico.PessoaService")
public class PessoaServiceImpl implements PessoaService {


		
	private ArrayList<Pessoa> listarTodos = new ArrayList<Pessoa>();

	public RetornoPessoa inserirPessoa(Pessoa pessoa) {
		
		RetornoPessoa retorno = new RetornoPessoa();
		
		retorno.setCodigoRetorno(0); //0 - sucesso 1 - erro
		retorno.setMensagemRetorno("INSERIDO!!!");
		
		boolean achou = false;
		
		for(Pessoa usuario : listarTodos){
			if(usuario.getCpf().equals(pessoa.getCpf())) {
			achou = true;
		}
	}
			
		if(achou) {
			retorno.setCodigoRetorno(1);
			retorno.setMensagemRetorno("Erro, cpf existente");
		

		}else {
			retorno.setCodigoRetorno(0);
			retorno.setMensagemRetorno("INSERIDO!!!");
			this.listarTodos.add(pessoa);
			
		}
		return retorno;
}

	public RetornoPessoa buscarPessoa(String cpf) {
		
	RetornoPessoa retorno = new RetornoPessoa();
		
		retorno.setCodigoRetorno(0); //0 - sucesso 1 - erro
		retorno.setMensagemRetorno("achado!!!");
		
		//p/ chamar apenas o cpf q foi inserido.Determinando quem a pessoa é pelo Cpf
		//for(int i=0;i<listarTodos.size();i++) {
			//System.out.println(listarTodos.get(i).getCpf());
		
		//p/ chamar a pessoa "inteira"
		for(Pessoa usuario : listarTodos){
				if(usuario.getCpf().equals(usuario.getCpf()));
					retorno.setPessoaRetorno(usuario);	
		}
		return retorno;
	}
	
	public RetornoPessoa listarTodos() {
		
		RetornoPessoa retorno = new RetornoPessoa();
		
		retorno.setCodigoRetorno(0); //0 - sucesso 1 - erro
		retorno.setMensagemRetorno("listado!!!");
		retorno.setListarTodos(this.listarTodos);
		return retorno;
	}


	


}


	

