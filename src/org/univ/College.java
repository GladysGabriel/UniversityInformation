package org.univ;

public class College extends University{

	public void ug() {
		System.out.println("ug:Bsc");
	}
	public void pg() {
		System.out.println("pg:Msc");
	}
	public static void main(String[] args) {
		College c= new College();
		c.ug();
		c.pg();
	}
}
