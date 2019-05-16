package com.osf.sp.service;

import java.util.List;
import java.util.Map;

public interface EmpService {
	List<Map<String,String>> getEmps(int deptNo);
}
