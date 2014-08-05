/**
 * 
 */
package com.resteasy.services;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.resteasy.services.model.virtualmachine.VmNetworkLocationHistory;
import com.resteasy.services.model.virtualmachine.VmNetworkLocationHistoryDataList;

/**
 * @author e00876
 * 
 */
@Path("/virtualMachine")
public class VmNetworkLocationHistoryService {
	
	@GET
	@Path("/getVmNetworkLocationHistoryDetails/{vmMoRef}")
	@Produces("application/json")
	public VmNetworkLocationHistoryDataList getNetworkLocationHistory(@PathParam("vmMoRef")String vmMoref) {
		
		System.out.println("VmMoRef is : "+vmMoref);

		ArrayList<VmNetworkLocationHistory> list = new ArrayList<VmNetworkLocationHistory>();

		VmNetworkLocationHistory vmMotionDetailsModel1 = new VmNetworkLocationHistory("01/05/2013 21:30:01", "Host1", "port1");
		VmNetworkLocationHistory vmMotionDetailsModel2 = new VmNetworkLocationHistory("21/10/2013 21:30:01", "Host2", "port2");
		VmNetworkLocationHistory vmMotionDetailsModel3 = new VmNetworkLocationHistory("01/01/2014 21:30:01", "Host3", "port6");
		VmNetworkLocationHistory vmMotionDetailsModel4 = new VmNetworkLocationHistory("17/03/2014 21:30:01", "Host4", "port9");

		list.add(vmMotionDetailsModel1);
		list.add(vmMotionDetailsModel2);
		list.add(vmMotionDetailsModel3);
		list.add(vmMotionDetailsModel4);
		list.add(vmMotionDetailsModel1);

		VmNetworkLocationHistoryDataList vmNetworkLocationHistoryDataList = new VmNetworkLocationHistoryDataList(list);
		return vmNetworkLocationHistoryDataList;
	}
	
	@GET
	@Path("/getVmNetworkLocationHistoryDetails")
	@Produces("application/json")
	public VmNetworkLocationHistoryDataList getNetworkLocationHistory() {

		ArrayList<VmNetworkLocationHistory> list = new ArrayList<VmNetworkLocationHistory>();

		VmNetworkLocationHistory vmMotionDetailsModel1 = new VmNetworkLocationHistory("01/05/2013 21:30:01", "Host10", "port11");
		VmNetworkLocationHistory vmMotionDetailsModel2 = new VmNetworkLocationHistory("21/10/2013 21:30:01", "Host11", "port21");
		VmNetworkLocationHistory vmMotionDetailsModel3 = new VmNetworkLocationHistory("01/01/2014 21:30:01", "Host12", "port62");
		VmNetworkLocationHistory vmMotionDetailsModel4 = new VmNetworkLocationHistory("17/03/2014 21:30:01", "Host13", "port93");

		list.add(vmMotionDetailsModel1);
		list.add(vmMotionDetailsModel2);
		list.add(vmMotionDetailsModel3);
		list.add(vmMotionDetailsModel4);
		list.add(vmMotionDetailsModel1);

		VmNetworkLocationHistoryDataList vmNetworkLocationHistoryDataList = new VmNetworkLocationHistoryDataList(list);
		return vmNetworkLocationHistoryDataList;
	}

}
