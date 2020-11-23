/**
 * CreditWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fsr.iao;

public class CreditWSServiceLocator extends org.apache.axis.client.Service implements com.fsr.iao.CreditWSService {

    public CreditWSServiceLocator() {
    }


    public CreditWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreditWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreditWS
    private java.lang.String CreditWS_address = "http://localhost:8080/CreditAppSoap/services/CreditWS";

    public java.lang.String getCreditWSAddress() {
        return CreditWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreditWSWSDDServiceName = "CreditWS";

    public java.lang.String getCreditWSWSDDServiceName() {
        return CreditWSWSDDServiceName;
    }

    public void setCreditWSWSDDServiceName(java.lang.String name) {
        CreditWSWSDDServiceName = name;
    }

    public com.fsr.iao.CreditWS getCreditWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreditWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreditWS(endpoint);
    }

    public com.fsr.iao.CreditWS getCreditWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fsr.iao.CreditWSSoapBindingStub _stub = new com.fsr.iao.CreditWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getCreditWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreditWSEndpointAddress(java.lang.String address) {
        CreditWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fsr.iao.CreditWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fsr.iao.CreditWSSoapBindingStub _stub = new com.fsr.iao.CreditWSSoapBindingStub(new java.net.URL(CreditWS_address), this);
                _stub.setPortName(getCreditWSWSDDServiceName());
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
        if ("CreditWS".equals(inputPortName)) {
            return getCreditWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://iao.fsr.com", "CreditWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://iao.fsr.com", "CreditWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreditWS".equals(portName)) {
            setCreditWSEndpointAddress(address);
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
