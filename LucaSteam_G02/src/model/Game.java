package model;


import java.util.Objects;

import utilities.Datos;

import com.opencsv.bean.CsvBindByName;

/**
*
* @author Grupo2
*/

public class Game {
	@CsvBindByName(column="name")
private String name;
	@CsvBindByName(column="genre")
private String genre;
	@CsvBindByName(column="platform")
private String platform;
	@CsvBindByName(column="publisher")
private String publisher;
	@CsvBindByName(column="year")
private int year;

public Game() {
}

public Game(String name,String genre,String platform,String publisher,int year) {
	this.name=name;
	this.genre=genre;
	this.platform=platform;
	this.publisher=publisher;
	this.year=year;
}

public Game createGame() {
	try {
        this.name =Datos.recogeString("Introduce el nombre del Juego");
        this.genre =Datos.recogeString("Introduce el género");
        this.platform=Datos.recogeString("Introduce la plataforma");
        this.publisher=Datos.recogeString("Introduce el editor");
        this.year = Datos.recogeInt("Introduce el año de publicación");
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
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "Game [name=" + name + ", genre=" + genre + ", platform=" + platform + ", publisher=" + publisher + ", year="
			+ year + "]";
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
			&& year == other.year;
}



}
