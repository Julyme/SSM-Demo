package com.ghost.service;

import java.util.List;

import com.ghost.domain.Deptment;

public interface DeptmentService {
	//查询所有部门
	public List<Deptment> findAllDeptments() throws Exception;
	//增加部门
	public void addDeptment(Deptment deptment) throws Exception;
	//修改部门信息
	public void updateDeptment(Deptment deptment) throws Exception;
	//删除部门
	public void deleteDeptments(int id) throws Exception;
	//总记录数
	public int totalSize() throws Exception;
}
