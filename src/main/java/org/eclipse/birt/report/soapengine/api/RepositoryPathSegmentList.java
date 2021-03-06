/**
 * RepositoryPathSegmentList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class RepositoryPathSegmentList  implements java.io.Serializable {
    private RepositoryPathSegment[] segment;

    public RepositoryPathSegmentList() {
    }

    public RepositoryPathSegmentList(
           RepositoryPathSegment[] segment) {
           this.segment = segment;
    }


    /**
     * Gets the segment value for this RepositoryPathSegmentList.
     * 
     * @return segment
     */
    public RepositoryPathSegment[] getSegment() {
        return segment;
    }


    /**
     * Sets the segment value for this RepositoryPathSegmentList.
     * 
     * @param segment
     */
    public void setSegment(RepositoryPathSegment[] segment) {
        this.segment = segment;
    }

    public RepositoryPathSegment getSegment(int i) {
        return this.segment[i];
    }

    public void setSegment(int i, RepositoryPathSegment _value) {
        this.segment[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RepositoryPathSegmentList)) return false;
        RepositoryPathSegmentList other = (RepositoryPathSegmentList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.segment==null && other.getSegment()==null) || 
             (this.segment!=null &&
              java.util.Arrays.equals(this.segment, other.getSegment())));
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
        if (getSegment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegment());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSegment(), i);
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
        new org.apache.axis.description.TypeDesc(RepositoryPathSegmentList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "RepositoryPathSegmentList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "RepositoryPathSegment"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
