/**
 * BirtViewerAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.endpoint;

public interface BirtViewerAPI extends javax.xml.rpc.Service {
    public String getBirtSoapPortAddress();

    public BirtSoapPort getBirtSoapPort() throws javax.xml.rpc.ServiceException;

    public BirtSoapPort getBirtSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
