

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

public class temp_message   implements Copyable, Serializable{

    public int id= 0;
    public String txt=  "" ; /* maximum length = (128) */
    public double temperature= 0;

    public temp_message() {

    }
    public temp_message (temp_message other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        temp_message self;
        self = new  temp_message();
        self.clear();
        return self;

    }

    public void clear() {

        id= 0;
        txt=  ""; 
        temperature= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        temp_message otherObj = (temp_message)o;

        if(id != otherObj.id) {
            return false;
        }
        if(!txt.equals(otherObj.txt)) {
            return false;
        }
        if(temperature != otherObj.temperature) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)id;
        __result += txt.hashCode(); 
        __result += (int)temperature;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>temp_messageTypeSupport</code>
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

        temp_message typedSrc = (temp_message) src;
        temp_message typedDst = this;

        typedDst.id = typedSrc.id;
        typedDst.txt = typedSrc.txt;
        typedDst.temperature = typedSrc.temperature;

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
        strBuffer.append("txt: ").append(txt).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("temperature: ").append(temperature).append("\n");  

        return strBuffer.toString();
    }

}
