import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        int [] salary = {1000,2000,3000};
        double out = new AverageSalaryExcludingTheMinimumAndMaximumSalary().average(salary);
        System.out.println(out);
    }
    public double average(int[] salary) {
        double totalSalary = 0;
        double average;
        if(salary.length <= 2){
            return 0;
        }
        Arrays.sort(salary);

        for(int i = 1; i<salary.length-1; i++){
            totalSalary+=salary[i];
        }
        average = totalSalary/(salary.length-2);
        return average;
    }
}

