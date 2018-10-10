package DefaultNamespace;

public class TestCalculateProxy implements DefaultNamespace.TestCalculate {
  private String _endpoint = null;
  private DefaultNamespace.TestCalculate testCalculate = null;
  
  public TestCalculateProxy() {
    _initTestCalculateProxy();
  }
  
  public TestCalculateProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestCalculateProxy();
  }
  
  private void _initTestCalculateProxy() {
    try {
      testCalculate = (new DefaultNamespace.TestCalculateServiceLocator()).getTestCalculate();
      if (testCalculate != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testCalculate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testCalculate)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testCalculate != null)
      ((javax.xml.rpc.Stub)testCalculate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.TestCalculate getTestCalculate() {
    if (testCalculate == null)
      _initTestCalculateProxy();
    return testCalculate;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (testCalculate == null)
      _initTestCalculateProxy();
    return testCalculate.add(a, b);
  }
  
  public int subtract(int a, int b) throws java.rmi.RemoteException{
    if (testCalculate == null)
      _initTestCalculateProxy();
    return testCalculate.subtract(a, b);
  }
  
  public int multiply(int a, int b) throws java.rmi.RemoteException{
    if (testCalculate == null)
      _initTestCalculateProxy();
    return testCalculate.multiply(a, b);
  }
  
  
}