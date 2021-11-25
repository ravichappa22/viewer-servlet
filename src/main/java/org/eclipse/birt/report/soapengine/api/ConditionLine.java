/**
 * ConditionLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class ConditionLine  implements java.io.Serializable {
    private ReportParameterList reportParameterList;
    private String logicOp;
    private boolean hasLeftBracket;
    private boolean hasNot;
    private String row;
    private String operator;
    private String value1;
    private String value2;
    private boolean hasRightBracket;

    public ConditionLine() {
    }

    public ConditionLine(
           ReportParameterList reportParameterList,
           String logicOp,
           boolean hasLeftBracket,
           boolean hasNot,
           String row,
           String operator,
           String value1,
           String value2,
           boolean hasRightBracket) {
           this.reportParameterList = reportParameterList;
           this.logicOp = logicOp;
           this.hasLeftBracket = hasLeftBracket;
           this.hasNot = hasNot;
           this.row = row;
           this.operator = operator;
           this.value1 = value1;
           this.value2 = value2;
           this.hasRightBracket = hasRightBracket;
    }


    /**
     * Gets the reportParameterList value for this ConditionLine.
     * 
     * @return reportParameterList
     */
    public ReportParameterList getReportParameterList() {
        return reportParameterList;
    }


    /**
     * Sets the reportParameterList value for this ConditionLine.
     * 
     * @param reportParameterList
     */
    public void setReportParameterList(ReportParameterList reportParameterList) {
        this.reportParameterList = reportParameterList;
    }


    /**
     * Gets the logicOp value for this ConditionLine.
     * 
     * @return logicOp
     */
    public String getLogicOp() {
        return logicOp;
    }


    /**
     * Sets the logicOp value for this ConditionLine.
     * 
     * @param logicOp
     */
    public void setLogicOp(String logicOp) {
        this.logicOp = logicOp;
    }


    /**
     * Gets the hasLeftBracket value for this ConditionLine.
     * 
     * @return hasLeftBracket
     */
    public boolean isHasLeftBracket() {
        return hasLeftBracket;
    }


    /**
     * Sets the hasLeftBracket value for this ConditionLine.
     * 
     * @param hasLeftBracket
     */
    public void setHasLeftBracket(boolean hasLeftBracket) {
        this.hasLeftBracket = hasLeftBracket;
    }


    /**
     * Gets the hasNot value for this ConditionLine.
     * 
     * @return hasNot
     */
    public boolean isHasNot() {
        return hasNot;
    }


    /**
     * Sets the hasNot value for this ConditionLine.
     * 
     * @param hasNot
     */
    public void setHasNot(boolean hasNot) {
        this.hasNot = hasNot;
    }


    /**
     * Gets the row value for this ConditionLine.
     * 
     * @return row
     */
    public String getRow() {
        return row;
    }


    /**
     * Sets the row value for this ConditionLine.
     * 
     * @param row
     */
    public void setRow(String row) {
        this.row = row;
    }


    /**
     * Gets the operator value for this ConditionLine.
     * 
     * @return operator
     */
    public String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ConditionLine.
     * 
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }


    /**
     * Gets the value1 value for this ConditionLine.
     * 
     * @return value1
     */
    public String getValue1() {
        return value1;
    }


    /**
     * Sets the value1 value for this ConditionLine.
     * 
     * @param value1
     */
    public void setValue1(String value1) {
        this.value1 = value1;
    }


    /**
     * Gets the value2 value for this ConditionLine.
     * 
     * @return value2
     */
    public String getValue2() {
        return value2;
    }


    /**
     * Sets the value2 value for this ConditionLine.
     * 
     * @param value2
     */
    public void setValue2(String value2) {
        this.value2 = value2;
    }


    /**
     * Gets the hasRightBracket value for this ConditionLine.
     * 
     * @return hasRightBracket
     */
    public boolean isHasRightBracket() {
        return hasRightBracket;
    }


    /**
     * Sets the hasRightBracket value for this ConditionLine.
     * 
     * @param hasRightBracket
     */
    public void setHasRightBracket(boolean hasRightBracket) {
        this.hasRightBracket = hasRightBracket;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConditionLine)) return false;
        ConditionLine other = (ConditionLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reportParameterList==null && other.getReportParameterList()==null) || 
             (this.reportParameterList!=null &&
              this.reportParameterList.equals(other.getReportParameterList()))) &&
            ((this.logicOp==null && other.getLogicOp()==null) || 
             (this.logicOp!=null &&
              this.logicOp.equals(other.getLogicOp()))) &&
            this.hasLeftBracket == other.isHasLeftBracket() &&
            this.hasNot == other.isHasNot() &&
            ((this.row==null && other.getRow()==null) || 
             (this.row!=null &&
              this.row.equals(other.getRow()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.value1==null && other.getValue1()==null) || 
             (this.value1!=null &&
              this.value1.equals(other.getValue1()))) &&
            ((this.value2==null && other.getValue2()==null) || 
             (this.value2!=null &&
              this.value2.equals(other.getValue2()))) &&
            this.hasRightBracket == other.isHasRightBracket();
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
        if (getReportParameterList() != null) {
            _hashCode += getReportParameterList().hashCode();
        }
        if (getLogicOp() != null) {
            _hashCode += getLogicOp().hashCode();
        }
        _hashCode += (isHasLeftBracket() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasNot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRow() != null) {
            _hashCode += getRow().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getValue1() != null) {
            _hashCode += getValue1().hashCode();
        }
        if (getValue2() != null) {
            _hashCode += getValue2().hashCode();
        }
        _hashCode += (isHasRightBracket() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConditionLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ConditionLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportParameterList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ReportParameterList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ReportParameterList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicOp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "LogicOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasLeftBracket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "HasLeftBracket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasNot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "HasNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("row");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Row"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Value1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Value2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasRightBracket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "HasRightBracket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
