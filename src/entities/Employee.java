package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double porcentagem;


    public double finalLiquido (){
        return grossSalary /porcentagem;
    }

    public double incresePorcentage (){
        return finalLiquido() + salaryLiq();
    }
    public double salaryLiq (){
      return grossSalary - tax;
    }

}
