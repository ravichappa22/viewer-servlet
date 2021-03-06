/**
 * JoinDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class JoinDefinition  implements java.io.Serializable {
    private IOReference leftIO;
    private IOReference rightIO;
    private JoinCondition[] joinConditions;

    public JoinDefinition() {
    }

    public JoinDefinition(
           IOReference leftIO,
           IOReference rightIO,
           JoinCondition[] joinConditions) {
           this.leftIO = leftIO;
           this.rightIO = rightIO;
           this.joinConditions = joinConditions;
    }


    /**
     * Gets the leftIO value for this JoinDefinition.
     * 
     * @return leftIO
     */
    public IOReference getLeftIO() {
        return leftIO;
    }


    /**
     * Sets the leftIO value for this JoinDefinition.
     * 
     * @param leftIO
     */
    public void setLeftIO(IOReference leftIO) {
        this.leftIO = leftIO;
    }


    /**
     * Gets the rightIO value for this JoinDefinition.
     * 
     * @return rightIO
     */
    public IOReference getRightIO() {
        return rightIO;
    }


    /**
     * Sets the rightIO value for this JoinDefinition.
     * 
     * @param rightIO
     */
    public void setRightIO(IOReference rightIO) {
        this.rightIO = rightIO;
    }


    /**
     * Gets the joinConditions value for this JoinDefinition.
     * 
     * @return joinConditions
     */
    public JoinCondition[] getJoinConditions() {
        return joinConditions;
    }


    /**
     * Sets the joinConditions value for this JoinDefinition.
     * 
     * @param joinConditions
     */
    public void setJoinConditions(JoinCondition[] joinConditions) {
        this.joinConditions = joinConditions;
    }

    public JoinCondition getJoinConditions(int i) {
        return this.joinConditions[i];
    }

    public void setJoinConditions(int i, JoinCondition _value) {
        this.joinConditions[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof JoinDefinition)) return false;
        JoinDefinition other = (JoinDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.leftIO==null && other.getLeftIO()==null) || 
             (this.leftIO!=null &&
              this.leftIO.equals(other.getLeftIO()))) &&
            ((this.rightIO==null && other.getRightIO()==null) || 
             (this.rightIO!=null &&
              this.rightIO.equals(other.getRightIO()))) &&
            ((this.joinConditions==null && other.getJoinConditions()==null) || 
             (this.joinConditions!=null &&
              java.util.Arrays.equals(this.joinConditions, other.getJoinConditions())));
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
        if (getLeftIO() != null) {
            _hashCode += getLeftIO().hashCode();
        }
        if (getRightIO() != null) {
            _hashCode += getRightIO().hashCode();
        }
        if (getJoinConditions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJoinConditions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getJoinConditions(), i);
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
        new org.apache.axis.description.TypeDesc(JoinDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "JoinDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftIO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "LeftIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "IOReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightIO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "RightIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "IOReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("joinConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "JoinConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "JoinCondition"));
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
