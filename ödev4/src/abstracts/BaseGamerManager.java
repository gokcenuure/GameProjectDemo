package abstracts;

import entities.Gamer;

public class BaseGamerManager implements GamerService{

	@Override
	public void save(Gamer gamer) {
    System.out.println("Veritaban�na kaydedildi: " +gamer.firstName);
		
	}

	@Override
	public void delete(Gamer gamer) {
	    System.out.println("Veritab�n�ndan silindi: " +gamer.firstName);

		
	}

	@Override
	public void update(Gamer gamer) {
	    System.out.println("Bilgiler g�ncellendi: " +gamer.firstName);
		
	}

}
