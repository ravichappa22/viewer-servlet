/**
 * ChartDataBinding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class ChartDataBinding  implements java.io.Serializable {
    private String tableId;
    private SectionDefinition section;
    private AxisDataBinding XAxis;
    private AxisDataBinding[] YAxis;
    private int showXLabelsVertically;

    public ChartDataBinding() {
    }

    public ChartDataBinding(
           String tableId,
           SectionDefinition section,
           AxisDataBinding XAxis,
           AxisDataBinding[] YAxis,
           int showXLabelsVertically) {
           this.tableId = tableId;
           this.section = section;
           this.XAxis = XAxis;
           this.YAxis = YAxis;
           this.showXLabelsVertically = showXLabelsVertically;
    }


    /**
     * Gets the tableId value for this ChartDataBinding.
     * 
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }


    /**
     * Sets the tableId value for this ChartDataBinding.
     * 
     * @param tableId
     */
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }


    /**
     * Gets the section value for this ChartDataBinding.
     * 
     * @return section
     */
    public SectionDefinition getSection() {
        return section;
    }


    /**
     * Sets the section value for this ChartDataBinding.
     * 
     * @param section
     */
    public void setSection(SectionDefinition section) {
        this.section = section;
    }


    /**
     * Gets the XAxis value for this ChartDataBinding.
     * 
     * @return XAxis
     */
    public AxisDataBinding getXAxis() {
        return XAxis;
    }


    /**
     * Sets the XAxis value for this ChartDataBinding.
     * 
     * @param XAxis
     */
    public void setXAxis(AxisDataBinding XAxis) {
        this.XAxis = XAxis;
    }


    /**
     * Gets the YAxis value for this ChartDataBinding.
     * 
     * @return YAxis
     */
    public AxisDataBinding[] getYAxis() {
        return YAxis;
    }


    /**
     * Sets the YAxis value for this ChartDataBinding.
     * 
     * @param YAxis
     */
    public void setYAxis(AxisDataBinding[] YAxis) {
        this.YAxis = YAxis;
    }

    public AxisDataBinding getYAxis(int i) {
        return this.YAxis[i];
    }

    public void setYAxis(int i, AxisDataBinding _value) {
        this.YAxis[i] = _value;
    }


    /**
     * Gets the showXLabelsVertically value for this ChartDataBinding.
     * 
     * @return showXLabelsVertically
     */
    public int getShowXLabelsVertically() {
        return showXLabelsVertically;
    }


    /**
     * Sets the showXLabelsVertically value for this ChartDataBinding.
     * 
     * @param showXLabelsVertically
     */
    public void setShowXLabelsVertically(int showXLabelsVertically) {
        this.showXLabelsVertically = showXLabelsVertically;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChartDataBinding)) return false;
        ChartDataBinding other = (ChartDataBinding) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tableId==null && other.getTableId()==null) || 
             (this.tableId!=null &&
              this.tableId.equals(other.getTableId()))) &&
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              this.section.equals(other.getSection()))) &&
            ((this.XAxis==null && other.getXAxis()==null) || 
             (this.XAxis!=null &&
              this.XAxis.equals(other.getXAxis()))) &&
            ((this.YAxis==null && other.getYAxis()==null) || 
             (this.YAxis!=null &&
              java.util.Arrays.equals(this.YAxis, other.getYAxis()))) &&
            this.showXLabelsVertically == other.getShowXLabelsVertically();
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
        if (getTableId() != null) {
            _hashCode += getTableId().hashCode();
        }
        if (getSection() != null) {
            _hashCode += getSection().hashCode();
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
        _hashCode += getShowXLabelsVertically();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChartDataBinding.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ChartDataBinding"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "TableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("section");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Section"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "SectionDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XAxis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "X-axis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "AxisDataBinding"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YAxis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Y-axis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "AxisDataBinding"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showXLabelsVertically");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ShowXLabelsVertically"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
