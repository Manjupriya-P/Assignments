package com.onebill.set;

import java.util.Objects;

public class Student1 {
	String name;
	int id;
	String dept;
	public Student1(String name, int id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}
 	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return id == other.id;
	}
//coment equals and to string override  and see the same hashcode allocated
//comment hashcode and see similar lists printed
// uncomments all and see the output
private void sysout() {
	// TODO Auto-generated method stub

}
	
	

}
