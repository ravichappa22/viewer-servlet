/**
 * ReportIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class ReportIdType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReportIdType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Chart = "Chart";
    public static final String _Document = "Document";
    public static final String _Label = "Label";
    public static final String _Table = "Table";
    public static final String _Group = "Group";
    public static final String _ColumnInfo = "ColumnInfo";
    public static final String _Chart_T = "Chart_T";
    public static final String _Label_T = "Label_T";
    public static final String _Table_T = "Table_T";
    public static final String _Dataset = "Dataset";
    public static final String _Extended = "Extended";
    public static final ReportIdType Chart = new ReportIdType(_Chart);
    public static final ReportIdType Document = new ReportIdType(_Document);
    public static final ReportIdType Label = new ReportIdType(_Label);
    public static final ReportIdType Table = new ReportIdType(_Table);
    public static final ReportIdType Group = new ReportIdType(_Group);
    public static final ReportIdType ColumnInfo = new ReportIdType(_ColumnInfo);
    public static final ReportIdType Chart_T = new ReportIdType(_Chart_T);
    public static final ReportIdType Label_T = new ReportIdType(_Label_T);
    public static final ReportIdType Table_T = new ReportIdType(_Table_T);
    public static final ReportIdType Dataset = new ReportIdType(_Dataset);
    public static final ReportIdType Extended = new ReportIdType(_Extended);
    public String getValue() { return _value_;}
    public static ReportIdType fromValue(String value)
          throws IllegalArgumentException {
        ReportIdType enumeration = (ReportIdType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ReportIdType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ReportIdType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", ">ReportId>Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
