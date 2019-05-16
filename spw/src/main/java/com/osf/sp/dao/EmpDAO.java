package com.osf.sp.dao;

import java.util.List;
import java.util.Map;

public interface EmpDAO {
	List<Map<String,String>> getEmps(int deptNo);
}
