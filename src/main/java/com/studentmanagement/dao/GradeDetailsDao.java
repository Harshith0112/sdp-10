package com.studentmanagement.dao;

import com.studentmanagement.entity.GradeDetails;

public interface GradeDetailsDao {
	
	public void save(GradeDetails gradeDetails);
	
	public GradeDetails findById(int id);
	
	public void deleteById(int id);
}
