/**
 * Credit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fsr.iao;

public class Credit  implements java.io.Serializable {
    private double annuite;

    private double capital;

    private java.lang.String date;

    private long duree;

    private int numCre;

    private int numclient;

    private double taux;

    public Credit() {
    }

    public Credit(
           double annuite,
           double capital,
           java.lang.String date,
           long duree,
           int numCre,
           int numclient,
           double taux) {
           this.annuite = annuite;
           this.capital = capital;
           this.date = date;
           this.duree = duree;
           this.numCre = numCre;
           this.numclient = numclient;
           this.taux = taux;
    }


    /**
     * Gets the annuite value for this Credit.
     * 
     * @return annuite
     */
    public double getAnnuite() {
        return annuite;
    }


    /**
     * Sets the annuite value for this Credit.
     * 
     * @param annuite
     */
    public void setAnnuite(double annuite) {
        this.annuite = annuite;
    }


    /**
     * Gets the capital value for this Credit.
     * 
     * @return capital
     */
    public double getCapital() {
        return capital;
    }


    /**
     * Sets the capital value for this Credit.
     * 
     * @param capital
     */
    public void setCapital(double capital) {
        this.capital = capital;
    }


    /**
     * Gets the date value for this Credit.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this Credit.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the duree value for this Credit.
     * 
     * @return duree
     */
    public long getDuree() {
        return duree;
    }


    /**
     * Sets the duree value for this Credit.
     * 
     * @param duree
     */
    public void setDuree(long duree) {
        this.duree = duree;
    }


    /**
     * Gets the numCre value for this Credit.
     * 
     * @return numCre
     */
    public int getNumCre() {
        return numCre;
    }


    /**
     * Sets the numCre value for this Credit.
     * 
     * @param numCre
     */
    public void setNumCre(int numCre) {
        this.numCre = numCre;
    }


    /**
     * Gets the numclient value for this Credit.
     * 
     * @return numclient
     */
    public int getNumclient() {
        return numclient;
    }


    /**
     * Sets the numclient value for this Credit.
     * 
     * @param numclient
     */
    public void setNumclient(int numclient) {
        this.numclient = numclient;
    }


    /**
     * Gets the taux value for this Credit.
     * 
     * @return taux
     */
    public double getTaux() {
        return taux;
    }


    /**
     * Sets the taux value for this Credit.
     * 
     * @param taux
     */
    public void setTaux(double taux) {
        this.taux = taux;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credit)) return false;
        Credit other = (Credit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.annuite == other.getAnnuite() &&
            this.capital == other.getCapital() &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.duree == other.getDuree() &&
            this.numCre == other.getNumCre() &&
            this.numclient == other.getNumclient() &&
            this.taux == other.getTaux();
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
        _hashCode += new Double(getAnnuite()).hashCode();
        _hashCode += new Double(getCapital()).hashCode();
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += new Long(getDuree()).hashCode();
        _hashCode += getNumCre();
        _hashCode += getNumclient();
        _hashCode += new Double(getTaux()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://iao.fsr.com", "Credit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annuite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iao.fsr.com", "annuite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iao.fsr.com", "capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iao.fsr.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iao.fsr.com", "duree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iao.fsr.com", "numCre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numclient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iao.fsr.com", "numclient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taux");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iao.fsr.com", "taux"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
