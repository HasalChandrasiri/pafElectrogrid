package com.consumption.demoConsumption;

import com.consumption.demoConsumption.model.Report;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("reports")
public class ReportResource {
	
	@GET 
	public Report getReport() {
		
	
		Report r1 = new Report() ;
		r1.setReportID(01);
		r1.setCustomerID(001);
		r1.setCategory(null);
		return r1 ;
	}
 
}
