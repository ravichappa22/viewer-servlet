/**
 * SortDefinitionList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class SortDefinitionList  implements java.io.Serializable {
    private SortDefinition[] sortDefinition;

    public SortDefinitionList() {
    }

    public SortDefinitionList(
           SortDefinition[] sortDefinition) {
           this.sortDefinition = sortDefinition;
    }


    /**
     * Gets the sortDefinition value for this SortDefinitionList.
     * 
     * @return sortDefinition
     */
    public SortDefinition[] getSortDefinition() {
        return sortDefinition;
    }


    /**
     * Sets the sortDefinition value for this SortDefinitionList.
     * 
     * @param sortDefinition
     */
    public void setSortDefinition(SortDefinition[] sortDefinition) {
        this.sortDefinition = sortDefinition;
    }

    public SortDefinition getSortDefinition(int i) {
        return this.sortDefinition[i];
    }

    public void setSortDefinition(int i, SortDefinition _value) {
        this.sortDefinition[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SortDefinitionList)) return false;
        SortDefinitionList other = (SortDefinitionList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sortDefinition==null && other.getSortDefinition()==null) || 
             (this.sortDefinition!=null &&
              java.util.Arrays.equals(this.sortDefinition, other.getSortDefinition())));
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
        if (getSortDefinition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSortDefinition());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSortDefinition(), i);
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
        new org.apache.axis.description.TypeDesc(SortDefinitionList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "SortDefinitionList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "SortDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "SortDefinition"));
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
