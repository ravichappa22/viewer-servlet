/**
 * FileBrowsing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class FileBrowsing  implements java.io.Serializable {
    private String path;
    private String fileName;
    private FileSearch search;
    private String pathSeparator;
    private RepositoryPathSegmentList currentWorkingFolder;
    private FileList fileList;

    public FileBrowsing() {
    }

    public FileBrowsing(
           String path,
           String fileName,
           FileSearch search,
           String pathSeparator,
           RepositoryPathSegmentList currentWorkingFolder,
           FileList fileList) {
           this.path = path;
           this.fileName = fileName;
           this.search = search;
           this.pathSeparator = pathSeparator;
           this.currentWorkingFolder = currentWorkingFolder;
           this.fileList = fileList;
    }


    /**
     * Gets the path value for this FileBrowsing.
     * 
     * @return path
     */
    public String getPath() {
        return path;
    }


    /**
     * Sets the path value for this FileBrowsing.
     * 
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }


    /**
     * Gets the fileName value for this FileBrowsing.
     * 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this FileBrowsing.
     * 
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the search value for this FileBrowsing.
     * 
     * @return search
     */
    public FileSearch getSearch() {
        return search;
    }


    /**
     * Sets the search value for this FileBrowsing.
     * 
     * @param search
     */
    public void setSearch(FileSearch search) {
        this.search = search;
    }


    /**
     * Gets the pathSeparator value for this FileBrowsing.
     * 
     * @return pathSeparator
     */
    public String getPathSeparator() {
        return pathSeparator;
    }


    /**
     * Sets the pathSeparator value for this FileBrowsing.
     * 
     * @param pathSeparator
     */
    public void setPathSeparator(String pathSeparator) {
        this.pathSeparator = pathSeparator;
    }


    /**
     * Gets the currentWorkingFolder value for this FileBrowsing.
     * 
     * @return currentWorkingFolder
     */
    public RepositoryPathSegmentList getCurrentWorkingFolder() {
        return currentWorkingFolder;
    }


    /**
     * Sets the currentWorkingFolder value for this FileBrowsing.
     * 
     * @param currentWorkingFolder
     */
    public void setCurrentWorkingFolder(RepositoryPathSegmentList currentWorkingFolder) {
        this.currentWorkingFolder = currentWorkingFolder;
    }


    /**
     * Gets the fileList value for this FileBrowsing.
     * 
     * @return fileList
     */
    public FileList getFileList() {
        return fileList;
    }


    /**
     * Sets the fileList value for this FileBrowsing.
     * 
     * @param fileList
     */
    public void setFileList(FileList fileList) {
        this.fileList = fileList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FileBrowsing)) return false;
        FileBrowsing other = (FileBrowsing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.search==null && other.getSearch()==null) || 
             (this.search!=null &&
              this.search.equals(other.getSearch()))) &&
            ((this.pathSeparator==null && other.getPathSeparator()==null) || 
             (this.pathSeparator!=null &&
              this.pathSeparator.equals(other.getPathSeparator()))) &&
            ((this.currentWorkingFolder==null && other.getCurrentWorkingFolder()==null) || 
             (this.currentWorkingFolder!=null &&
              this.currentWorkingFolder.equals(other.getCurrentWorkingFolder()))) &&
            ((this.fileList==null && other.getFileList()==null) || 
             (this.fileList!=null &&
              this.fileList.equals(other.getFileList())));
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
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getSearch() != null) {
            _hashCode += getSearch().hashCode();
        }
        if (getPathSeparator() != null) {
            _hashCode += getPathSeparator().hashCode();
        }
        if (getCurrentWorkingFolder() != null) {
            _hashCode += getCurrentWorkingFolder().hashCode();
        }
        if (getFileList() != null) {
            _hashCode += getFileList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileBrowsing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FileBrowsing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("search");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Search"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FileSearch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathSeparator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "PathSeparator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentWorkingFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "CurrentWorkingFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "RepositoryPathSegmentList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FileList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "FileList"));
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
