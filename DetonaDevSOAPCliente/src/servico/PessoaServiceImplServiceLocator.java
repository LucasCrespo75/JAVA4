/**
 * PessoaServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servico;

public class PessoaServiceImplServiceLocator extends org.apache.axis.client.Service implements servico.PessoaServiceImplService {

    public PessoaServiceImplServiceLocator() {
    }


    public PessoaServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PessoaServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PessoaServiceImplPort
    private java.lang.String PessoaServiceImplPort_address = "http://localhost:8085/DetonaDevSOAP/Pessoa";

    public java.lang.String getPessoaServiceImplPortAddress() {
        return PessoaServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PessoaServiceImplPortWSDDServiceName = "PessoaServiceImplPort";

    public java.lang.String getPessoaServiceImplPortWSDDServiceName() {
        return PessoaServiceImplPortWSDDServiceName;
    }

    public void setPessoaServiceImplPortWSDDServiceName(java.lang.String name) {
        PessoaServiceImplPortWSDDServiceName = name;
    }

    public servico.PessoaService getPessoaServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PessoaServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPessoaServiceImplPort(endpoint);
    }

    public servico.PessoaService getPessoaServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            servico.PessoaServiceImplPortBindingStub _stub = new servico.PessoaServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getPessoaServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPessoaServiceImplPortEndpointAddress(java.lang.String address) {
        PessoaServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (servico.PessoaService.class.isAssignableFrom(serviceEndpointInterface)) {
                servico.PessoaServiceImplPortBindingStub _stub = new servico.PessoaServiceImplPortBindingStub(new java.net.URL(PessoaServiceImplPort_address), this);
                _stub.setPortName(getPessoaServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PessoaServiceImplPort".equals(inputPortName)) {
            return getPessoaServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servico/", "PessoaServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servico/", "PessoaServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PessoaServiceImplPort".equals(portName)) {
            setPessoaServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
