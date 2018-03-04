//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.19 at 11:24:00 PM CST 
//


package com.mocircle.jwinlog.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for SystemPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provider">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="Guid" type="{http://schemas.microsoft.com/win/2004/08/events/event}GUIDType" />
 *                 &lt;attribute name="EventSourceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EventID">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedShort">
 *                 &lt;attribute name="Qualifiers" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="Task" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="Opcode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://schemas.microsoft.com/win/2004/08/events/event}HexInt64Type" minOccurs="0"/>
 *         &lt;element name="TimeCreated" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SystemTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="RawTime" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EventRecordID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedLong">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Correlation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ActivityID" type="{http://schemas.microsoft.com/win/2004/08/events/event}GUIDType" />
 *                 &lt;attribute name="RelatedActivityID" type="{http://schemas.microsoft.com/win/2004/08/events/event}GUIDType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Execution" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ProcessID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="ThreadID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="ProcessorID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                 &lt;attribute name="SessionID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="KernelTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="UserTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="ProcessorTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Computer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Security" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemPropertiesType", propOrder = {
    "provider",
    "eventID",
    "version",
    "level",
    "task",
    "opcode",
    "keywords",
    "timeCreated",
    "eventRecordID",
    "correlation",
    "execution",
    "channel",
    "computer",
    "security",
    "any"
})
public class SystemPropertiesType {

