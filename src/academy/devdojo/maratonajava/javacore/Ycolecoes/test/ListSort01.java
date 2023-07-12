package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort01 {

	public static void main(String[] args) {
		List<String> animes = new ArrayList<>();
		animes.add("Naruto");
		animes.add("Boruto");
		animes.add("Dragon Ball");
		animes.add("Boku no Hero");
		animes.add("One Piece");
		animes.add("Hunter x Hunter");
		animes.add("Akira");
		animes.add("Attack on Titan");
		animes.add("Shingeki no Kyojin");

		System.out.println(animes);
		Collections.sort(animes);

		System.out.println(animes);

		List<Double> numeros = new ArrayList<>();

		numeros.add(1.5);
		numeros.add(1.3);
		numeros.add(1.9);
		numeros.add(1.7);

		Collections.sort(numeros);

		System.out.println(numeros);






	}
}
