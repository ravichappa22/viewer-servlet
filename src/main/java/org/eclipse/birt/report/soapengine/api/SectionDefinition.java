/**
 * SectionDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class SectionDefinition  implements java.io.Serializable {
    private String id;
    private String tableId;
    private Integer level;
    private SortingDirection sortDir;

    public SectionDefinition() {
    }

    public SectionDefinition(
           String id,
           String tableId,
           Integer level,
           SortingDirection sortDir) {
           this.id = id;
           this.tableId = tableId;
           this.level = level;
           this.sortDir = sortDir;
    }


    /**
     * Gets the id value for this SectionDefinition.
     * 
     * @return id
     */
    public String getId() {
        return id;
    }


    /**
     * Sets the id value for this SectionDefinition.
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Gets the tableId value for this SectionDefinition.
     * 
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }


    /**
     * Sets the tableId value for this SectionDefinition.
     * 
     * @param tableId
     */
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }


    /**
     * Gets the level value for this SectionDefinition.
     * 
     * @return level
     */
    public Integer getLevel() {
        return level;
    }


    /**
     * Sets the level value for this SectionDefinition.
     * 
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }


    /**
     * Gets the sortDir value for this SectionDefinition.
     * 
     * @return sortDir
     */
    public SortingDirection getSortDir() {
        return sortDir;
    }


    /**
     * Sets the sortDir value for this SectionDefinition.
     * 
     * @param sortDir
     */
    public void setSortDir(SortingDirection sortDir) {
        this.sortDir = sortDir;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SectionDefinition)) return false;
        SectionDefinition other = (SectionDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.tableId==null && other.getTableId()==null) || 
             (this.tableId!=null &&
              this.tableId.equals(other.getTableId()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.sortDir==null && other.getSortDir()==null) || 
             (this.sortDir!=null &&
              this.sortDir.equals(other.getSortDir())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTableId() != null) {
            _hashCode += getTableId().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getSortDir() != null) {
            _hashCode += getSortDir().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SectionDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "SectionDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "TableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
