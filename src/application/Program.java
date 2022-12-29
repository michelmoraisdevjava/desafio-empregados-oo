package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		Integer payDay = sc.nextInt();
		System.out.print("Email: ");
		String departmentEmail = sc.next();
		System.out.print("Telefone: ");
		String departmentPhone = sc.next();
		
		Department dept = new Department(departmentName, payDay, new Address(departmentEmail, departmentPhone));
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados do funcionário " + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.print("Salário: ");
			double employeeSalary = sc.nextDouble();
			
			Employee emp = new Employee(employeeName, employeeSalary);
			dept.addEmployee(emp);
		}
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO:");
		showReport(dept);
		
		sc.close();
	}
	
	private static void showReport(Department dept) {
		System.out.println(dept.toString());
	}

}
