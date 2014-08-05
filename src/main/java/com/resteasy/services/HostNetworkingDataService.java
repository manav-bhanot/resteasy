/**
 * 
 */
package com.resteasy.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.resteasy.services.model.host.HostNetworkingData;
import com.resteasy.services.model.host.HostNetworkingDataList;


/**
 * @author e00876
 * 
 */
@Path("/host")
public class HostNetworkingDataService {
	
	@GET
	@Path("/getHostNetworkingData")
	@Produces("application/json")
	public HostNetworkingDataList getHostNetworkingData() {
		List<HostNetworkingData> hostNetworkingDataList = new ArrayList<HostNetworkingData>();
		HostNetworkingData hostNetworkingData = new HostNetworkingData("vmnic5", 1, "ent-ex4200-a", "ge-0/0/1(Trunk)", "100,200");
		hostNetworkingDataList.add(hostNetworkingData);
		hostNetworkingData = new HostNetworkingData("vmnic4", 3,"ent-ex4200-b", "ge-0/0/2(Trunk)", "300,221");
		hostNetworkingDataList.add(hostNetworkingData);
		hostNetworkingData = new HostNetworkingData("vmnic3", 4,"ent-ex4200-c", "ge-0/0/32(Trunk)", "111,333");
		hostNetworkingDataList.add(hostNetworkingData);
		hostNetworkingData = new HostNetworkingData("vmnic1", 22,"ent-ex4200-e", "ge-0/0/32(Trunk)", "344,441");
		return new HostNetworkingDataList(hostNetworkingDataList);

	}

}
