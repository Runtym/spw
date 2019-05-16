package com.osf.sp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osf.sp.dao.EmpDAO;
import com.osf.sp.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDAO edao;
	
	@Override
	public List<Map<String, String>> getEmps(int deptNo) {
		return edao.getEmps(deptNo);
	}

}
