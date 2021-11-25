/**
 * ChartType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class ChartType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ChartType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _VBar = "VBar";
    public static final String _Pie = "Pie";
    public static final String _Area = "Area";
    public static final String _Line = "Line";
    public static final String _Scatter = "Scatter";
    public static final String _Meter = "Meter";
    public static final String _Stock = "Stock";
    public static final ChartType VBar = new ChartType(_VBar);
    public static final ChartType Pie = new ChartType(_Pie);
    public static final ChartType Area = new ChartType(_Area);
    public static final ChartType Line = new ChartType(_Line);
    public static final ChartType Scatter = new ChartType(_Scatter);
    public static final ChartType Meter = new ChartType(_Meter);
    public static final ChartType Stock = new ChartType(_Stock);
    public String getValue() { return _value_;}
    public static ChartType fromValue(String value)
          throws IllegalArgumentException {
        ChartType enumeration = (ChartType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ChartType fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChartType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ChartType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
