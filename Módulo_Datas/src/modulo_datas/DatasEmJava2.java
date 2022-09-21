package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava2 {
	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("21/09/2022");
		
		Date dataAtual = simpleDateFormat.parse("20/09/2022");
		
		if(dataVencimentoBoleto.after(dataAtual)) {
			System.out.println("Boleto não vencido!");
		}else {
			System.out.println("Boleto vencido!");
		}
		
	}
}
