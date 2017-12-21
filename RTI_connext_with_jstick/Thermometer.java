

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

    public short id= 0;
    public double long_data= 0;
    public String string_data=  "" ; /* maximum length = (255) */

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

        id= 0;
        long_data= 0;
        string_data=  ""; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Thermometer otherObj = (Thermometer)o;

        if(id != otherObj.id) {
            return false;
        }
        if(long_data != otherObj.long_data) {
            return false;
        }
        if(!string_data.equals(otherObj.string_data)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)id;
        __result += (int)long_data;
        __result += string_data.hashCode(); 
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

        typedDst.id = typedSrc.id;
        typedDst.long_data = typedSrc.long_data;
        typedDst.string_data = typedSrc.string_data;

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
        strBuffer.append("id: ").append(id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("long_data: ").append(long_data).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("string_data: ").append(string_data).append("\n");  

        return strBuffer.toString();
    }

}
