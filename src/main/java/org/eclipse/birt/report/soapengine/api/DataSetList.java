/**
 * DataSetList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class DataSetList  implements java.io.Serializable {
    private DataSet[] dataSet;

    public DataSetList() {
    }

    public DataSetList(
           DataSet[] dataSet) {
           this.dataSet = dataSet;
    }


    /**
     * Gets the dataSet value for this DataSetList.
     * 
     * @return dataSet
     */
    public DataSet[] getDataSet() {
        return dataSet;
    }


    /**
     * Sets the dataSet value for this DataSetList.
     * 
     * @param dataSet
     */
    public void setDataSet(DataSet[] dataSet) {
        this.dataSet = dataSet;
    }

    public DataSet getDataSet(int i) {
        return this.dataSet[i];
    }

    public void setDataSet(int i, DataSet _value) {
        this.dataSet[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DataSetList)) return false;
        DataSetList other = (DataSetList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataSet==null && other.getDataSet()==null) || 
             (this.dataSet!=null &&
              java.util.Arrays.equals(this.dataSet, other.getDataSet())));
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
        if (getDataSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataSet());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDataSet(), i);
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
        new org.apache.axis.description.TypeDesc(DataSetList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "DataSetList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "DataSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "DataSet"));
        elemField.setMinOccurs(0);
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
