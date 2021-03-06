/**
 * CascadeParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class CascadeParameter  implements java.io.Serializable {
    private SelectionList[] selectionList;

    public CascadeParameter() {
    }

    public CascadeParameter(
           SelectionList[] selectionList) {
           this.selectionList = selectionList;
    }


    /**
     * Gets the selectionList value for this CascadeParameter.
     * 
     * @return selectionList
     */
    public SelectionList[] getSelectionList() {
        return selectionList;
    }


    /**
     * Sets the selectionList value for this CascadeParameter.
     * 
     * @param selectionList
     */
    public void setSelectionList(SelectionList[] selectionList) {
        this.selectionList = selectionList;
    }

    public SelectionList getSelectionList(int i) {
        return this.selectionList[i];
    }

    public void setSelectionList(int i, SelectionList _value) {
        this.selectionList[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CascadeParameter)) return false;
        CascadeParameter other = (CascadeParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.selectionList==null && other.getSelectionList()==null) || 
             (this.selectionList!=null &&
              java.util.Arrays.equals(this.selectionList, other.getSelectionList())));
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
        if (getSelectionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelectionList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSelectionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CascadeParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "CascadeParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectionList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "SelectionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "SelectionList"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
