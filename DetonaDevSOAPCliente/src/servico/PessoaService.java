/**
 * PessoaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servico;

public interface PessoaService extends java.rmi.Remote {
    public servico.RetornoPessoa listarTodos() throws java.rmi.RemoteException;
    public servico.RetornoPessoa buscarPessoa(java.lang.String arg0) throws java.rmi.RemoteException;
    public servico.RetornoPessoa inserirPessoa(servico.Pessoa arg0) throws java.rmi.RemoteException;
}
