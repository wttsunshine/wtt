package com.chinasoft.dao.impl;

import com.chinasoft.dao.IStudentDao;
import com.chinasoft.entity.Student;

public class IStudentDaoImpl implements IStudentDao {

	@Override
	public void addStudent(Student stu) {
		System.out.println(stu);
		
	}


}
