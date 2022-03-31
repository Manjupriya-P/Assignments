package com.onebill.linkedSet;

import java.util.Objects;

public class Company {
	int id;
	int count;
	String designation;
	
	public Company(int id, int count, String designation) {
		this.id = id;
		this.count = count;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", count=" + count + ", designation=" + designation + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(count, designation, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return count == other.count && Objects.equals(designation, other.designation) && id == other.id;
	}
	
	

}
