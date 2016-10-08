//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.08 at 09:19:23 PM BST 
//


package org.linguafranca.pwdb.kdbx.jaxb.binding;

import java.util.Date;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Meta"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Generator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="HeaderHash" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *                   &lt;element name="DatabaseName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DatabaseNameChanged" type="{}keepassDateTime"/&gt;
 *                   &lt;element name="DatabaseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DatabaseDescriptionChanged" type="{}keepassDateTime"/&gt;
 *                   &lt;element name="DefaultUserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DefaultUserNameChanged" type="{}keepassDateTime"/&gt;
 *                   &lt;element name="MaintenanceHistoryDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Color" type="{}color"/&gt;
 *                   &lt;element name="MasterKeyChanged" type="{}keepassDateTime"/&gt;
 *                   &lt;element name="MasterKeyChangeRec" type="{}changeDays"/&gt;
 *                   &lt;element name="MasterKeyChangeForce" type="{}changeDays"/&gt;
 *                   &lt;element name="MemoryProtection"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ProtectTitle" type="{}keepassBoolean"/&gt;
 *                             &lt;element name="ProtectUserName" type="{}keepassBoolean"/&gt;
 *                             &lt;element name="ProtectPassword" type="{}keepassBoolean"/&gt;
 *                             &lt;element name="ProtectURL" type="{}keepassBoolean"/&gt;
 *                             &lt;element name="ProtectNotes" type="{}keepassBoolean"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CustomIcons" type="{}customIcons"/&gt;
 *                   &lt;element name="RecycleBinEnabled" type="{}keepassBoolean"/&gt;
 *                   &lt;element name="RecycleBinUUID" type="{}uuidRef"/&gt;
 *                   &lt;element name="RecycleBinChanged" type="{}keepassDateTime"/&gt;
 *                   &lt;element name="EntryTemplatesGroup" type="{}uuidRef"/&gt;
 *                   &lt;element name="EntryTemplatesGroupChanged" type="{}keepassDateTime"/&gt;
 *                   &lt;element name="LastSelectedGroup" type="{}uuidRef"/&gt;
 *                   &lt;element name="LastTopVisibleGroup" type="{}uuidRef"/&gt;
 *                   &lt;element name="HistoryMaxItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="HistoryMaxSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Binaries" type="{}binaries"/&gt;
 *                   &lt;element name="CustomData" type="{}customData"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Root"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}Group"/&gt;
 *                   &lt;element name="DeletedObjects" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "meta",
    "root"
})
@XmlRootElement(name = "KeePassFile")
public class KeePassFile {

