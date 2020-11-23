/**
 * Client.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fsr.iao;

public class Client  implements java.io.Serializable {
    private java.lang.String email;

    private java.lang.String nomCli;

    private int numCli;

    private java.lang.String pass;

    public Client() {
    }

    public Client(
           java.lang.String email,
           java.lang.String nomCli,
           int numCli,
           java.lang.String pass) {
           this.email = email;
           this.nomCli = nomCli;
           this.numCli = numCli;
           this.pass = pass;
    }


    /**
     * Gets the email value for this Client.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Client.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the nomCli value for this Client.
     * 
     * @return nomCli
     */
    public java.lang.String getNomCli() {
        return nomCli;
    }


    /**
     * Sets the nomCli value for this Client.
     * 
     * @param nomCli
     */
    public void setNomCli(java.lang.String nomCli) {
        this.nomCli = nomCli;
    }


    /**
     * Gets the numCli value for this Client.
     * 
     * @return numCli
     */
    public int getNumCli() {
        return numCli;
    }


    /**
     * Sets the numCli value for this Client.
     * 
     * @param numCli
     */
    public void setNumCli(int numCli) {
        this.numCli = numCli;
    }


    /**
     * Gets the pass value for this Client.
     * 
     * @return pass
     */
    public java.lang.String getPass() {
        return pass;
    }


    /**
     * Sets the pass value for this Client.
     * 
     * @param pass
     */
    public void setPass(java.lang.String pass) {
        this.pass = pass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Client)) return false;
        Client other = (Client) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.nomCli==null && other.getNomCli()==null) || 
             (this.nomCli!=null &&
              this.nomCli.equals(other.getNomCli()))) &&
            this.numCli == other.getNumCli() &&
            ((this.pass==null && other.getPass()==null) || 
             (this.pass!=null &&
              this.pass.equals(other.getPass())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getNomCli() != null) {
            _hashCode += getNomCli().hashCode();
        }
        _hashCode += getNumCli();
        if (getPass() != null) {
            _hashCode += getPass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Client.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://iao.fsr.com", "Client"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iao.fsr.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomCli");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iao.fsr.com", "nomCli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCli");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iao.fsr.com", "numCli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iao.fsr.com", "pass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
