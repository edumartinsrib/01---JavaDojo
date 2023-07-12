package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements MangaComparator {
	private Long id;

	private String nome;

	private double preco;

	private int quantidade;

	public Manga(Long id, String nome, double preco, int quantidade) {
		Objects.requireNonNull(id, "id não pode ser null");
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Manga manga = (Manga) o;

		if (Double.compare(manga.preco, preco) != 0) return false;
		if (quantidade != manga.quantidade) return false;
		if (!id.equals(manga.id)) return false;
		return Objects.equals(nome, manga.nome);
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = id.hashCode();
		result = 31 * result + (nome != null ? nome.hashCode() : 0);
		temp = Double.doubleToLongBits(preco);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + quantidade;
		return result;
	}

	@Override
	public String toString() {
		return "Manga{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", preco=" + preco +
				'}';
	}

	@Override
	public int compare(Manga m1, Manga m2) {
		return m1.getNome().compareTo(m2.getNome());
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
