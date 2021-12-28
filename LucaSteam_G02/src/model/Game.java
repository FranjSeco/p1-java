package model;


import com.opencsv.bean.CsvBindByPosition;

import utilities.Datos;

/**
*
* @author Grupo2
*/

public class Game {
	
	@CsvBindByPosition(position = 0)
	private String name;
	
	@CsvBindByPosition(position = 1)
	private String genre;
	
	@CsvBindByPosition(position = 2)
	private String platform;
	
	@CsvBindByPosition(position = 3)
	private String publisher;
	
	@CsvBindByPosition(position = 4)
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
        this.genre =Datos.recogeString("Introduce el g�nero");
        this.platform=Datos.recogeString("Introduce la plataforma");
        this.publisher=Datos.recogeString("Introduce el editor");
        this.year = Datos.recogeInt("Introduce el a�o de publicaci�n");
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


}
