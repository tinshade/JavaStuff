/*

Name: KnowSystem
By: Abhishek Iyengar
Description: A simple JAVA based tool to gather a system's information to the T!

*/


import java.lang.management.ManagementFactory; //System information gathering imports
import java.lang.management.RuntimeMXBean; //System information gathering imports
import java.util.Map; //Data structure and representational imports
import java.util.Set; //Data structure and representational imports


//MAIN CLASS
public class SystemInformation{
	public static void main(String[] args){
		RuntimeMXBean rtb = ManagementFactory.getRuntimeMXBean(); //Getting runtime information with BEAN
		Map<String, String> sysinfo = rtb.getSystemProperties(); //Using hashmaps to gather system properties from bean instance
		Set<String> keys = sysinfo.keySet(); //Defining set datastructure to store final system information
		//Iterating through the final set based on key:value pairs for name and details
		for(String key:keys){
			String value = sysinfo.get(key);
			System.out.printf("[%s] = %s. \n", key, value);
		}
	}
}