package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;


class SmartphoneComparator implements Comparator<Smartphone> {
	@Override
	public int compare(Smartphone o1, Smartphone o2) {
		return o1.getMarca().compareTo(o2.getMarca());
	}
}

class MangaPrecoComparator implements Comparator<Manga> {
	@Override
	public int compare(Manga o1, Manga o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}
}
public class NavigableSetTest01 {

	public static void main(String[] args) {
		NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneComparator());
		Smartphone smartphone = new Smartphone("1ABC1", "iPhone");
		Smartphone smartphone2 = new Smartphone("22222", "Pixel");
		Smartphone smartphone3 = new Smartphone("33333", "Samsung");
		Smartphone smartphone4 = new Smartphone("44444", "Sony");
		set.add(smartphone);
		set.add(smartphone2);
		set.add(smartphone3);
		set.add(smartphone4);
		for (Smartphone smartphone5 : set.descendingSet()) {
			System.out.println(smartphone5);
		}
		NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
		mangas.add(new Manga(5L, "Bersek", 19.9, 0));
		mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 5));
		mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
		mangas.add(new Manga(2L, "Pokemon", 5.2, 0));
		mangas.add(new Manga(3L, "Attack on titan", 11.20, 2));
		mangas.add(new Manga(6L, "Dragon ball Z", 2.99, 0));
		mangas.add(new Manga(7L, "Naruto", 3.50, 0));


		Manga mangaFloor = mangas.floor(new Manga(3L, "One piece", 19.9, 10));
		System.out.println(mangaFloor);
		System.out.println(mangas.lower(new Manga(3L, "One piece", 19.9, 10)));
		System.out.println(mangas.higher(new Manga(3L, "One piece", 12.9, 10)));
		System.out.println(mangas.ceiling(new Manga(3L, "One piece", 19.9, 10)));
		System.out.println(mangas.pollFirst());
		System.out.println(mangas.pollLast());
		for (Manga manga : mangas) {
			System.out.println(manga);
		}
	}
}
