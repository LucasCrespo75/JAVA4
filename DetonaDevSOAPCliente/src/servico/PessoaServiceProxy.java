package servico;

public class PessoaServiceProxy implements servico.PessoaService {
  private String _endpoint = null;
  private servico.PessoaService pessoaService = null;
  
  public PessoaServiceProxy() {
    _initPessoaServiceProxy();
  }
  
  public PessoaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPessoaServiceProxy();
  }
  
  private void _initPessoaServiceProxy() {
    try {
      pessoaService = (new servico.PessoaServiceImplServiceLocator()).getPessoaServiceImplPort();
      if (pessoaService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pessoaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pessoaService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pessoaService != null)
      ((javax.xml.rpc.Stub)pessoaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servico.PessoaService getPessoaService() {
    if (pessoaService == null)
      _initPessoaServiceProxy();
    return pessoaService;
  }
  
  public servico.RetornoPessoa listarTodos() throws java.rmi.RemoteException{
    if (pessoaService == null)
      _initPessoaServiceProxy();
    return pessoaService.listarTodos();
  }
  
  public servico.RetornoPessoa buscarPessoa(java.lang.String arg0) throws java.rmi.RemoteException{
    if (pessoaService == null)
      _initPessoaServiceProxy();
    return pessoaService.buscarPessoa(arg0);
  }
  
  public servico.RetornoPessoa inserirPessoa(servico.Pessoa arg0) throws java.rmi.RemoteException{
    if (pessoaService == null)
      _initPessoaServiceProxy();
    return pessoaService.inserirPessoa(arg0);
  }
  
  
}