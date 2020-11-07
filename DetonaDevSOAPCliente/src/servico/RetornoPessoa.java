/**
 * RetornoPessoa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servico;

public class RetornoPessoa  implements java.io.Serializable {
    private int codigoRetorno;

    private servico.Pessoa[] listarTodos;

    private java.lang.String mensagemRetorno;

    private servico.Pessoa pessoaRetorno;

    public RetornoPessoa() {
    }

    public RetornoPessoa(
           int codigoRetorno,
           servico.Pessoa[] listarTodos,
           java.lang.String mensagemRetorno,
           servico.Pessoa pessoaRetorno) {
           this.codigoRetorno = codigoRetorno;
           this.listarTodos = listarTodos;
           this.mensagemRetorno = mensagemRetorno;
           this.pessoaRetorno = pessoaRetorno;
    }


    /**
     * Gets the codigoRetorno value for this RetornoPessoa.
     * 
     * @return codigoRetorno
     */
    public int getCodigoRetorno() {
        return codigoRetorno;
    }


    /**
     * Sets the codigoRetorno value for this RetornoPessoa.
     * 
     * @param codigoRetorno
     */
    public void setCodigoRetorno(int codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }


    /**
     * Gets the listarTodos value for this RetornoPessoa.
     * 
     * @return listarTodos
     */
    public servico.Pessoa[] getListarTodos() {
        return listarTodos;
    }


    /**
     * Sets the listarTodos value for this RetornoPessoa.
     * 
     * @param listarTodos
     */
    public void setListarTodos(servico.Pessoa[] listarTodos) {
        this.listarTodos = listarTodos;
    }

    public servico.Pessoa getListarTodos(int i) {
        return this.listarTodos[i];
    }

    public void setListarTodos(int i, servico.Pessoa _value) {
        this.listarTodos[i] = _value;
    }


    /**
     * Gets the mensagemRetorno value for this RetornoPessoa.
     * 
     * @return mensagemRetorno
     */
    public java.lang.String getMensagemRetorno() {
        return mensagemRetorno;
    }


    /**
     * Sets the mensagemRetorno value for this RetornoPessoa.
     * 
     * @param mensagemRetorno
     */
    public void setMensagemRetorno(java.lang.String mensagemRetorno) {
        this.mensagemRetorno = mensagemRetorno;
    }


    /**
     * Gets the pessoaRetorno value for this RetornoPessoa.
     * 
     * @return pessoaRetorno
     */
    public servico.Pessoa getPessoaRetorno() {
        return pessoaRetorno;
    }


    /**
     * Sets the pessoaRetorno value for this RetornoPessoa.
     * 
     * @param pessoaRetorno
     */
    public void setPessoaRetorno(servico.Pessoa pessoaRetorno) {
        this.pessoaRetorno = pessoaRetorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoPessoa)) return false;
        RetornoPessoa other = (RetornoPessoa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigoRetorno == other.getCodigoRetorno() &&
            ((this.listarTodos==null && other.getListarTodos()==null) || 
             (this.listarTodos!=null &&
              java.util.Arrays.equals(this.listarTodos, other.getListarTodos()))) &&
            ((this.mensagemRetorno==null && other.getMensagemRetorno()==null) || 
             (this.mensagemRetorno!=null &&
              this.mensagemRetorno.equals(other.getMensagemRetorno()))) &&
            ((this.pessoaRetorno==null && other.getPessoaRetorno()==null) || 
             (this.pessoaRetorno!=null &&
              this.pessoaRetorno.equals(other.getPessoaRetorno())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCodigoRetorno();
        if (getListarTodos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListarTodos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListarTodos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensagemRetorno() != null) {
            _hashCode += getMensagemRetorno().hashCode();
        }
        if (getPessoaRetorno() != null) {
            _hashCode += getPessoaRetorno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoPessoa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servico/", "retornoPessoa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listarTodos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listarTodos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servico/", "pessoa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagemRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pessoaRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pessoaRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servico/", "pessoa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
