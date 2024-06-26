package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Comparator;
import java.util.Objects;


public class Smartphone {

	private String serialNumber;
	private String marca;

	public Smartphone(String serialNumber, String marca) {
		this.serialNumber = serialNumber;
		this.marca = marca;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Smartphone that = (Smartphone) o;

		if (!Objects.equals(serialNumber, that.serialNumber))
			return false;
		return Objects.equals(marca, that.marca);
	}

	@Override
	public int hashCode() {
		int result = serialNumber != null ? serialNumber.hashCode() : 0;
		result = 31 * result + (marca != null ? marca.hashCode() : 0);
		return result;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}


