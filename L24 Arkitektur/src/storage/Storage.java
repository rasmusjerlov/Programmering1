package storage;

import application.model.Company;
import application.model.Employee;

import java.util.ArrayList;

public class Storage {
	private static ArrayList<Company> companies = new ArrayList<>();
	private static ArrayList<Employee> employees = new ArrayList<>();

	// -------------------------------------------------------------------------

	public static ArrayList<Company> getCompanies() {
		return new ArrayList<Company>(companies);
	}

	public static void addCompany(Company company) {
		companies.add(company);
	}

	public static void removeCompany(Company company) {
		companies.remove(company);
	}

	// -------------------------------------------------------------------------

	public static ArrayList<Employee> getEmployees() {
		return new ArrayList<Employee>(employees);
	}

	public static void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public static void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	// -------------------------------------------------------------------------

}
