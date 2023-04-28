package com.deepak.service;

import java.util.List;

import com.deepak.entity.CitizenPlan;
import com.deepak.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	public List<String> getPlanStatus();
	public List<CitizenPlan> search(SearchRequest request);
	public boolean exportExcel();
	public boolean exportPdf();

}
