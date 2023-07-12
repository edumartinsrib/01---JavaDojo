package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Eduardo");
		nomes.add("DevDojo");


		for (String nome : nomes) {
			System.out.println(nome);
		}

		for (int i = 0; i < nomes.size(); i++) {
			System.out.println("Teste2-" + nomes.get(i));
		}

		nomes.remove("Eduardo");

		System.out.println(nomes);

	}
}
