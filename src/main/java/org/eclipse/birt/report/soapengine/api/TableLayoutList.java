/**
 * TableLayoutList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class TableLayoutList  implements java.io.Serializable {
    private TableLayout[] tableLayout;

    public TableLayoutList() {
    }

    public TableLayoutList(
           TableLayout[] tableLayout) {
           this.tableLayout = tableLayout;
    }


    /**
     * Gets the tableLayout value for this TableLayoutList.
     * 
     * @return tableLayout
     */
    public TableLayout[] getTableLayout() {
        return tableLayout;
    }


    /**
     * Sets the tableLayout value for this TableLayoutList.
     * 
     * @param tableLayout
     */
    public void setTableLayout(TableLayout[] tableLayout) {
        this.tableLayout = tableLayout;
    }

    public TableLayout getTableLayout(int i) {
        return this.tableLayout[i];
    }

    public void setTableLayout(int i, TableLayout _value) {
        this.tableLayout[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TableLayoutList)) return false;
        TableLayoutList other = (TableLayoutList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tableLayout==null && other.getTableLayout()==null) || 
             (this.tableLayout!=null &&
              java.util.Arrays.equals(this.tableLayout, other.getTableLayout())));
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
        if (getTableLayout() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTableLayout());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTableLayout(), i);
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
        new org.apache.axis.description.TypeDesc(TableLayoutList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "TableLayoutList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "TableLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "TableLayout"));
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
