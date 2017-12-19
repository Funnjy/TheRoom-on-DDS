

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class Thermometer   implements Copyable, Serializable{

    public int did= 0;
    public String name=  "" ; /* maximum length = (128) */
    public String model=  "" ; /* maximum length = (128) */
    public String proto=  "" ; /* maximum length = (128) */
    public String devicetype=  "" ; /* maximum length = (128) */
    public int devicemethods= 0;
    public String devicelastcmd=  "" ; /* maximum length = (128) */
    public int devicelastval= 0;

    public Thermometer() {

    }
    public Thermometer (Thermometer other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Thermometer self;
        self = new  Thermometer();
        self.clear();
        return self;

    }

    public void clear() {

        did= 0;
        name=  ""; 
        model=  ""; 
        proto=  ""; 
        devicetype=  ""; 
        devicemethods= 0;
        devicelastcmd=  ""; 
        devicelastval= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Thermometer otherObj = (Thermometer)o;

        if(did != otherObj.did) {
            return false;
        }
        if(!name.equals(otherObj.name)) {
            return false;
        }
        if(!model.equals(otherObj.model)) {
            return false;
        }
        if(!proto.equals(otherObj.proto)) {
            return false;
        }
        if(!devicetype.equals(otherObj.devicetype)) {
            return false;
        }
        if(devicemethods != otherObj.devicemethods) {
            return false;
        }
        if(!devicelastcmd.equals(otherObj.devicelastcmd)) {
            return false;
        }
        if(devicelastval != otherObj.devicelastval) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)did;
        __result += name.hashCode(); 
        __result += model.hashCode(); 
        __result += proto.hashCode(); 
        __result += devicetype.hashCode(); 
        __result += (int)devicemethods;
        __result += devicelastcmd.hashCode(); 
        __result += (int)devicelastval;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ThermometerTypeSupport</code>
    * rather than here by using the <code>-noCopyable</code> option
    * to rtiddsgen.
    * 
    * @param src The Object which contains the data to be copied.
    * @return Returns <code>this</code>.
    * @exception NullPointerException If <code>src</code> is null.
    * @exception ClassCastException If <code>src</code> is not the 
    * same type as <code>this</code>.
    * @see com.rti.dds.infrastructure.Copyable#copy_from(java.lang.Object)
    */
    public Object copy_from(Object src) {

        Thermometer typedSrc = (Thermometer) src;
        Thermometer typedDst = this;

        typedDst.did = typedSrc.did;
        typedDst.name = typedSrc.name;
        typedDst.model = typedSrc.model;
        typedDst.proto = typedSrc.proto;
        typedDst.devicetype = typedSrc.devicetype;
        typedDst.devicemethods = typedSrc.devicemethods;
        typedDst.devicelastcmd = typedSrc.devicelastcmd;
        typedDst.devicelastval = typedSrc.devicelastval;

        return this;
    }

    public String toString(){
        return toString("", 0);
    }

    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();        

        if (desc != null) {
            CdrHelper.printIndent(strBuffer, indent);
            strBuffer.append(desc).append(":\n");
        }

        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("did: ").append(did).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("name: ").append(name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("model: ").append(model).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("proto: ").append(proto).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("devicetype: ").append(devicetype).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("devicemethods: ").append(devicemethods).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("devicelastcmd: ").append(devicelastcmd).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("devicelastval: ").append(devicelastval).append("\n");  

        return strBuffer.toString();
    }

}
