package abstracts;

import entities.Gamer;

public class BaseGamerManager implements GamerService{

	@Override
	public void save(Gamer gamer) {
    System.out.println("Veritabanýna kaydedildi: " +gamer.firstName);
		
	}

	@Override
	public void delete(Gamer gamer) {
	    System.out.println("Veritabýnýndan silindi: " +gamer.firstName);

		
	}

	@Override
	public void update(Gamer gamer) {
	    System.out.println("Bilgiler güncellendi: " +gamer.firstName);
		
	}

}
