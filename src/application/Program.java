package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("NOME DO FUNCIONARIO: ");
        employee.name = sc.nextLine();
        System.out.println("SALARIO ATUAL: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Desconto: ");
        employee.tax = sc.nextDouble();

        System.out.println("FUNCIONARIO:   "+ employee.name+ " SALARIO LIQUIDO: $ " + employee.salaryLiq());
        System.out.println("PORCENTAGEM DE AUMENTO VALOR: ");
        employee.porcentagem = sc.nextDouble();
        System.out.printf("UPDATED DATA : " +employee.name +"   SALARIO ATUALIZADO:$ "+employee.incresePorcentage());
    }
}
