package com.enrol

class Course {

String department;
String courseTitle;
Lecturer courseLeader;
String courseCode;
Date startDate;
Date endDate;
String description;
int numberOfStudents;
double tuitionFees;
String studyMode;

static hasMany =[lecturers: Lecturer, students:Student, modules:Module]

String toString(){
  return courseTitle;
}

    static constraints = {
	courseTitle blank:false,nullable: false

	department blank:false, nullable: false

	courseLeader blank:false, nullable: false

	courseCode blank:false, nullable: false

	numberOfStudents blank:false, nullable: false, min:20, max:60

	startDate blank:false, nullable: false

	endDate blank:false, nullable: false

	studyMode blank:false, nullable: false

	description nullable: false, maxSize: 5000, widget: 'textarea'

	tuitionFees nullable: false, blank: false, scale: 2

    }

}
