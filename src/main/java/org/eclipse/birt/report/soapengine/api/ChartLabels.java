/**
 * ChartLabels.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class ChartLabels  implements java.io.Serializable {
    private String title;
    private String XAxis;
    private String[] YAxis;

    public ChartLabels() {
    }

    public ChartLabels(
           String title,
           String XAxis,
           String[] YAxis) {
           this.title = title;
           this.XAxis = XAxis;
           this.YAxis = YAxis;
    }


    /**
     * Gets the title value for this ChartLabels.
     * 
     * @return title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ChartLabels.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets the XAxis value for this ChartLabels.
     * 
     * @return XAxis
     */
    public String getXAxis() {
        return XAxis;
    }


    /**
     * Sets the XAxis value for this ChartLabels.
     * 
     * @param XAxis
     */
    public void setXAxis(String XAxis) {
        this.XAxis = XAxis;
    }


    /**
     * Gets the YAxis value for this ChartLabels.
     * 
     * @return YAxis
     */
    public String[] getYAxis() {
        return YAxis;
    }


    /**
     * Sets the YAxis value for this ChartLabels.
     * 
     * @param YAxis
     */
    public void setYAxis(String[] YAxis) {
        this.YAxis = YAxis;
    }

    public String getYAxis(int i) {
        return this.YAxis[i];
    }

    public void setYAxis(int i, String _value) {
        this.YAxis[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChartLabels)) return false;
        ChartLabels other = (ChartLabels) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.XAxis==null && other.getXAxis()==null) || 
             (this.XAxis!=null &&
              this.XAxis.equals(other.getXAxis()))) &&
            ((this.YAxis==null && other.getYAxis()==null) || 
             (this.YAxis!=null &&
              java.util.Arrays.equals(this.YAxis, other.getYAxis())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getXAxis() != null) {
            _hashCode += getXAxis().hashCode();
        }
        if (getYAxis() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getYAxis());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getYAxis(), i);
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
        new org.apache.axis.description.TypeDesc(ChartLabels.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ChartLabels"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XAxis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "X-axis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YAxis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Y-axis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
