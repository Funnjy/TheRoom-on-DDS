package org.thingml.generated.api;

import org.thingml.generated.api.*;

public interface IPIM_human_input{
void add_thermometer_via_human_input(short TemperatureMsg_add_thermometer_id_var, String TemperatureMsg_add_thermometer_txt_var);
void add_device_via_human_input(short DeviceGeneral_add_device_did_var);
void fetch_temp_via_human_input(short TemperatureMsg_fetch_temp_id_var);
void fetch_all_temps_via_human_input();
void SwitchOn_via_human_input(short OnOffMsg_SwitchOn_did_var);
void SwitchOff_via_human_input(short OnOffMsg_SwitchOff_did_var);
}