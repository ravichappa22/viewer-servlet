/**
 * Update.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class Update  implements java.io.Serializable {
    private UpdateContent updateContent;
    private UpdateDialog updateDialog;
    private UpdateData updateData;

    public Update() {
    }

    public Update(
           UpdateContent updateContent,
           UpdateDialog updateDialog,
           UpdateData updateData) {
           this.updateContent = updateContent;
           this.updateDialog = updateDialog;
           this.updateData = updateData;
    }


    /**
     * Gets the updateContent value for this Update.
     * 
     * @return updateContent
     */
    public UpdateContent getUpdateContent() {
        return updateContent;
    }


    /**
     * Sets the updateContent value for this Update.
     * 
     * @param updateContent
     */
    public void setUpdateContent(UpdateContent updateContent) {
        this.updateContent = updateContent;
    }


    /**
     * Gets the updateDialog value for this Update.
     * 
     * @return updateDialog
     */
    public UpdateDialog getUpdateDialog() {
        return updateDialog;
    }


    /**
     * Sets the updateDialog value for this Update.
     * 
     * @param updateDialog
     */
    public void setUpdateDialog(UpdateDialog updateDialog) {
        this.updateDialog = updateDialog;
    }


    /**
     * Gets the updateData value for this Update.
     * 
     * @return updateData
     */
    public UpdateData getUpdateData() {
        return updateData;
    }


    /**
     * Sets the updateData value for this Update.
     * 
     * @param updateData
     */
    public void setUpdateData(UpdateData updateData) {
        this.updateData = updateData;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Update)) return false;
        Update other = (Update) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateContent==null && other.getUpdateContent()==null) || 
             (this.updateContent!=null &&
              this.updateContent.equals(other.getUpdateContent()))) &&
            ((this.updateDialog==null && other.getUpdateDialog()==null) || 
             (this.updateDialog!=null &&
              this.updateDialog.equals(other.getUpdateDialog()))) &&
            ((this.updateData==null && other.getUpdateData()==null) || 
             (this.updateData!=null &&
              this.updateData.equals(other.getUpdateData())));
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
        if (getUpdateContent() != null) {
            _hashCode += getUpdateContent().hashCode();
        }
        if (getUpdateDialog() != null) {
            _hashCode += getUpdateDialog().hashCode();
        }
        if (getUpdateData() != null) {
            _hashCode += getUpdateData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Update.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Update"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "UpdateContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "UpdateContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDialog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "UpdateDialog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "UpdateDialog"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "UpdateData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "UpdateData"));
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
