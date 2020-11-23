/**
 * CreditWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fsr.iao;

public interface CreditWS extends java.rmi.Remote {
    public com.fsr.iao.Client login(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException;
    public double calculAnnuelle(double taux) throws java.rmi.RemoteException;
    public double calculAnnuite(double capital, double t, long duree) throws java.rmi.RemoteException;
    public double calculCapital(double annuite, double t, long duree) throws java.rmi.RemoteException;
    public long calculDuree(double capital, double t, double annuite) throws java.rmi.RemoteException;
    public int insertClient(java.lang.String nomCli, java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException;
    public int insertCredit(double capital, long duree, double taux, double annuite, int numclient) throws java.rmi.RemoteException;
    public com.fsr.iao.Credit[] getAllCredit(int numCli) throws java.rmi.RemoteException;
}
