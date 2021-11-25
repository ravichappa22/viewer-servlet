/**
 * FilterClause.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class FilterClause  implements java.io.Serializable {
    private ColumnDefinition column;
    private BoundDataColumn columnName;
    private String filterOp;
    private String[] operand;

    public FilterClause() {
    }

    public FilterClause(
           ColumnDefinition column,
           BoundDataColumn columnName,
           String filterOp,
           String[] operand) {
           this.column = column;
           this.columnName = columnName;
           this.filterOp = filterOp;
           this.operand = operand;
    }


    /**
     * Gets the column value for this FilterClause.
     * 
     * @return column
     */
    public ColumnDefinition getColumn() {
        return column;
    }


    /**
     * Sets the column value for this FilterClause.
     * 
     * @param column
     */
    public void setColumn(ColumnDefinition column) {
        this.column = column;
    }


    /**
     * Gets the columnName value for this FilterClause.
     * 
     * @return columnName
     */
    public BoundDataColumn getColumnName() {
        return columnName;
    }


    /**
     * Sets the columnName value for this FilterClause.
     * 
     * @param columnName
     */
    public void setColumnName(BoundDataColumn columnName) {
        this.columnName = columnName;
    }


    /**
     * Gets the filterOp value for this FilterClause.
     * 
     * @return filterOp
     */
    public String getFilterOp() {
        return filterOp;
    }


    /**
     * Sets the filterOp value for this FilterClause.
     * 
     * @param filterOp
     */
    public void setFilterOp(String filterOp) {
        this.filterOp = filterOp;
    }


    /**
     * Gets the operand value for this FilterClause.
     * 
     * @return operand
     */
    public String[] getOperand() {
        return operand;
    }


    /**
     * Sets the operand value for this FilterClause.
     * 
     * @param operand
     */
    public void setOperand(String[] operand) {
        this.operand = operand;
    }

    public String getOperand(int i) {
        return this.operand[i];
    }

    public void setOperand(int i, String _value) {
        this.operand[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FilterClause)) return false;
        FilterClause other = (FilterClause) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.column==null && other.getColumn()==null) || 
             (this.column!=null &&
              this.column.equals(other.getColumn()))) &&
            ((this.columnName==null && other.getColumnName()==null) || 
             (this.columnName!=null &&
              this.columnName.equals(other.getColumnName()))) &&
            ((this.filterOp==null && other.getFilterOp()==null) || 
             (this.filterOp!=null &&
              this.filterOp.equals(other.getFilterOp()))) &&
            ((this.operand==null && other.getOperand()==null) || 
             (this.operand!=null &&
              java.util.Arrays.equals(this.operand, other.getOperand())));
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
        if (getColumn() != null) {
            _hashCode += getColumn().hashCode();
        }
        if (getColumnName() != null) {
            _hashCode += getColumnName().hashCode();
        }
        if (getFilterOp() != null) {
            _hashCode += getFilterOp().hashCode();
        }
        if (getOperand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperand());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOperand(), i);
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
        new org.apache.axis.description.TypeDesc(FilterClause.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FilterClause"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ColumnDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ColumnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "BoundDataColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterOp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FilterOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Operand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
