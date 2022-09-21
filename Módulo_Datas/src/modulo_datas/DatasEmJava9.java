package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava9 {
	public static void main(String[] args) {
		
		LocalDate data1 = LocalDate.of(1999, 3, 5);
		
		LocalDate data2 = LocalDate.of(2030, 9, 21);
		
		System.out.println(data1.isBefore(data2) ? "Data 1 é maior que a data 2" : "Data 2 é maior que a data 1");
		
		System.out.println("---------------------------");
		
		if(data1.isAfter(data2)) {
			System.out.println("Data 1 é vem antes da Data 2");
		}else if(data1.isEqual(data2)) {
			System.out.println("As duas datas são iguais");
		}else {
			System.out.println("Data 2 vem antes da Data 1");
		}
		
		System.out.println("---------------------------");

		Period period = Period.between(data1, data2);
		
		System.out.println("A diferença das duas datas é de: " + period.getYears() + " anos " 
							+ period.getMonths() + " meses e " + period.getDays() + " dias");

	}
}
