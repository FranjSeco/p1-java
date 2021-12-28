package services;

import java.io.FileReader;
import java.util.List;


import com.opencsv.bean.CsvToBeanBuilder;

import model.Game;
public class SuperServices {
	public static void dataReader() {
		try {
		List<Game> beans=new CsvToBeanBuilder<Game>(new FileReader("C:\\Users\\alumno\\git\\p1-java\\LucaSteam_G02\\src\\services\\archivoFinal2.csv"))
				.withType(Game.class).build().parse();
		beans.forEach(System.out::println);
		}catch(Exception e) {
			System.out.println("error: "+e.toString());
		}
	}
}
