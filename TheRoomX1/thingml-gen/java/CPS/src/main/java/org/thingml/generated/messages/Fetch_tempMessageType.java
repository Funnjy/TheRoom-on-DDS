/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated.messages;

import org.thingml.java.*;
import org.thingml.java.ext.*;

import org.thingml.generated.api.*;
import java.util.*;
import java.nio.*;

public class Fetch_tempMessageType extends EventType {
public Fetch_tempMessageType(short code) {super("fetch_temp", code);
}

public Fetch_tempMessageType() {
super("fetch_temp", (short) 0);
}

public Event instantiate(final short id) { return new Fetch_tempMessage(this, id); }
@Override
public Event instantiate(Map<String, Object> params) {return instantiate((Short) params.get("id"));
}

public class Fetch_tempMessage extends Event implements java.io.Serializable {

public final short id;
@Override
public String toString(){
return "fetch_temp (" + "id: " + id + ")";
}

protected Fetch_tempMessage(EventType type, final short id) {
super(type);
this.id = id;
}
@Override
public Event clone() {
return instantiate(this.id);
}}

}

