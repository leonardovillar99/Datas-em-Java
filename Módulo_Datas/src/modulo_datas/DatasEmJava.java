package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		/* ---------- Objeto Date ---------- */
		Date data = new Date();
		
		System.out.println("Data em milisegundos: " + data.getTime());
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("------------------------------------------");
		
		System.out.println("Data em dia do mês: " + data.getDate());
		System.out.println("Calendar do dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("------------------------------------------");

		System.out.println("Dia da semana: " + data.getDay());
		System.out.println("Calendar do dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
		
		System.out.println("------------------------------------------");

		System.out.println("Hora do dia: " + data.getHours());
		System.out.println("Calendar em hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("------------------------------------------");
		
		System.out.println("Minuto do dia: " + data.getMinutes());
		System.out.println("Calendar do minuto do dia: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("------------------------------------------");
		
		System.out.println("Segundos do dia: " + data.getSeconds());
		System.out.println("Calendar do segundo do dia: " + calendar.get(Calendar.SECOND));
		
		System.out.println("------------------------------------------");
		
		System.out.println("Ano atual: " + (data.getYear() + 1900));
		System.out.println("Calendar do ano atual: " + calendar.get(Calendar.YEAR));
		
		System.out.println("------------------------------------------");
		
		/* ---------- Objeto SimpleDateFormat ---------- */
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formato padrão: " + simpleDateFormat.format(data));
		System.out.println("Calendar da data atual em formato padrão: " + simpleDateFormat.format(calendar.getTime()));
		
		System.out.println("------------------------------------------");

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data atual em formato para banco de dados: " + simpleDateFormat.format(data));
		System.out.println("Calendar da data atual em formato para banco de dados: " + simpleDateFormat.format(calendar.getTime()));

	}
}
