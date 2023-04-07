package EstruturaSequencial_Exercicio_8;
import java.util.Scanner;

class MonthlySalary {
	public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?");
		String userHourlyRate = userInput.nextLine();
		System.out.println("Qual foi o número de horas trabalhadas nesse mês?");
		String userMonthlyWorkingHours = userInput.nextLine();
		
		//apenas guarde o número, ponto e virgula.
		userHourlyRate = userHourlyRate.replaceAll("[^[+-]?([0-9]*[.,])?[0-9]+]", "");
		//caso o número for digitado com virgula e não ponto. Troque-os para armazenar na variável double.
		if(userHourlyRate.contains(",")) userHourlyRate = userHourlyRate.replace(",", ".");
		//Calcule = Horas Trabalhas * Pagamento por Hora.
		double salaryTotal = Double.parseDouble(userHourlyRate) *  Double.parseDouble(userMonthlyWorkingHours);
		//Dê o output com virgula e não ponto. 
		String dotForComma = String.valueOf(salaryTotal).replace(".", ",");
		System.out.println("O seu salário para esse mês é de: R$" + dotForComma);
        userInput.close();
    }
}