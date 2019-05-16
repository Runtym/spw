package com.osf.sp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osf.sp.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService es;
	
	@RequestMapping(value="/emps",method=RequestMethod.GET)
	public  @ResponseBody List<Map<String,String>> 
	getEmps(@RequestParam Map<String,String> params){
		int empNo = Integer.parseInt(params.get("empNo"));
		return es.getEmps(empNo);
	}
}
