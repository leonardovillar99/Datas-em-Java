package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava5 {
	public static void main(String[] args) throws ParseException {
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("20/09/2022");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for(int parcela = 0; parcela < 12; parcela++ ) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela de número: " + (parcela + 1) + ", vencimento é em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
	}
}
