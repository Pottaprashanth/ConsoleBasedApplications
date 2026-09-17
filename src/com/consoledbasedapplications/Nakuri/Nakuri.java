package com.consoledbasedapplications;

import java.util.Scanner;

public class Nakuri {

	public static void main(String[] args) {
		System.out.println("Welcome to VCube Naukari Portal !!");
		System.out.println("Your career starts from here.");
		System.out.println("Please enter your details to check job eligibility.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Full Name:");
		String n = sc.nextLine();
		System.out.println("Hello " + n + ".");
		System.out.println("Enter Qualification:");
		String q = sc.nextLine();

		if (q.equalsIgnoreCase("BTech")) {
			System.out.println("Enter Branch:");
			String branch = sc.nextLine();
			if (branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("IT") || branch.equalsIgnoreCase("ECE")) {
				System.out.println("Do you have Any Backlogs:");
				int back = sc.nextInt();
				if (back <= 0) {
					System.out.println("Enter CGPA:");
					float c1 = sc.nextFloat();
					if (c1 >= 6.5) {
						System.out.println("Enter Skills:");
						String skills = sc.next();
						if (skills.equalsIgnoreCase("JAVA")) {
							System.out.println("Enter experience in years:");
							int experience = sc.nextInt();
							if (experience >= 0 && experience <= 5) {
								System.out.println("Enter Preferred Location:");
								String loc = sc.next();
								if (loc.equalsIgnoreCase("Hyderabad") || loc.equalsIgnoreCase("Bangalore")
										|| loc.equalsIgnoreCase("pune")) {
									System.out.println("Enter Expetced Salary Per Annum:");
									double salary = sc.nextDouble();
									if (salary >= 300000 && salary <= 600000) {
										System.out.println("Checking your profile...\n\n");
										System.out.println("Great!! Your qualification is matching.\n");
										System.out.println("Your CGPA is eligible..\n");
										System.out.println("Your skills is eligible..\n");
										System.out.println("You are eligible for the position:");
										System.out.println("-------------------------------------- \n");
										System.out.println("Job Role       : Java Developer");
										System.out.println("Experience     : Fresher & Experience");
										System.out.println("Location       : Hyderabad,Bangalore,Pune");
										System.out.println("Salary         : 3 - 6 LPA \n");
										System.out.println("Congratulations " + n + "!!");
										System.out.println("Your profile has been shortlisted.");

									} else {
										System.out.println("Expetced Salary not matching.");
									}

								} else {
									System.out.println("Location not matching.");
								}
							} else {
								System.out.println("Experience not matching.");
							}
						} else {
							System.out.println("CGPA Criteria not matching");
						}

					} else {
						System.out.println(" CGPA Criteria not matching.");
					}
				} else {
					System.out.println("You have Active Backlogs not matching.");
				}
			} else {
				System.out.println("Branch criteria not matching");
			}
		} else {
			System.out.println("Qualification criteria not matching");
		}

	}
}
