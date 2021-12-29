package model;

import com.opencsv.bean.CsvBindByPosition;
import java.util.Objects;
import utilities.Datos;

/**
 *
 * @author Grupo2
 */

public class Game {
	@CsvBindByPosition(position = 0)
	private String name;

	@CsvBindByPosition(position = 3)
	private String genre;

	@CsvBindByPosition(position = 1)
	private String platform;

	@CsvBindByPosition(position = 4)
	private String publisher;

	@CsvBindByPosition(position = 2)
	private String year;

	public Game() {
	}

	public Game(String name, String platform, String year, String genre, String publisher) {
		this.name = name;
		this.genre = genre;
		this.platform = platform;
		this.publisher = publisher;
		this.year = year;
	}

	public Game createGame() {
		try {
			this.name = Datos.recogeString("Introduce el nombre del Juego");
			this.platform = Datos.recogeString("Introduce la plataforma");
			this.year = Datos.recogeString("Introduce el a�o de publicaci�n");
			this.genre = Datos.recogeString("Introduce el g�nero");
			this.publisher = Datos.recogeString("Introduce el editor");
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", genre=" + genre + ", platform=" + platform + ", publisher=" + publisher
				+ ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genre, name, platform, publisher, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(genre, other.genre) && Objects.equals(name, other.name)
				&& Objects.equals(platform, other.platform) && Objects.equals(publisher, other.publisher)
				&& Objects.equals(year, other.year);
	}

}


