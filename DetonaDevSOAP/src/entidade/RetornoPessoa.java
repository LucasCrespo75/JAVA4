package entidade;

import java.util.List;

public class RetornoPessoa {
	private int codigoRetorno; //0 - sucesso 1 - erro
	private String mensagemRetorno;
	private List<Pessoa> listarTodos;//PessoaServiceImpl= setListarTodos(listarTodos)
	private Pessoa pessoaRetorno; //se for pedir a pessoa toda 
	
	public int getCodigoRetorno() {
		return codigoRetorno;
	}
	public String getMensagemRetorno() {
		return mensagemRetorno;
	
	}
	public void setCodigoRetorno(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
	public List<Pessoa> getListarTodos() {
		return listarTodos;
	}
	public void setListarTodos(List<Pessoa> listarTodos) {
		this.listarTodos = listarTodos;
	}
	
	public Pessoa getPessoaRetorno(){
		return pessoaRetorno;
}

	public void setPessoaRetorno(Pessoa pessoaRetorno){
		this.pessoaRetorno = pessoaRetorno;
		
	}
}