    @XmlElement(name = "Provider", required = true)
    protected SystemPropertiesType.Provider provider;
    @XmlElement(name = "EventID", required = true)
    protected SystemPropertiesType.EventID eventID;
    @XmlElement(name = "Version")
    @XmlSchemaType(name = "unsignedByte")
    protected Short version;
    @XmlElement(name = "Level")
    @XmlSchemaType(name = "unsignedByte")
    protected Short level;
    @XmlElement(name = "Task")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer task;
    @XmlElement(name = "Opcode")
    @XmlSchemaType(name = "unsignedByte")
    protected Short opcode;
    @XmlElement(name = "Keywords")
    protected String keywords;
    @XmlElement(name = "TimeCreated")
    protected SystemPropertiesType.TimeCreated timeCreated;
    @XmlElement(name = "EventRecordID")
    protected SystemPropertiesType.EventRecordID eventRecordID;
    @XmlElement(name = "Correlation")
    protected SystemPropertiesType.Correlation correlation;
    @XmlElement(name = "Execution")
    protected SystemPropertiesType.Execution execution;
    @XmlElement(name = "Channel")
    @XmlSchemaType(name = "anyURI")
    protected String channel;
    @XmlElement(name = "Computer", required = true)
    protected String computer;
    @XmlElement(name = "Security")
    protected SystemPropertiesType.Security security;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPropertiesType.Provider }
     *     
     */
    public SystemPropertiesType.Provider getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPropertiesType.Provider }
     *     
     */
    public void setProvider(SystemPropertiesType.Provider value) {
        this.provider = value;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPropertiesType.EventID }
     *     
     */
    public SystemPropertiesType.EventID getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPropertiesType.EventID }
     *     
     */
    public void setEventID(SystemPropertiesType.EventID value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVersion(Short value) {
        this.version = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLevel(Short value) {
        this.level = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTask(Integer value) {
        this.task = value;
    }

    /**
     * Gets the value of the opcode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOpcode() {
        return opcode;
    }

    /**
     * Sets the value of the opcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOpcode(Short value) {
        this.opcode = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the timeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPropertiesType.TimeCreated }
     *     
     */
    public SystemPropertiesType.TimeCreated getTimeCreated() {
        return timeCreated;
    }

    /**
     * Sets the value of the timeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPropertiesType.TimeCreated }
     *     
     */
    public void setTimeCreated(SystemPropertiesType.TimeCreated value) {
        this.timeCreated = value;
    }

    /**
     * Gets the value of the eventRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPropertiesType.EventRecordID }
     *     
     */
    public SystemPropertiesType.EventRecordID getEventRecordID() {
        return eventRecordID;
    }

    /**
     * Sets the value of the eventRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPropertiesType.EventRecordID }
     *     
     */
    public void setEventRecordID(SystemPropertiesType.EventRecordID value) {
        this.eventRecordID = value;
    }

    /**
     * Gets the value of the correlation property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPropertiesType.Correlation }
     *     
     */
    public SystemPropertiesType.Correlation getCorrelation() {
        return correlation;
    }

    /**
     * Sets the value of the correlation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPropertiesType.Correlation }
     *     
     */
    public void setCorrelation(SystemPropertiesType.Correlation value) {
        this.correlation = value;
    }

    /**
     * Gets the value of the execution property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPropertiesType.Execution }
     *     
     */
    public SystemPropertiesType.Execution getExecution() {
        return execution;
    }

    /**
     * Sets the value of the execution property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPropertiesType.Execution }
     *     
     */
    public void setExecution(SystemPropertiesType.Execution value) {
        this.execution = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the computer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputer() {
        return computer;
    }

    /**
     * Sets the value of the computer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputer(String value) {
        this.computer = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPropertiesType.Security }
     *     
     */
    public SystemPropertiesType.Security getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPropertiesType.Security }
     *     
     */
    public void setSecurity(SystemPropertiesType.Security value) {
        this.security = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ActivityID" type="{http://schemas.microsoft.com/win/2004/08/events/event}GUIDType" />
     *       &lt;attribute name="RelatedActivityID" type="{http://schemas.microsoft.com/win/2004/08/events/event}GUIDType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Correlation {

        @XmlAttribute(name = "ActivityID")
        protected String activityID;
        @XmlAttribute(name = "RelatedActivityID")
        protected String relatedActivityID;

        /**
         * Gets the value of the activityID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActivityID() {
            return activityID;
        }

        /**
         * Sets the value of the activityID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActivityID(String value) {
            this.activityID = value;
        }

        /**
         * Gets the value of the relatedActivityID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelatedActivityID() {
            return relatedActivityID;
        }

        /**
         * Sets the value of the relatedActivityID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelatedActivityID(String value) {
            this.relatedActivityID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedShort">
     *       &lt;attribute name="Qualifiers" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class EventID {

        @XmlValue
        @XmlSchemaType(name = "unsignedShort")
        protected int value;
        @XmlAttribute(name = "Qualifiers")
        @XmlSchemaType(name = "unsignedShort")
        protected Integer qualifiers;

        /**
         * Gets the value of the value property.
         * 
         */
        public int getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(int value) {
            this.value = value;
        }

        /**
         * Gets the value of the qualifiers property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQualifiers() {
            return qualifiers;
        }

        /**
         * Sets the value of the qualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQualifiers(Integer value) {
            this.qualifiers = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedLong">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class EventRecordID {

        @XmlValue
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ProcessID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="ThreadID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="ProcessorID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *       &lt;attribute name="SessionID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="KernelTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="UserTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="ProcessorTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Execution {

        @XmlAttribute(name = "ProcessID", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long processID;
        @XmlAttribute(name = "ThreadID", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long threadID;
        @XmlAttribute(name = "ProcessorID")
        @XmlSchemaType(name = "unsignedByte")
        protected Short processorID;
        @XmlAttribute(name = "SessionID")
        @XmlSchemaType(name = "unsignedInt")
        protected Long sessionID;
        @XmlAttribute(name = "KernelTime")
        @XmlSchemaType(name = "unsignedInt")
        protected Long kernelTime;
        @XmlAttribute(name = "UserTime")
        @XmlSchemaType(name = "unsignedInt")
        protected Long userTime;
        @XmlAttribute(name = "ProcessorTime")
        @XmlSchemaType(name = "unsignedInt")
        protected Long processorTime;

        /**
         * Gets the value of the processID property.
         * 
         */
        public long getProcessID() {
            return processID;
        }

        /**
         * Sets the value of the processID property.
         * 
         */
        public void setProcessID(long value) {
            this.processID = value;
        }

        /**
         * Gets the value of the threadID property.
         * 
         */
        public long getThreadID() {
            return threadID;
        }

        /**
         * Sets the value of the threadID property.
         * 
         */
        public void setThreadID(long value) {
            this.threadID = value;
        }

        /**
         * Gets the value of the processorID property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getProcessorID() {
            return processorID;
        }

        /**
         * Sets the value of the processorID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setProcessorID(Short value) {
            this.processorID = value;
        }

        /**
         * Gets the value of the sessionID property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSessionID() {
            return sessionID;
        }

        /**
         * Sets the value of the sessionID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSessionID(Long value) {
            this.sessionID = value;
        }

        /**
         * Gets the value of the kernelTime property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getKernelTime() {
            return kernelTime;
        }

        /**
         * Sets the value of the kernelTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setKernelTime(Long value) {
            this.kernelTime = value;
        }

        /**
         * Gets the value of the userTime property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getUserTime() {
            return userTime;
        }

        /**
         * Sets the value of the userTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setUserTime(Long value) {
            this.userTime = value;
        }

        /**
         * Gets the value of the processorTime property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getProcessorTime() {
            return processorTime;
        }

        /**
         * Sets the value of the processorTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setProcessorTime(Long value) {
            this.processorTime = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="Guid" type="{http://schemas.microsoft.com/win/2004/08/events/event}GUIDType" />
     *       &lt;attribute name="EventSourceName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Provider {

        @XmlAttribute(name = "Name")
        @XmlSchemaType(name = "anyURI")
        protected String name;
        @XmlAttribute(name = "Guid")
        protected String guid;
        @XmlAttribute(name = "EventSourceName")
        protected String eventSourceName;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the guid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuid() {
            return guid;
        }

        /**
         * Sets the value of the guid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuid(String value) {
            this.guid = value;
        }

        /**
         * Gets the value of the eventSourceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventSourceName() {
            return eventSourceName;
        }

        /**
         * Sets the value of the eventSourceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventSourceName(String value) {
            this.eventSourceName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Security {

        @XmlAttribute(name = "UserID")
        protected String userID;

        /**
         * Gets the value of the userID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserID() {
            return userID;
        }

        /**
         * Sets the value of the userID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserID(String value) {
            this.userID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="SystemTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="RawTime" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TimeCreated {

        @XmlAttribute(name = "SystemTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar systemTime;
        @XmlAttribute(name = "RawTime")
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger rawTime;

        /**
         * Gets the value of the systemTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSystemTime() {
            return systemTime;
        }

        /**
         * Sets the value of the systemTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSystemTime(XMLGregorianCalendar value) {
            this.systemTime = value;
        }

        /**
         * Gets the value of the rawTime property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRawTime() {
            return rawTime;
        }

        /**
         * Sets the value of the rawTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRawTime(BigInteger value) {
            this.rawTime = value;
        }

    }

}
