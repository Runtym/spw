package com.osf.sp.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.sp.dao.EmpDAO;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	@Autowired
	private SqlSession ss;
	@Override
	public List<Map<String, String>> getEmps(int deptNo) {
		return ss.selectList("emp.selectEmpList",deptNo);
	}

}
