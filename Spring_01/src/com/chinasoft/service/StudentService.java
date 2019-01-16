package com.chinasoft.service;

import com.chinasoft.dao.IStudentDao;
import com.chinasoft.entity.Student;

public class StudentService {
	private IStudentDao IStudentDao;

	public IStudentDao getIStudentDao() {
		return IStudentDao;
	}

	public void setIStudentDao(IStudentDao iStudentDao) {
		IStudentDao = iStudentDao;
	}
	public void addStudent(Student stu){
		IStudentDao.addStudent(stu);
	}
	
}
