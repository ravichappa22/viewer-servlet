/**
 * Operation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class Operation  implements java.io.Serializable {
    private ReportId target;
    private String operator;
    private Oprand[] oprand;
    private Data data;

    public Operation() {
    }

    public Operation(
           ReportId target,
           String operator,
           Oprand[] oprand,
           Data data) {
           this.target = target;
           this.operator = operator;
           this.oprand = oprand;
           this.data = data;
    }


    /**
     * Gets the target value for this Operation.
     * 
     * @return target
     */
    public ReportId getTarget() {
        return target;
    }


    /**
     * Sets the target value for this Operation.
     * 
     * @param target
     */
    public void setTarget(ReportId target) {
        this.target = target;
    }


    /**
     * Gets the operator value for this Operation.
     * 
     * @return operator
     */
    public String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this Operation.
     * 
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }


    /**
     * Gets the oprand value for this Operation.
     * 
     * @return oprand
     */
    public Oprand[] getOprand() {
        return oprand;
    }


    /**
     * Sets the oprand value for this Operation.
     * 
     * @param oprand
     */
    public void setOprand(Oprand[] oprand) {
        this.oprand = oprand;
    }

    public Oprand getOprand(int i) {
        return this.oprand[i];
    }

    public void setOprand(int i, Oprand _value) {
        this.oprand[i] = _value;
    }


    /**
     * Gets the data value for this Operation.
     * 
     * @return data
     */
    public Data getData() {
        return data;
    }


    /**
     * Sets the data value for this Operation.
     * 
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Operation)) return false;
        Operation other = (Operation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.oprand==null && other.getOprand()==null) || 
             (this.oprand!=null &&
              java.util.Arrays.equals(this.oprand, other.getOprand()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getOprand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOprand());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOprand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Operation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Operation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ReportId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oprand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Oprand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Oprand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Data"));
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
