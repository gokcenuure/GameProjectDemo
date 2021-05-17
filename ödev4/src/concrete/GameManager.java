package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	
	public void add(Game game) {
		System.out.println("Eklendi: " +game.getName());
	}
	public void delete(Game game) {
		System.out.println("Silindi: " +game.getName());
	}
	public void update(Game game) {
		System.out.println("Güncellendi: " +game.getName());
}
}