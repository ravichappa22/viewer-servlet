/**
 * ColumnDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class ColumnDefinition  implements java.io.Serializable {
    private Integer index;
    private String iid;
    private String header;
    private Integer dataType;
    private String expr;
    private Integer newIndex;
    private Boolean isGrouped;
    private SortingDirection sortDir;
    private AggregateDefinition[] aggregate;
    private Font font;
    private Format format;
    private ColumnProperties properties;
    private FormatRuleSet formatRuleSet;
    private BoundDataColumn boundDataColumn;

    public ColumnDefinition() {
    }

    public ColumnDefinition(
           Integer index,
           String iid,
           String header,
           Integer dataType,
           String expr,
           Integer newIndex,
           Boolean isGrouped,
           SortingDirection sortDir,
           AggregateDefinition[] aggregate,
           Font font,
           Format format,
           ColumnProperties properties,
           FormatRuleSet formatRuleSet,
           BoundDataColumn boundDataColumn) {
           this.index = index;
           this.iid = iid;
           this.header = header;
           this.dataType = dataType;
           this.expr = expr;
           this.newIndex = newIndex;
           this.isGrouped = isGrouped;
           this.sortDir = sortDir;
           this.aggregate = aggregate;
           this.font = font;
           this.format = format;
           this.properties = properties;
           this.formatRuleSet = formatRuleSet;
           this.boundDataColumn = boundDataColumn;
    }


    /**
     * Gets the index value for this ColumnDefinition.
     * 
     * @return index
     */
    public Integer getIndex() {
        return index;
    }


    /**
     * Sets the index value for this ColumnDefinition.
     * 
     * @param index
     */
    public void setIndex(Integer index) {
        this.index = index;
    }


    /**
     * Gets the iid value for this ColumnDefinition.
     * 
     * @return iid
     */
    public String getIid() {
        return iid;
    }


    /**
     * Sets the iid value for this ColumnDefinition.
     * 
     * @param iid
     */
    public void setIid(String iid) {
        this.iid = iid;
    }


    /**
     * Gets the header value for this ColumnDefinition.
     * 
     * @return header
     */
    public String getHeader() {
        return header;
    }


    /**
     * Sets the header value for this ColumnDefinition.
     * 
     * @param header
     */
    public void setHeader(String header) {
        this.header = header;
    }


    /**
     * Gets the dataType value for this ColumnDefinition.
     * 
     * @return dataType
     */
    public Integer getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this ColumnDefinition.
     * 
     * @param dataType
     */
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the expr value for this ColumnDefinition.
     * 
     * @return expr
     */
    public String getExpr() {
        return expr;
    }


    /**
     * Sets the expr value for this ColumnDefinition.
     * 
     * @param expr
     */
    public void setExpr(String expr) {
        this.expr = expr;
    }


    /**
     * Gets the newIndex value for this ColumnDefinition.
     * 
     * @return newIndex
     */
    public Integer getNewIndex() {
        return newIndex;
    }


    /**
     * Sets the newIndex value for this ColumnDefinition.
     * 
     * @param newIndex
     */
    public void setNewIndex(Integer newIndex) {
        this.newIndex = newIndex;
    }


    /**
     * Gets the isGrouped value for this ColumnDefinition.
     * 
     * @return isGrouped
     */
    public Boolean getIsGrouped() {
        return isGrouped;
    }


    /**
     * Sets the isGrouped value for this ColumnDefinition.
     * 
     * @param isGrouped
     */
    public void setIsGrouped(Boolean isGrouped) {
        this.isGrouped = isGrouped;
    }


    /**
     * Gets the sortDir value for this ColumnDefinition.
     * 
     * @return sortDir
     */
    public SortingDirection getSortDir() {
        return sortDir;
    }


    /**
     * Sets the sortDir value for this ColumnDefinition.
     * 
     * @param sortDir
     */
    public void setSortDir(SortingDirection sortDir) {
        this.sortDir = sortDir;
    }


    /**
     * Gets the aggregate value for this ColumnDefinition.
     * 
     * @return aggregate
     */
    public AggregateDefinition[] getAggregate() {
        return aggregate;
    }


    /**
     * Sets the aggregate value for this ColumnDefinition.
     * 
     * @param aggregate
     */
    public void setAggregate(AggregateDefinition[] aggregate) {
        this.aggregate = aggregate;
    }

    public AggregateDefinition getAggregate(int i) {
        return this.aggregate[i];
    }

    public void setAggregate(int i, AggregateDefinition _value) {
        this.aggregate[i] = _value;
    }


    /**
     * Gets the font value for this ColumnDefinition.
     * 
     * @return font
     */
    public Font getFont() {
        return font;
    }


    /**
     * Sets the font value for this ColumnDefinition.
     * 
     * @param font
     */
    public void setFont(Font font) {
        this.font = font;
    }


    /**
     * Gets the format value for this ColumnDefinition.
     * 
     * @return format
     */
    public Format getFormat() {
        return format;
    }


    /**
     * Sets the format value for this ColumnDefinition.
     * 
     * @param format
     */
    public void setFormat(Format format) {
        this.format = format;
    }


    /**
     * Gets the properties value for this ColumnDefinition.
     * 
     * @return properties
     */
    public ColumnProperties getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this ColumnDefinition.
     * 
     * @param properties
     */
    public void setProperties(ColumnProperties properties) {
        this.properties = properties;
    }


    /**
     * Gets the formatRuleSet value for this ColumnDefinition.
     * 
     * @return formatRuleSet
     */
    public FormatRuleSet getFormatRuleSet() {
        return formatRuleSet;
    }


    /**
     * Sets the formatRuleSet value for this ColumnDefinition.
     * 
     * @param formatRuleSet
     */
    public void setFormatRuleSet(FormatRuleSet formatRuleSet) {
        this.formatRuleSet = formatRuleSet;
    }


    /**
     * Gets the boundDataColumn value for this ColumnDefinition.
     * 
     * @return boundDataColumn
     */
    public BoundDataColumn getBoundDataColumn() {
        return boundDataColumn;
    }


    /**
     * Sets the boundDataColumn value for this ColumnDefinition.
     * 
     * @param boundDataColumn
     */
    public void setBoundDataColumn(BoundDataColumn boundDataColumn) {
        this.boundDataColumn = boundDataColumn;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ColumnDefinition)) return false;
        ColumnDefinition other = (ColumnDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex()))) &&
            ((this.iid==null && other.getIid()==null) || 
             (this.iid!=null &&
              this.iid.equals(other.getIid()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.expr==null && other.getExpr()==null) || 
             (this.expr!=null &&
              this.expr.equals(other.getExpr()))) &&
            ((this.newIndex==null && other.getNewIndex()==null) || 
             (this.newIndex!=null &&
              this.newIndex.equals(other.getNewIndex()))) &&
            ((this.isGrouped==null && other.getIsGrouped()==null) || 
             (this.isGrouped!=null &&
              this.isGrouped.equals(other.getIsGrouped()))) &&
            ((this.sortDir==null && other.getSortDir()==null) || 
             (this.sortDir!=null &&
              this.sortDir.equals(other.getSortDir()))) &&
            ((this.aggregate==null && other.getAggregate()==null) || 
             (this.aggregate!=null &&
              java.util.Arrays.equals(this.aggregate, other.getAggregate()))) &&
            ((this.font==null && other.getFont()==null) || 
             (this.font!=null &&
              this.font.equals(other.getFont()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              this.properties.equals(other.getProperties()))) &&
            ((this.formatRuleSet==null && other.getFormatRuleSet()==null) || 
             (this.formatRuleSet!=null &&
              this.formatRuleSet.equals(other.getFormatRuleSet()))) &&
            ((this.boundDataColumn==null && other.getBoundDataColumn()==null) || 
             (this.boundDataColumn!=null &&
              this.boundDataColumn.equals(other.getBoundDataColumn())));
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
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        if (getIid() != null) {
            _hashCode += getIid().hashCode();
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getExpr() != null) {
            _hashCode += getExpr().hashCode();
        }
        if (getNewIndex() != null) {
            _hashCode += getNewIndex().hashCode();
        }
        if (getIsGrouped() != null) {
            _hashCode += getIsGrouped().hashCode();
        }
        if (getSortDir() != null) {
            _hashCode += getSortDir().hashCode();
        }
        if (getAggregate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAggregate());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAggregate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFont() != null) {
            _hashCode += getFont().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getProperties() != null) {
            _hashCode += getProperties().hashCode();
        }
        if (getFormatRuleSet() != null) {
            _hashCode += getFormatRuleSet().hashCode();
        }
        if (getBoundDataColumn() != null) {
            _hashCode += getBoundDataColumn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ColumnDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ColumnDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Iid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "DataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Expr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "NewIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGrouped");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "IsGrouped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortDir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "SortDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "SortingDirection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Aggregate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "AggregateDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("font");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Font"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Font"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Format"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "ColumnProperties"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatRuleSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FormatRuleSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FormatRuleSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundDataColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "BoundDataColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "BoundDataColumn"));
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
