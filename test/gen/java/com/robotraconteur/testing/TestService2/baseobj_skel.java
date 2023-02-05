//This file is automatically generated. DO NOT EDIT!
package com.robotraconteur.testing.TestService2;
import java.util.*;
import com.robotraconteur.*;
public class baseobj_skel extends ServiceSkel {
    protected baseobj obj;
    public baseobj_skel(Object o) { 
    super(o);
    obj=(baseobj)o;
    }
    public void releaseCastObject() { 
    obj=null;
    super.releaseCastObject();
    }
    public MessageElement callGetProperty(String membername) {
    if(membername.equals( "d1"))
    {
    double ret=obj.get_d1();
    return MessageElementUtil.<double[]>packArray("return",new double[] {ret});
    }
    if(membername.equals( "d2"))
    {
    double[] ret=obj.get_d2();
    return MessageElementUtil.<double[]>packArray("return",ret);
    }
    throw new MemberNotFoundException("Member not found");
    }
    public void callSetProperty(String membername, MessageElement m) {
    if(membername.equals( "d1"))
    {
    obj.set_d1((MessageElementUtil.<double[]>castDataAndDispose(m))[0]);
    return;
    }
    if(membername.equals( "d2"))
    {
    obj.set_d2(MessageElementUtil.<double[]>unpackArray(m));
    return;
    }
    throw new MemberNotFoundException("Member not found");
    }
    public MessageElement callFunction(String rr_membername, vectorptr_messageelement rr_m) {
    if(rr_membername.equals( "func3"))
    {
    double d1=(MessageElementUtil.<double[]>castDataAndDispose(vectorptr_messageelement_util.findElement(rr_m,"d1")))[0];
    double d2=(MessageElementUtil.<double[]>castDataAndDispose(vectorptr_messageelement_util.findElement(rr_m,"d2")))[0];
    double rr_ret=obj.func3(d1, d2);
    return MessageElementUtil.<double[]>packArray("return",new double[] {rr_ret});
    }
    throw new MemberNotFoundException("Member not found");
    }
    public Object getSubObj(String name, String ind) {
    if(name.equals( "o5")) {
    return obj.get_o5();
    }
    throw new MemberNotFoundException("");
    }
    rr_ev1 rrvar_ev1=new rr_ev1();
    public void registerEvents(Object obj1) {
    obj=(baseobj)obj1;
    obj.addev1Listener(rrvar_ev1);
    }
    public void unregisterEvents(Object obj1) {
    obj=(baseobj)obj1;
    obj.removeev1Listener(rrvar_ev1);
    }
    private class rr_ev1 implements Action{
    public void action() {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    baseobj_skel.this.innerskel.wrappedDispatchEvent("ev1",rr_param);
    }
    finally {
    rr_param.delete();
    }
    }
    }
    class rr_cb2 implements Action2<Double, Double> {
    long endpoint;
    public rr_cb2(long endpoint) { this.endpoint=endpoint; }
    public void action(Double d1, Double d2) {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    MessageElement rr_me=null;
    try {
    MessageElementUtil.addMessageElementDispose(rr_param,MessageElementUtil.<double[]>packArray("d1",new double[] {d1}));
    MessageElementUtil.addMessageElementDispose(rr_param,MessageElementUtil.<double[]>packArray("d2",new double[] {d2}));
    rr_me=baseobj_skel.this.innerskel.wrappedCallbackCall("cb2",this.endpoint,rr_param);
    }
    finally {
    rr_param.delete();
    if (rr_me!=null) rr_me.delete();
    }
    }
    }
    public Object getCallbackFunction(long endpoint, String membername) {
    if(membername.equals( "cb2")) {
    return new rr_cb2(endpoint);
    }
    throw new MemberNotFoundException("Member not found");
    }
    public  void initPipeServers(Object obj1) {
    obj=(baseobj)obj1;
    obj.set_p1(new Pipe<double[]>(innerskel.getPipe("p1")));
    }
    public void initCallbackServers(Object obj1) {
    obj=(baseobj)obj1;
    obj.set_cb2(new CallbackServer<Action2<Double, Double>>("cb2",this));
    }
    public void initWireServers(Object obj1) {
    obj=(baseobj)obj1;
    obj.set_w1(new Wire<double[]>(innerskel.getWire("w1")));
    }
    public WrappedArrayMemoryDirector getArrayMemory(String name) {
    if(name.equals( "m1")) {
    WrappedArrayMemoryDirectorJava<double[]> dir=new  WrappedArrayMemoryDirectorJava<double[]>(obj.get_m1());
    return dir;
    }
    throw new MemberNotFoundException("Member Not Found");
    }
    public WrappedMultiDimArrayMemoryDirector getMultiDimArrayMemory(String name) {
    throw new MemberNotFoundException("Member Not Found");
    }
    public WrappedPodArrayMemoryDirector getPodArrayMemory(String name) {
    throw new MemberNotFoundException("Member Not Found");
    }
    public WrappedPodMultiDimArrayMemoryDirector getPodMultiDimArrayMemory(String name) {
    throw new MemberNotFoundException("Member Not Found");
    }
    public WrappedNamedArrayMemoryDirector getNamedArrayMemory(String name) {
    throw new MemberNotFoundException("Member Not Found");
    }
    public WrappedNamedMultiDimArrayMemoryDirector getNamedMultiDimArrayMemory(String name) {
    throw new MemberNotFoundException("Member Not Found");
    }
    public String getRRType() { return "com.robotraconteur.testing.TestService2.baseobj"; }
}
