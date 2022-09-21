package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava3 {
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("20/09/2022"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println("Somando o dia atual + 5 dias: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 2);
		
		System.out.println("Somando + 2 meses da data atual: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
	}
}
