package com.studentmanagement.service;

import com.studentmanagement.entity.AssignmentDetails;

public interface AssignmentDetailsService {
	
	public AssignmentDetails findByAssignmentAndStudentCourseDetailsId(int assignmentId, int studentCourseDetailsId);
	
	public void save(AssignmentDetails studentCourseAssignmentDetails);
}
