package org.thingml.generated.api;

import org.thingml.generated.api.*;

public interface IHuman_send_cmdClient{
void add_thermometer_from_send_cmd(short TemperatureMsg_add_thermometer_id_var, String TemperatureMsg_add_thermometer_txt_var);
void add_device_from_send_cmd(short DeviceGeneral_add_device_did_var);
void fetch_temp_from_send_cmd(short TemperatureMsg_fetch_temp_id_var);
void fetch_all_temps_from_send_cmd();
void SwitchOn_from_send_cmd(short OnOffMsg_SwitchOn_did_var);
void SwitchOff_from_send_cmd(short OnOffMsg_SwitchOff_did_var);
}