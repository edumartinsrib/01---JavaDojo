package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class MangasSortTest01 {

	public static void main(String[] args) {
		List<Manga> mangasList = new ArrayList<>();

		mangasList.add(new Manga(5L, "Attack on titan", 19.9, 0));
		mangasList.add(new Manga(1L, "Berserk", 9.5, 0));
		mangasList.add(new Manga(4L, "Hellssing Ultimate", 3.2, 0));
		mangasList.add(new Manga(3L, "Pokemon", 11.20, 0));
		mangasList.add(new Manga(2L, "Dragon ball Z", 2.99, 0));
		mangasList.add(new Manga(6L, "Naruto", 27.8, 0));


		System.out.println("-- Ordem de inserção --");
		for (Manga manga : mangasList) {
			System.out.println(manga);
		}

		System.out.println("-- Ordem natural dos números - título --");

		mangasList.sort((m1, m2) -> m1.getNome().compareTo(m2.getNome()));

		for (Manga manga : mangasList) {
			System.out.println(manga);
		}

		System.out.println("-- Ordem natural dos números - id --");

		mangasList.sort((m1, m2) -> m1.getId().compareTo(m2.getId()));

		for (Manga manga : mangasList) {
			System.out.println(manga);
		}

		System.out.println("-- Ordem natural dos números - preço --");

		mangasList.sort((m1, m2) -> Double.compare(m1.getPreco(), m2.getPreco()));

		for (Manga manga : mangasList) {
			System.out.println(manga);
		}
	}

}


