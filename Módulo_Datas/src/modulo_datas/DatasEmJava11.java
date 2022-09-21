package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava11 {
	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.parse("2022-09-21");
		
		for(int mes = 0; mes < 12; mes++) {
			dataAtual = dataAtual.plusMonths(1);
			
			System.out.println("Data de vencimento do boleto: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês: " + (mes + 1));
		}
	}
}
