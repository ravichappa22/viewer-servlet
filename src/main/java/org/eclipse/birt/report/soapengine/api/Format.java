/**
 * Format.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class Format  implements java.io.Serializable {
    private CategoryChoiceList stringFormat;
    private CategoryChoiceList dateTimeFormat;
    private NumberCategoryChoiceList numberFormat;

    public Format() {
    }

    public Format(
           CategoryChoiceList stringFormat,
           CategoryChoiceList dateTimeFormat,
           NumberCategoryChoiceList numberFormat) {
           this.stringFormat = stringFormat;
           this.dateTimeFormat = dateTimeFormat;
           this.numberFormat = numberFormat;
    }


    /**
     * Gets the stringFormat value for this Format.
     * 
     * @return stringFormat
     */
    public CategoryChoiceList getStringFormat() {
        return stringFormat;
    }


    /**
     * Sets the stringFormat value for this Format.
     * 
     * @param stringFormat
     */
    public void setStringFormat(CategoryChoiceList stringFormat) {
        this.stringFormat = stringFormat;
    }


    /**
     * Gets the dateTimeFormat value for this Format.
     * 
     * @return dateTimeFormat
     */
    public CategoryChoiceList getDateTimeFormat() {
        return dateTimeFormat;
    }


    /**
     * Sets the dateTimeFormat value for this Format.
     * 
     * @param dateTimeFormat
     */
    public void setDateTimeFormat(CategoryChoiceList dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
    }


    /**
     * Gets the numberFormat value for this Format.
     * 
     * @return numberFormat
     */
    public NumberCategoryChoiceList getNumberFormat() {
        return numberFormat;
    }


    /**
     * Sets the numberFormat value for this Format.
     * 
     * @param numberFormat
     */
    public void setNumberFormat(NumberCategoryChoiceList numberFormat) {
        this.numberFormat = numberFormat;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Format)) return false;
        Format other = (Format) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stringFormat==null && other.getStringFormat()==null) || 
             (this.stringFormat!=null &&
              this.stringFormat.equals(other.getStringFormat()))) &&
            ((this.dateTimeFormat==null && other.getDateTimeFormat()==null) || 
             (this.dateTimeFormat!=null &&
              this.dateTimeFormat.equals(other.getDateTimeFormat()))) &&
            ((this.numberFormat==null && other.getNumberFormat()==null) || 
             (this.numberFormat!=null &&
              this.numberFormat.equals(other.getNumberFormat())));
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
        if (getStringFormat() != null) {
            _hashCode += getStringFormat().hashCode();
        }
        if (getDateTimeFormat() != null) {
            _hashCode += getDateTimeFormat().hashCode();
        }
        if (getNumberFormat() != null) {
            _hashCode += getNumberFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Format.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Format"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "StringFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "CategoryChoiceList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "DateTimeFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "CategoryChoiceList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "NumberFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "NumberCategoryChoiceList"));
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
