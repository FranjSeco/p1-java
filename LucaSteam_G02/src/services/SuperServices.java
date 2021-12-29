package services;

import java.io.FileReader;
import java.util.List;
import java.util.Set;

import com.opencsv.bean.CsvToBeanBuilder;

import data.DataStock;
import model.Game;
public class SuperServices {
	private DataStock listaJuegos= new DataStock();
	public Set<String> getGenre(){
		return listaJuegos.getGenre();
		
	}
	}
