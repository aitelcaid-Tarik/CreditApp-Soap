package com.fsr.iao;

public class CreditWSProxy implements com.fsr.iao.CreditWS {
  private String _endpoint = null;
  private com.fsr.iao.CreditWS creditWS = null;
  
  public CreditWSProxy() {
    _initCreditWSProxy();
  }
  
  public CreditWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreditWSProxy();
  }
  
  private void _initCreditWSProxy() {
    try {
      creditWS = (new com.fsr.iao.CreditWSServiceLocator()).getCreditWS();
      if (creditWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)creditWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)creditWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (creditWS != null)
      ((javax.xml.rpc.Stub)creditWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.fsr.iao.CreditWS getCreditWS() {
    if (creditWS == null)
      _initCreditWSProxy();
    return creditWS;
  }
  
  public com.fsr.iao.Client login(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException{
    if (creditWS == null)
      _initCreditWSProxy();
    return creditWS.login(email, pass);
  }
  
  public double calculAnnuelle(double taux) throws java.rmi.RemoteException{
    if (creditWS == null)
      _initCreditWSProxy();
    return creditWS.calculAnnuelle(taux);
  }
  
  public double calculAnnuite(double capital, double t, long duree) throws java.rmi.RemoteException{
    if (creditWS == null)
      _initCreditWSProxy();
    return creditWS.calculAnnuite(capital, t, duree);
  }
  
  public double calculCapital(double annuite, double t, long duree) throws java.rmi.RemoteException{
    if (creditWS == null)
      _initCreditWSProxy();
    return creditWS.calculCapital(annuite, t, duree);
  }
  
  public long calculDuree(double capital, double t, double annuite) throws java.rmi.RemoteException{
    if (creditWS == null)
      _initCreditWSProxy();
    return creditWS.calculDuree(capital, t, annuite);
  }
  
  public int insertClient(java.lang.String nomCli, java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException{
    if (creditWS == null)
      _initCreditWSProxy();
    return creditWS.insertClient(nomCli, email, pass);
  }
  
  public int insertCredit(double capital, long duree, double taux, double annuite, int numclient) throws java.rmi.RemoteException{
    if (creditWS == null)
      _initCreditWSProxy();
    return creditWS.insertCredit(capital, duree, taux, annuite, numclient);
  }
  
  public com.fsr.iao.Credit[] getAllCredit(int numCli) throws java.rmi.RemoteException{
    if (creditWS == null)
      _initCreditWSProxy();
    return creditWS.getAllCredit(numCli);
  }
  
  
}