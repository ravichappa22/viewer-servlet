/**
 * FilterExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;


/**
 * A complex type to represent the condition expression used in filter.
 */
public class FilterExpression  implements java.io.Serializable {
    /** Represents Equality operator, i.e., '=='. */
    private FilterClause clause;
    private FilterExpression[] not;
    private FilterExpression[] or;
    /** Optional AND clause which can again be nested with AND/OR clauses */
    private FilterExpression[] and;

    public FilterExpression() {
    }

    public FilterExpression(
           FilterClause clause,
           FilterExpression[] not,
           FilterExpression[] or,
           FilterExpression[] and) {
           this.clause = clause;
           this.not = not;
           this.or = or;
           this.and = and;
    }


    /**
     * Gets the clause value for this FilterExpression.
     * 
     * @return clause Represents Equality operator, i.e., '=='.
     */
    public FilterClause getClause() {
        return clause;
    }


    /**
     * Sets the clause value for this FilterExpression.
     * 
     * @param clause Represents Equality operator, i.e., '=='.
     */
    public void setClause(FilterClause clause) {
        this.clause = clause;
    }


    /**
     * Gets the not value for this FilterExpression.
     * 
     * @return not
     */
    public FilterExpression[] getNot() {
        return not;
    }


    /**
     * Sets the not value for this FilterExpression.
     * 
     * @param not
     */
    public void setNot(FilterExpression[] not) {
        this.not = not;
    }

    public FilterExpression getNot(int i) {
        return this.not[i];
    }

    public void setNot(int i, FilterExpression _value) {
        this.not[i] = _value;
    }


    /**
     * Gets the or value for this FilterExpression.
     * 
     * @return or
     */
    public FilterExpression[] getOr() {
        return or;
    }


    /**
     * Sets the or value for this FilterExpression.
     * 
     * @param or
     */
    public void setOr(FilterExpression[] or) {
        this.or = or;
    }

    public FilterExpression getOr(int i) {
        return this.or[i];
    }

    public void setOr(int i, FilterExpression _value) {
        this.or[i] = _value;
    }


    /**
     * Gets the and value for this FilterExpression.
     * 
     * @return and Optional AND clause which can again be nested with AND/OR clauses
     */
    public FilterExpression[] getAnd() {
        return and;
    }


    /**
     * Sets the and value for this FilterExpression.
     * 
     * @param and Optional AND clause which can again be nested with AND/OR clauses
     */
    public void setAnd(FilterExpression[] and) {
        this.and = and;
    }

    public FilterExpression getAnd(int i) {
        return this.and[i];
    }

    public void setAnd(int i, FilterExpression _value) {
        this.and[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FilterExpression)) return false;
        FilterExpression other = (FilterExpression) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clause==null && other.getClause()==null) || 
             (this.clause!=null &&
              this.clause.equals(other.getClause()))) &&
            ((this.not==null && other.getNot()==null) || 
             (this.not!=null &&
              java.util.Arrays.equals(this.not, other.getNot()))) &&
            ((this.or==null && other.getOr()==null) || 
             (this.or!=null &&
              java.util.Arrays.equals(this.or, other.getOr()))) &&
            ((this.and==null && other.getAnd()==null) || 
             (this.and!=null &&
              java.util.Arrays.equals(this.and, other.getAnd())));
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
        if (getClause() != null) {
            _hashCode += getClause().hashCode();
        }
        if (getNot() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNot());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNot(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOr());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnd());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAnd(), i);
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
        new org.apache.axis.description.TypeDesc(FilterExpression.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FilterExpression"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clause");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Clause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FilterClause"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("not");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Not"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FilterExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("or");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Or"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FilterExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("and");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "And"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FilterExpression"));
        elemField.setMinOccurs(0);
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
