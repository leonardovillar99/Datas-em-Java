package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class DatasEmJava8 {
	public static void main(String[] args) throws InterruptedException {
		Instant inicio = Instant.now();
		
		Thread.sleep(20000); // Pode ser um processo com tempo qualquer que não conhecemos.
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nanosegundos: " + duracao.toNanos());
		
		System.out.println("Duração em segundos: " + duracao.toSeconds());
		
		System.out.println("Duração em minutos: " + duracao.toMinutes());

	}
}
