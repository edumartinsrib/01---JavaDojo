package academy.devdojo.maratonajava.javacore.Xrerializacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestAluno {

	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno(1L, "Eduardo Martins", "123456");
			serializar(aluno);
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	private static void serializar(Aluno aluno) throws IOException {
		try {
			Path path = Paths.get("pasta/aluno.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path));
			objectOutputStream.writeObject(aluno);
			objectOutputStream.close();
			System.out.println(aluno);
		}
		catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	private static void deserializar() throws FileNotFoundException, IOException, ClassNotFoundException {
		Path path = Paths.get("pasta/aluno.ser");
		try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))) {
			Aluno aluno = (Aluno) objectInputStream.readObject();
			System.out.println(aluno);
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}

	}
}
