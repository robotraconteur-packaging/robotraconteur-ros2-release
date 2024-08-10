/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.robotraconteur;

public class MemberDefinition {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected MemberDefinition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MemberDefinition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RobotRaconteurJavaJNI.delete_MemberDefinition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    RobotRaconteurJavaJNI.MemberDefinition_Name_set(swigCPtr, this, value);
  }

  public String getName() {
    return RobotRaconteurJavaJNI.MemberDefinition_Name_get(swigCPtr, this);
  }

  public void setDocString(String value) {
    RobotRaconteurJavaJNI.MemberDefinition_DocString_set(swigCPtr, this, value);
  }

  public String getDocString() {
    return RobotRaconteurJavaJNI.MemberDefinition_DocString_get(swigCPtr, this);
  }

  public MemberDefinition(ServiceEntryDefinition ServiceEntry) {
    this(RobotRaconteurJavaJNI.new_MemberDefinition(ServiceEntryDefinition.getCPtr(ServiceEntry), ServiceEntry), true);
  }

  public MemberDefinition_NoLock noLock() {
    return MemberDefinition_NoLock.swigToEnum(RobotRaconteurJavaJNI.MemberDefinition_noLock(swigCPtr, this));
  }

  public String toString() {
    return RobotRaconteurJavaJNI.MemberDefinition_toString(swigCPtr, this);
  }

  public ServiceEntryDefinition getServiceEntry() {
    long cPtr = RobotRaconteurJavaJNI.MemberDefinition_getServiceEntry(swigCPtr, this);
    return (cPtr == 0) ? null : new ServiceEntryDefinition(cPtr, true);
  }

  public void setServiceEntry(ServiceEntryDefinition value) {
    RobotRaconteurJavaJNI.MemberDefinition_setServiceEntry(swigCPtr, this, ServiceEntryDefinition.getCPtr(value), value);
  }

  public void setModifiers(vectorstring value) {
    RobotRaconteurJavaJNI.MemberDefinition_Modifiers_set(swigCPtr, this, vectorstring.getCPtr(value), value);
  }

  public vectorstring getModifiers() {
    long cPtr = RobotRaconteurJavaJNI.MemberDefinition_Modifiers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vectorstring(cPtr, false);
  }

  public void setParseInfo(ServiceDefinitionParseInfo value) {
    RobotRaconteurJavaJNI.MemberDefinition_ParseInfo_set(swigCPtr, this, ServiceDefinitionParseInfo.getCPtr(value), value);
  }

  public ServiceDefinitionParseInfo getParseInfo() {
    long cPtr = RobotRaconteurJavaJNI.MemberDefinition_ParseInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ServiceDefinitionParseInfo(cPtr, false);
  }

  public void reset() {
    RobotRaconteurJavaJNI.MemberDefinition_reset(swigCPtr, this);
  }

}
