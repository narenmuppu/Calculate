/**
 * TestCalculateServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class TestCalculateServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.TestCalculateService {

    public TestCalculateServiceLocator() {
    }


    public TestCalculateServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TestCalculateServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TestCalculate
    private java.lang.String TestCalculate_address = "http://localhost:8080/WebServiceProject/services/TestCalculate";

    public java.lang.String getTestCalculateAddress() {
        return TestCalculate_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TestCalculateWSDDServiceName = "TestCalculate";

    public java.lang.String getTestCalculateWSDDServiceName() {
        return TestCalculateWSDDServiceName;
    }

    public void setTestCalculateWSDDServiceName(java.lang.String name) {
        TestCalculateWSDDServiceName = name;
    }

    public DefaultNamespace.TestCalculate getTestCalculate() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TestCalculate_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTestCalculate(endpoint);
    }

    public DefaultNamespace.TestCalculate getTestCalculate(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.TestCalculateSoapBindingStub _stub = new DefaultNamespace.TestCalculateSoapBindingStub(portAddress, this);
            _stub.setPortName(getTestCalculateWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTestCalculateEndpointAddress(java.lang.String address) {
        TestCalculate_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.TestCalculate.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.TestCalculateSoapBindingStub _stub = new DefaultNamespace.TestCalculateSoapBindingStub(new java.net.URL(TestCalculate_address), this);
                _stub.setPortName(getTestCalculateWSDDServiceName());
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
        if ("TestCalculate".equals(inputPortName)) {
            return getTestCalculate();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "TestCalculateService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "TestCalculate"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TestCalculate".equals(portName)) {
            setTestCalculateEndpointAddress(address);
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