    @XmlElement(name = "Meta", required = true)
    protected KeePassFile.Meta meta;
    @XmlElement(name = "Root", required = true)
    protected KeePassFile.Root root;

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link KeePassFile.Meta }
     *     
     */
    public KeePassFile.Meta getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeePassFile.Meta }
     *     
     */
    public void setMeta(KeePassFile.Meta value) {
        this.meta = value;
    }

    /**
     * Gets the value of the root property.
     * 
     * @return
     *     possible object is
     *     {@link KeePassFile.Root }
     *     
     */
    public KeePassFile.Root getRoot() {
        return root;
    }

    /**
     * Sets the value of the root property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeePassFile.Root }
     *     
     */
    public void setRoot(KeePassFile.Root value) {
        this.root = value;
    }


    /**
     * This contains database settings and also contains information
     *                                 about the last state of the program that used the database. Presumably assuming
     *                                 that the same program will be used to open it again, or that a different program
     *                                 would want/need the same settings.
     *                             
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Generator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="HeaderHash" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
     *         &lt;element name="DatabaseName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DatabaseNameChanged" type="{}keepassDateTime"/&gt;
     *         &lt;element name="DatabaseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DatabaseDescriptionChanged" type="{}keepassDateTime"/&gt;
     *         &lt;element name="DefaultUserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DefaultUserNameChanged" type="{}keepassDateTime"/&gt;
     *         &lt;element name="MaintenanceHistoryDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="Color" type="{}color"/&gt;
     *         &lt;element name="MasterKeyChanged" type="{}keepassDateTime"/&gt;
     *         &lt;element name="MasterKeyChangeRec" type="{}changeDays"/&gt;
     *         &lt;element name="MasterKeyChangeForce" type="{}changeDays"/&gt;
     *         &lt;element name="MemoryProtection"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ProtectTitle" type="{}keepassBoolean"/&gt;
     *                   &lt;element name="ProtectUserName" type="{}keepassBoolean"/&gt;
     *                   &lt;element name="ProtectPassword" type="{}keepassBoolean"/&gt;
     *                   &lt;element name="ProtectURL" type="{}keepassBoolean"/&gt;
     *                   &lt;element name="ProtectNotes" type="{}keepassBoolean"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CustomIcons" type="{}customIcons"/&gt;
     *         &lt;element name="RecycleBinEnabled" type="{}keepassBoolean"/&gt;
     *         &lt;element name="RecycleBinUUID" type="{}uuidRef"/&gt;
     *         &lt;element name="RecycleBinChanged" type="{}keepassDateTime"/&gt;
     *         &lt;element name="EntryTemplatesGroup" type="{}uuidRef"/&gt;
     *         &lt;element name="EntryTemplatesGroupChanged" type="{}keepassDateTime"/&gt;
     *         &lt;element name="LastSelectedGroup" type="{}uuidRef"/&gt;
     *         &lt;element name="LastTopVisibleGroup" type="{}uuidRef"/&gt;
     *         &lt;element name="HistoryMaxItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="HistoryMaxSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="Binaries" type="{}binaries"/&gt;
     *         &lt;element name="CustomData" type="{}customData"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "generator",
        "headerHash",
        "databaseName",
        "databaseNameChanged",
        "databaseDescription",
        "databaseDescriptionChanged",
        "defaultUserName",
        "defaultUserNameChanged",
        "maintenanceHistoryDays",
        "color",
        "masterKeyChanged",
        "masterKeyChangeRec",
        "masterKeyChangeForce",
        "memoryProtection",
        "customIcons",
        "recycleBinEnabled",
        "recycleBinUUID",
        "recycleBinChanged",
        "entryTemplatesGroup",
        "entryTemplatesGroupChanged",
        "lastSelectedGroup",
        "lastTopVisibleGroup",
        "historyMaxItems",
        "historyMaxSize",
        "binaries",
        "customData"
    })
    public static class Meta {

        @XmlElement(name = "Generator", required = true)
        protected String generator;
        @XmlElement(name = "HeaderHash")
        protected byte[] headerHash;
        @XmlElement(name = "DatabaseName", required = true)
        protected String databaseName;
        @XmlElement(name = "DatabaseNameChanged", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        protected Date databaseNameChanged;
        @XmlElement(name = "DatabaseDescription", required = true)
        protected String databaseDescription;
        @XmlElement(name = "DatabaseDescriptionChanged", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        protected Date databaseDescriptionChanged;
        @XmlElement(name = "DefaultUserName", required = true)
        protected String defaultUserName;
        @XmlElement(name = "DefaultUserNameChanged", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        protected Date defaultUserNameChanged;
        @XmlElement(name = "MaintenanceHistoryDays")
        protected int maintenanceHistoryDays;
        @XmlElement(name = "Color", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String color;
        @XmlElement(name = "MasterKeyChanged", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        protected Date masterKeyChanged;
        @XmlElement(name = "MasterKeyChangeRec")
        protected int masterKeyChangeRec;
        @XmlElement(name = "MasterKeyChangeForce")
        protected int masterKeyChangeForce;
        @XmlElement(name = "MemoryProtection", required = true)
        protected KeePassFile.Meta.MemoryProtection memoryProtection;
        @XmlElement(name = "CustomIcons", required = true)
        protected CustomIcons customIcons;
        @XmlElement(name = "RecycleBinEnabled", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter3 .class)
        protected Boolean recycleBinEnabled;
        @XmlElement(name = "RecycleBinUUID", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "base64Binary")
        protected UUID recycleBinUUID;
        @XmlElement(name = "RecycleBinChanged", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        protected Date recycleBinChanged;
        @XmlElement(name = "EntryTemplatesGroup", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "base64Binary")
        protected UUID entryTemplatesGroup;
        @XmlElement(name = "EntryTemplatesGroupChanged", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        protected Date entryTemplatesGroupChanged;
        @XmlElement(name = "LastSelectedGroup", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "base64Binary")
        protected UUID lastSelectedGroup;
        @XmlElement(name = "LastTopVisibleGroup", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "base64Binary")
        protected UUID lastTopVisibleGroup;
        @XmlElement(name = "HistoryMaxItems")
        protected int historyMaxItems;
        @XmlElement(name = "HistoryMaxSize")
        protected int historyMaxSize;
        @XmlElement(name = "Binaries", required = true)
        protected Binaries binaries;
        @XmlElement(name = "CustomData", required = true)
        protected CustomData customData;

        /**
         * Gets the value of the generator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenerator() {
            return generator;
        }

        /**
         * Sets the value of the generator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenerator(String value) {
            this.generator = value;
        }

        /**
         * Gets the value of the headerHash property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getHeaderHash() {
            return headerHash;
        }

        /**
         * Sets the value of the headerHash property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setHeaderHash(byte[] value) {
            this.headerHash = value;
        }

        /**
         * Gets the value of the databaseName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatabaseName() {
            return databaseName;
        }

        /**
         * Sets the value of the databaseName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatabaseName(String value) {
            this.databaseName = value;
        }

        /**
         * Gets the value of the databaseNameChanged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Date getDatabaseNameChanged() {
            return databaseNameChanged;
        }

        /**
         * Sets the value of the databaseNameChanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatabaseNameChanged(Date value) {
            this.databaseNameChanged = value;
        }

        /**
         * Gets the value of the databaseDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatabaseDescription() {
            return databaseDescription;
        }

        /**
         * Sets the value of the databaseDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatabaseDescription(String value) {
            this.databaseDescription = value;
        }

        /**
         * Gets the value of the databaseDescriptionChanged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Date getDatabaseDescriptionChanged() {
            return databaseDescriptionChanged;
        }

        /**
         * Sets the value of the databaseDescriptionChanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatabaseDescriptionChanged(Date value) {
            this.databaseDescriptionChanged = value;
        }

        /**
         * Gets the value of the defaultUserName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultUserName() {
            return defaultUserName;
        }

        /**
         * Sets the value of the defaultUserName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultUserName(String value) {
            this.defaultUserName = value;
        }

        /**
         * Gets the value of the defaultUserNameChanged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Date getDefaultUserNameChanged() {
            return defaultUserNameChanged;
        }

        /**
         * Sets the value of the defaultUserNameChanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultUserNameChanged(Date value) {
            this.defaultUserNameChanged = value;
        }

        /**
         * Gets the value of the maintenanceHistoryDays property.
         * 
         */
        public int getMaintenanceHistoryDays() {
            return maintenanceHistoryDays;
        }

        /**
         * Sets the value of the maintenanceHistoryDays property.
         * 
         */
        public void setMaintenanceHistoryDays(int value) {
            this.maintenanceHistoryDays = value;
        }

        /**
         * Gets the value of the color property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColor() {
            return color;
        }

        /**
         * Sets the value of the color property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColor(String value) {
            this.color = value;
        }

        /**
         * Gets the value of the masterKeyChanged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Date getMasterKeyChanged() {
            return masterKeyChanged;
        }

        /**
         * Sets the value of the masterKeyChanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMasterKeyChanged(Date value) {
            this.masterKeyChanged = value;
        }

        /**
         * Gets the value of the masterKeyChangeRec property.
         * 
         */
        public int getMasterKeyChangeRec() {
            return masterKeyChangeRec;
        }

        /**
         * Sets the value of the masterKeyChangeRec property.
         * 
         */
        public void setMasterKeyChangeRec(int value) {
            this.masterKeyChangeRec = value;
        }

        /**
         * Gets the value of the masterKeyChangeForce property.
         * 
         */
        public int getMasterKeyChangeForce() {
            return masterKeyChangeForce;
        }

        /**
         * Sets the value of the masterKeyChangeForce property.
         * 
         */
        public void setMasterKeyChangeForce(int value) {
            this.masterKeyChangeForce = value;
        }

        /**
         * Gets the value of the memoryProtection property.
         * 
         * @return
         *     possible object is
         *     {@link KeePassFile.Meta.MemoryProtection }
         *     
         */
        public KeePassFile.Meta.MemoryProtection getMemoryProtection() {
            return memoryProtection;
        }

        /**
         * Sets the value of the memoryProtection property.
         * 
         * @param value
         *     allowed object is
         *     {@link KeePassFile.Meta.MemoryProtection }
         *     
         */
        public void setMemoryProtection(KeePassFile.Meta.MemoryProtection value) {
            this.memoryProtection = value;
        }

        /**
         * Gets the value of the customIcons property.
         * 
         * @return
         *     possible object is
         *     {@link CustomIcons }
         *     
         */
        public CustomIcons getCustomIcons() {
            return customIcons;
        }

        /**
         * Sets the value of the customIcons property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomIcons }
         *     
         */
        public void setCustomIcons(CustomIcons value) {
            this.customIcons = value;
        }

        /**
         * Gets the value of the recycleBinEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Boolean getRecycleBinEnabled() {
            return recycleBinEnabled;
        }

        /**
         * Sets the value of the recycleBinEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecycleBinEnabled(Boolean value) {
            this.recycleBinEnabled = value;
        }

        /**
         * Gets the value of the recycleBinUUID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public UUID getRecycleBinUUID() {
            return recycleBinUUID;
        }

        /**
         * Sets the value of the recycleBinUUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecycleBinUUID(UUID value) {
            this.recycleBinUUID = value;
        }

        /**
         * Gets the value of the recycleBinChanged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Date getRecycleBinChanged() {
            return recycleBinChanged;
        }

        /**
         * Sets the value of the recycleBinChanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecycleBinChanged(Date value) {
            this.recycleBinChanged = value;
        }

        /**
         * Gets the value of the entryTemplatesGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public UUID getEntryTemplatesGroup() {
            return entryTemplatesGroup;
        }

        /**
         * Sets the value of the entryTemplatesGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryTemplatesGroup(UUID value) {
            this.entryTemplatesGroup = value;
        }

        /**
         * Gets the value of the entryTemplatesGroupChanged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Date getEntryTemplatesGroupChanged() {
            return entryTemplatesGroupChanged;
        }

        /**
         * Sets the value of the entryTemplatesGroupChanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryTemplatesGroupChanged(Date value) {
            this.entryTemplatesGroupChanged = value;
        }

        /**
         * Gets the value of the lastSelectedGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public UUID getLastSelectedGroup() {
            return lastSelectedGroup;
        }

        /**
         * Sets the value of the lastSelectedGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastSelectedGroup(UUID value) {
            this.lastSelectedGroup = value;
        }

        /**
         * Gets the value of the lastTopVisibleGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public UUID getLastTopVisibleGroup() {
            return lastTopVisibleGroup;
        }

        /**
         * Sets the value of the lastTopVisibleGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastTopVisibleGroup(UUID value) {
            this.lastTopVisibleGroup = value;
        }

        /**
         * Gets the value of the historyMaxItems property.
         * 
         */
        public int getHistoryMaxItems() {
            return historyMaxItems;
        }

        /**
         * Sets the value of the historyMaxItems property.
         * 
         */
        public void setHistoryMaxItems(int value) {
            this.historyMaxItems = value;
        }

        /**
         * Gets the value of the historyMaxSize property.
         * 
         */
        public int getHistoryMaxSize() {
            return historyMaxSize;
        }

        /**
         * Sets the value of the historyMaxSize property.
         * 
         */
        public void setHistoryMaxSize(int value) {
            this.historyMaxSize = value;
        }

        /**
         * Gets the value of the binaries property.
         * 
         * @return
         *     possible object is
         *     {@link Binaries }
         *     
         */
        public Binaries getBinaries() {
            return binaries;
        }

        /**
         * Sets the value of the binaries property.
         * 
         * @param value
         *     allowed object is
         *     {@link Binaries }
         *     
         */
        public void setBinaries(Binaries value) {
            this.binaries = value;
        }

        /**
         * Gets the value of the customData property.
         * 
         * @return
         *     possible object is
         *     {@link CustomData }
         *     
         */
        public CustomData getCustomData() {
            return customData;
        }

        /**
         * Sets the value of the customData property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomData }
         *     
         */
        public void setCustomData(CustomData value) {
            this.customData = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ProtectTitle" type="{}keepassBoolean"/&gt;
         *         &lt;element name="ProtectUserName" type="{}keepassBoolean"/&gt;
         *         &lt;element name="ProtectPassword" type="{}keepassBoolean"/&gt;
         *         &lt;element name="ProtectURL" type="{}keepassBoolean"/&gt;
         *         &lt;element name="ProtectNotes" type="{}keepassBoolean"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "protectTitle",
            "protectUserName",
            "protectPassword",
            "protectURL",
            "protectNotes"
        })
        public static class MemoryProtection {

            @XmlElement(name = "ProtectTitle", required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter3 .class)
            protected Boolean protectTitle;
            @XmlElement(name = "ProtectUserName", required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter3 .class)
            protected Boolean protectUserName;
            @XmlElement(name = "ProtectPassword", required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter3 .class)
            protected Boolean protectPassword;
            @XmlElement(name = "ProtectURL", required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter3 .class)
            protected Boolean protectURL;
            @XmlElement(name = "ProtectNotes", required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter3 .class)
            protected Boolean protectNotes;

            /**
             * Gets the value of the protectTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Boolean getProtectTitle() {
                return protectTitle;
            }

            /**
             * Sets the value of the protectTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProtectTitle(Boolean value) {
                this.protectTitle = value;
            }

            /**
             * Gets the value of the protectUserName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Boolean getProtectUserName() {
                return protectUserName;
            }

            /**
             * Sets the value of the protectUserName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProtectUserName(Boolean value) {
                this.protectUserName = value;
            }

            /**
             * Gets the value of the protectPassword property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Boolean getProtectPassword() {
                return protectPassword;
            }

            /**
             * Sets the value of the protectPassword property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProtectPassword(Boolean value) {
                this.protectPassword = value;
            }

            /**
             * Gets the value of the protectURL property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Boolean getProtectURL() {
                return protectURL;
            }

            /**
             * Sets the value of the protectURL property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProtectURL(Boolean value) {
                this.protectURL = value;
            }

            /**
             * Gets the value of the protectNotes property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Boolean getProtectNotes() {
                return protectNotes;
            }

            /**
             * Sets the value of the protectNotes property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProtectNotes(Boolean value) {
                this.protectNotes = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{}Group"/&gt;
     *         &lt;element name="DeletedObjects" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "group",
        "deletedObjects"
    })
    public static class Root {

        @XmlElement(name = "Group", required = true)
        protected Group group;
        @XmlElement(name = "DeletedObjects", required = true)
        protected Object deletedObjects;

        /**
         * This is the root group which contains everything.
         *                                     
         * 
         * @return
         *     possible object is
         *     {@link Group }
         *     
         */
        public Group getGroup() {
            return group;
        }

        /**
         * Sets the value of the group property.
         * 
         * @param value
         *     allowed object is
         *     {@link Group }
         *     
         */
        public void setGroup(Group value) {
            this.group = value;
        }

        /**
         * Gets the value of the deletedObjects property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDeletedObjects() {
            return deletedObjects;
        }

        /**
         * Sets the value of the deletedObjects property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDeletedObjects(Object value) {
            this.deletedObjects = value;
        }

    }

}
