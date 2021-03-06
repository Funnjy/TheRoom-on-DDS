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

public class SensorinfoMessageType extends EventType {
public SensorinfoMessageType(short code) {super("sensorinfo", code);
}

public SensorinfoMessageType() {
super("sensorinfo", (short) 0);
}

public Event instantiate(final String model, final String proto, final short sid, final short dataTypes, final float temperature, final int humidity, final int timeStamp) { return new SensorinfoMessage(this, model, proto, sid, dataTypes, temperature, humidity, timeStamp); }
@Override
public Event instantiate(Map<String, Object> params) {return instantiate((String) params.get("model"), (String) params.get("proto"), (Short) params.get("sid"), (Short) params.get("dataTypes"), (Float) params.get("temperature"), (Integer) params.get("humidity"), (Integer) params.get("timeStamp"));
}

public class SensorinfoMessage extends Event implements java.io.Serializable {

public final String model;
public final String proto;
public final short sid;
public final short dataTypes;
public final float temperature;
public final int humidity;
public final int timeStamp;
@Override
public String toString(){
return "sensorinfo (" + "model: " + model + ", " + "proto: " + proto + ", " + "sid: " + sid + ", " + "dataTypes: " + dataTypes + ", " + "temperature: " + temperature + ", " + "humidity: " + humidity + ", " + "timeStamp: " + timeStamp + ")";
}

protected SensorinfoMessage(EventType type, final String model, final String proto, final short sid, final short dataTypes, final float temperature, final int humidity, final int timeStamp) {
super(type);
this.model = model;
this.proto = proto;
this.sid = sid;
this.dataTypes = dataTypes;
this.temperature = temperature;
this.humidity = humidity;
this.timeStamp = timeStamp;
}
@Override
public Event clone() {
return instantiate(this.model, this.proto, this.sid, this.dataTypes, this.temperature, this.humidity, this.timeStamp);
}}

}

