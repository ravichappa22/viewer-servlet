/**
 * ChartProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class ChartProperties  implements java.io.Serializable {
    private ChartType type;
    private ChartDataBinding dataBinding;
    private ChartLabels labels;
    private ChartAppearance apperance;

    public ChartProperties() {
    }

    public ChartProperties(
           ChartType type,
           ChartDataBinding dataBinding,
           ChartLabels labels,
           ChartAppearance apperance) {
           this.type = type;
           this.dataBinding = dataBinding;
           this.labels = labels;
           this.apperance = apperance;
    }


    /**
     * Gets the type value for this ChartProperties.
     * 
     * @return type
     */
    public ChartType getType() {
        return type;
    }


    /**
     * Sets the type value for this ChartProperties.
     * 
     * @param type
     */
    public void setType(ChartType type) {
        this.type = type;
    }


    /**
     * Gets the dataBinding value for this ChartProperties.
     * 
     * @return dataBinding
     */
    public ChartDataBinding getDataBinding() {
        return dataBinding;
    }


    /**
     * Sets the dataBinding value for this ChartProperties.
     * 
     * @param dataBinding
     */
    public void setDataBinding(ChartDataBinding dataBinding) {
        this.dataBinding = dataBinding;
    }


    /**
     * Gets the labels value for this ChartProperties.
     * 
     * @return labels
     */
    public ChartLabels getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this ChartProperties.
     * 
     * @param labels
     */
    public void setLabels(ChartLabels labels) {
        this.labels = labels;
    }


    /**
     * Gets the apperance value for this ChartProperties.
     * 
     * @return apperance
     */
    public ChartAppearance getApperance() {
        return apperance;
    }


    /**
     * Sets the apperance value for this ChartProperties.
     * 
     * @param apperance
     */
    public void setApperance(ChartAppearance apperance) {
        this.apperance = apperance;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChartProperties)) return false;
        ChartProperties other = (ChartProperties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.dataBinding==null && other.getDataBinding()==null) || 
             (this.dataBinding!=null &&
              this.dataBinding.equals(other.getDataBinding()))) &&
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              this.labels.equals(other.getLabels()))) &&
            ((this.apperance==null && other.getApperance()==null) || 
             (this.apperance!=null &&
              this.apperance.equals(other.getApperance())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDataBinding() != null) {
            _hashCode += getDataBinding().hashCode();
        }
        if (getLabels() != null) {
            _hashCode += getLabels().hashCode();
        }
        if (getApperance() != null) {
            _hashCode += getApperance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChartProperties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ChartProperties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ChartType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataBinding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "DataBinding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ChartDataBinding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ChartLabels"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apperance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Apperance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ChartAppearance"));
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
