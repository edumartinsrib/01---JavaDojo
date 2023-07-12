package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashSet;
import java.util.Set;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class SetTest01 {

	public static void main(String[] args) {
		Set<Manga> mangas = new HashSet<>();
		mangas.add(new Manga(5L, "Bersek", 19.9, 0));
		mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 5));
		mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
		mangas.add(new Manga(2L, "Pokemon", 5.2, 0));



		for (Manga manga : mangas) {
			System.out.println(manga);
		}
	}

	public static Set<Integer> criarSet() {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(10);
		set.add(8);
		set.add(7);
		set.add(6);
		return set;
	}
}
