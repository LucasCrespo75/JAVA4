package entidade;
	import java.util.List;

	public class Pessoa {
		private String nome;
		private String cpf;
		private String endereco;
		private int conta;
		List<Pessoa> listarTodos;
		
		public String getNome() {
			return nome;
		}
		public String getCpf() {
			return cpf;
		}
		public String getEndereco() {
			return endereco;
		}
		public int getConta() {
			return conta;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public void setConta(int conta) {
			this.conta = conta;
		}
		public List<Pessoa> getListarTodos() {
			return listarTodos;
		}
		public void setListarTodos(List<Pessoa> listarTodos) {
			this.listarTodos = listarTodos;
		}
		
		

	

}
