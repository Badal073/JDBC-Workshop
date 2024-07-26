package com.piersqure.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String operation = "";
		
		System.out.println("Enter operation (Insert, Get, Update, Delete, Exit):");
		operation = scanner.nextLine();
		
		switch(operation.toLowerCase()) {
		case "insert":
			insertEmployee(scanner);
		
		case "get":
			getEmployee(scanner);
			
		case "update":
			updateEmployee(scanner);
			
		case "delete":
			deleteEmployee(scanner);
			
		case "exit":
			exitEmployee(scanner);
		}

	}

	private static void exitEmployee(Scanner scanner) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee id: ");
		int id = scanner.nextInt();
		System.out.println("Enter Employee name: ");
		String name = scanner.nextLine();
		System.out.println("Enter Employee  department: ");
		String  department = scanner.nextLine();
		System.out.println("Enter Employee salary: ");
		double salary = Double.parseDouble(scanner.nextLine());
		
		Connection connection = DriverManager.getConnection(EmployeeConstant.DB_URL, EmployeeConstant.USERNAME, EmployeeConstant.PASSWORD);
		
		PreparedStatement pstmt  = connection.prepareStatement(EmployeeConstant.INSERT_QUERY);
		pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, department);
        pstmt.setDouble(4, salary);
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new employee was inserted successfully!");
        }
	}

	private static void deleteEmployee(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void updateEmployee(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void getEmployee(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void insertEmployee(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

}
