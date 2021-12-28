package data;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
//import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

//import model.Game;



public  class DataStock {
	
	
	
/*private Map<Integer, Game> gameStock;
	
	public DataStock() {
		gameStock = new HashMap<>();
	}
	
	public Map<Integer, Game> getGameStock(){
		return gameStock;
	}
	
	public void setGameStock(Map<Integer, Game> gameStock) {
		this.gameStock = gameStock;
	}
	*/
	
	
	public static void ReadData() {
		
		
		
		
		String fileName = "C:/Users/claud/git/p1-java/LucaSteam_G02/archivoFinal2.csv";
		
		//List<Game> gamesList;
		
			/*try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
	            List<String[]> r = reader.readAll();
	            r.forEach(x -> System.out.println(Arrays.toString(x)));
	        
				/*gamesList = new CsvToBeanBuilder(new FileReader(fileName))
				        .withType(Game.class)
				        .build()
				        .parse();
				
				 gamesList.forEach(System.out::println);*/	 
		  /*CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); // custom separator
		  try(CSVReader reader = new CSVReaderBuilder(
		          new FileReader(fileName))
		          .withCSVParser(csvParser)   // custom CSV parser
		          .withSkipLines(1)           // skip the first line, header info
		          .build()){
		      List<String[]> r = reader.readAll();
		      r.forEach(x -> System.out.println(Arrays.toString(x)));*/
		List<String[]> r;
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            r = reader.readAll();
            int listIndex = 0;
            for (String[] arrays : r) {
                System.out.println("\nString[" + listIndex++ + "] : " + Arrays.toString(arrays));

                int index = 0;
                for (String array : arrays) {
                    System.out.println(index++ + " : " + array);
                }
            }
        



        
				 
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Error");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (CsvException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			 
		
	
		
	}

	
	
	
}
	
	