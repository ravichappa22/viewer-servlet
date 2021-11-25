/**
 * Page.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class Page  implements java.io.Serializable {
    private String pageNumber;
    private String totalPage;
    private Boolean completed;
    private Boolean rtl;

    public Page() {
    }

    public Page(
           String pageNumber,
           String totalPage,
           Boolean completed,
           Boolean rtl
    		) {
           this.pageNumber = pageNumber;
           this.totalPage = totalPage;
           this.completed = completed;
           this.rtl = rtl;
    }


    /**
     * Gets the pageNumber value for this Page.
     * 
     * @return pageNumber
     */
    public String getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this Page.
     * 
     * @param pageNumber
     */
    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the totalPage value for this Page.
     * 
     * @return totalPage
     */
    public String getTotalPage() {
        return totalPage;
    }


    /**
     * Sets the totalPage value for this Page.
     * 
     * @param totalPage
     */
    public void setTotalPage(String totalPage) {
        this.totalPage = totalPage;
    }


    /**
     * Gets the completed value for this Page.
     * 
     * @return completed
     */
    public Boolean getCompleted() {
        return completed;
    }


    /**
     * Sets the completed value for this Page.
     * 
     * @param completed
     */
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    /**
     * Gets the right-to-left value for this Page.
     * 
     * @return rtl
     */
    public Boolean getRtl() {
        return rtl;
    }


    /**
     * Sets the right-to-left value for this Page.
     * 
     * @param rtl rtl
     */
    public void setRtl(Boolean rtl) {
        this.rtl = rtl;
    }
    
    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Page)) return false;
        Page other = (Page) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            ((this.totalPage==null && other.getTotalPage()==null) || 
             (this.totalPage!=null &&
              this.totalPage.equals(other.getTotalPage()))) &&
            ((this.completed==null && other.getCompleted()==null) || 
             (this.completed!=null &&
              this.completed.equals(other.getCompleted()))) &&
	          ((this.rtl==null && other.getRtl()==null) || 
                 (this.rtl!=null &&
                  this.rtl.equals(other.getRtl())));              
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
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getTotalPage() != null) {
            _hashCode += getTotalPage().hashCode();
        }
        if (getCompleted() != null) {
            _hashCode += getCompleted().hashCode();
        }
        if (getRtl() != null) {
            _hashCode += getRtl().hashCode();
        }
        
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Page.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Page"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "PageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "TotalPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Completed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Rtl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
