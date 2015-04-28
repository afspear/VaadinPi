package com.spear.VaadinPi.gpio;

import com.pi4j.system.NetworkInfo;
import com.pi4j.system.SystemInfo;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Label;

import java.io.IOException;
import java.text.ParseException;

public class GPIOInfo extends VerticalLayout{
	
	public GPIOInfo() throws InterruptedException, IOException, ParseException{
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("HARDWARE INFO"));
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("Serial Number     :  " + SystemInfo.getSerial()));
		this.addComponent(new Label ("CPU Revision      :  " + SystemInfo.getCpuRevision()));
		this.addComponent(new Label ("CPU Architecture  :  " + SystemInfo.getCpuArchitecture()));
		this.addComponent(new Label ("CPU Part          :  " + SystemInfo.getCpuPart()));
		this.addComponent(new Label ("CPU Temperature   :  " + SystemInfo.getCpuTemperature()));
		this.addComponent(new Label ("CPU Core Voltage  :  " + SystemInfo.getCpuVoltage()));
		this.addComponent(new Label ("Hardware          :  " + SystemInfo.getHardware()));
		this.addComponent(new Label ("Hardware Revision :  " + SystemInfo.getRevision()));
		this.addComponent(new Label ("Is Hard Float ABI :  " + SystemInfo.isHardFloatAbi()));
		this.addComponent(new Label ("Board Type        :  " + SystemInfo.getBoardType()));
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("MEMORY INFO"));
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("Total Memory      :  " + SystemInfo.getMemoryTotal()));
		this.addComponent(new Label ("Used Memory       :  " + SystemInfo.getMemoryUsed()));
		this.addComponent(new Label ("Free Memory       :  " + SystemInfo.getMemoryFree()));
		this.addComponent(new Label ("Shared Memory     :  " + SystemInfo.getMemoryShared()));
		this.addComponent(new Label ("Memory Buffers    :  " + SystemInfo.getMemoryBuffers()));
		this.addComponent(new Label ("Cached Memory     :  " + SystemInfo.getMemoryCached()));
		this.addComponent(new Label ("SDRAM_C Voltage   :  " + SystemInfo.getMemoryVoltageSDRam_C()));
		this.addComponent(new Label ("SDRAM_I Voltage   :  " + SystemInfo.getMemoryVoltageSDRam_I()));
		this.addComponent(new Label ("SDRAM_P Voltage   :  " + SystemInfo.getMemoryVoltageSDRam_P()));
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("OPERATING SYSTEM INFO"));
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("OS Name           :  " + SystemInfo.getOsName()));
		this.addComponent(new Label ("OS Version        :  " + SystemInfo.getOsVersion()));
		this.addComponent(new Label ("OS Architecture   :  " + SystemInfo.getOsArch()));
		this.addComponent(new Label ("OS Firmware Build :  " + SystemInfo.getOsFirmwareBuild()));
		this.addComponent(new Label ("OS Firmware Date  :  " + SystemInfo.getOsFirmwareDate()));
		this.addComponent(new Label ());
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("JAVA ENVIRONMENT INFO"));
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("Java Vendor       :  " + SystemInfo.getJavaVendor()));
		this.addComponent(new Label ("Java Vendor URL   :  " + SystemInfo.getJavaVendorUrl()));
		this.addComponent(new Label ("Java Version      :  " + SystemInfo.getJavaVersion()));
		this.addComponent(new Label ("Java VM           :  " + SystemInfo.getJavaVirtualMachine()));
		this.addComponent(new Label ("Java Runtime      :  " + SystemInfo.getJavaRuntime()));
		this.addComponent(new Label ());
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("NETWORK INFO"));
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ());
		this.addComponent(new Label ());
		this.addComponent(new Label ("Hostname          :  " + NetworkInfo.getHostname()));
		this.addComponent(new Label ("IP Addresses      :  " + NetworkInfo.getIPAddresses()));
		this.addComponent(new Label ("FQDN              :  " + NetworkInfo.getFQDNs()));
		this.addComponent(new Label ("Nameserver        :  " + NetworkInfo.getNameservers()));
		this.addComponent(new Label ());
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("CODEC INFO"));
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("H264 Codec Enabled:  " + SystemInfo.getCodecH264Enabled()));
		this.addComponent(new Label ("MPG2 Codec Enabled:  " + SystemInfo.getCodecMPG2Enabled()));
		this.addComponent(new Label ("WVC1 Codec Enabled:  " + SystemInfo.getCodecWVC1Enabled()));
		this.addComponent(new Label ());
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("CLOCK INFO"));
		this.addComponent(new Label ("----------------------------------------------------"));
		this.addComponent(new Label ("ARM Frequency     :  " + SystemInfo.getClockFrequencyArm()));
		this.addComponent(new Label ("CORE Frequency    :  " + SystemInfo.getClockFrequencyCore()));
		this.addComponent(new Label ("H264 Frequency    :  " + SystemInfo.getClockFrequencyH264()));
		this.addComponent(new Label ("ISP Frequency     :  " + SystemInfo.getClockFrequencyISP()));
		this.addComponent(new Label ("V3D Frequency     :  " + SystemInfo.getClockFrequencyV3D()));
		this.addComponent(new Label ("UART Frequency    :  " + SystemInfo.getClockFrequencyUART()));
		this.addComponent(new Label ("PWM Frequency     :  " + SystemInfo.getClockFrequencyPWM()));
		this.addComponent(new Label ("EMMC Frequency    :  " + SystemInfo.getClockFrequencyEMMC()));
		this.addComponent(new Label ("Pixel Frequency   :  " + SystemInfo.getClockFrequencyPixel()));
		this.addComponent(new Label ("VEC Frequency     :  " + SystemInfo.getClockFrequencyVEC()));
		this.addComponent(new Label ("HDMI Frequency    :  " + SystemInfo.getClockFrequencyHDMI()));
		this.addComponent(new Label ("DPI Frequency     :  " + SystemInfo.getClockFrequencyDPI()));

	}
	
	

}
