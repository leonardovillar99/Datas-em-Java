package modulo_datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJava4 {
	public static void main(String[] args) {	
		
	long dias = ChronoUnit.DAYS.between(LocalDate.parse("1999-03-05"), LocalDate.now());
	
	System.out.println("Possuí: " + dias + " dias entre a faixa de data");

	}
}
