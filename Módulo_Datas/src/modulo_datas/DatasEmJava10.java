package modulo_datas;

import java.time.LocalDate;

public class DatasEmJava10 {
	public static void main(String[] args) {
		LocalDate dataBase = LocalDate.parse("1999-03-05");
		
		System.out.println("Sem aumentar os dias da data: " + dataBase);
		System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Sem aumentar as semanas da data: " + dataBase);
		System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Sem aumentar os meses da data: " + dataBase);
		System.out.println("Mais 5 meses: " + (dataBase = dataBase.plusMonths(5)));
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Sem aumentar os anos da data: " + dataBase);
		System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));

	}
}
