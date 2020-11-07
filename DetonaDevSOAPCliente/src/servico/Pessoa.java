/**
 * Pessoa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servico;

public class Pessoa  implements java.io.Serializable {
    private int conta;

    private java.lang.String cpf;

    private java.lang.String endereco;

    private servico.Pessoa[] listarTodos;

    private java.lang.String nome;

    public Pessoa() {
    }

    public Pessoa(
           int conta,
           java.lang.String cpf,
           java.lang.String endereco,
           servico.Pessoa[] listarTodos,
           java.lang.String nome) {
           this.conta = conta;
           this.cpf = cpf;
           this.endereco = endereco;
           this.listarTodos = listarTodos;
           this.nome = nome;
    }


    /**
     * Gets the conta value for this Pessoa.
     * 
     * @return conta
     */
    public int getConta() {
        return conta;
    }


    /**
     * Sets the conta value for this Pessoa.
     * 
     * @param conta
     */
    public void setConta(int conta) {
        this.conta = conta;
    }


    /**
     * Gets the cpf value for this Pessoa.
     * 
     * @return cpf
     */
    public java.lang.String getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this Pessoa.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the endereco value for this Pessoa.
     * 
     * @return endereco
     */
    public java.lang.String getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this Pessoa.
     * 
     * @param endereco
     */
    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the listarTodos value for this Pessoa.
     * 
     * @return listarTodos
     */
    public servico.Pessoa[] getListarTodos() {
        return listarTodos;
    }


    /**
     * Sets the listarTodos value for this Pessoa.
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
     * Gets the nome value for this Pessoa.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Pessoa.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pessoa)) return false;
        Pessoa other = (Pessoa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.conta == other.getConta() &&
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              this.cpf.equals(other.getCpf()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.listarTodos==null && other.getListarTodos()==null) || 
             (this.listarTodos!=null &&
              java.util.Arrays.equals(this.listarTodos, other.getListarTodos()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome())));
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
        _hashCode += getConta();
        if (getCpf() != null) {
            _hashCode += getCpf().hashCode();
        }
        if (getEndereco() != null) {
            _hashCode += getEndereco().hashCode();
        }
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pessoa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servico/", "pessoa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
