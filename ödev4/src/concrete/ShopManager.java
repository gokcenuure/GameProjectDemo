package concrete;

import abstracts.ShopService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class ShopManager implements ShopService{

	@Override
	public void buy(Gamer gamer, Game game) {
	System.out.println(gamer.getFirstName() +gamer.getLastName() +"adli oyuncu"+game.getName()+
			"adli oyunu satin aldi"+ game.getPrice() +"ödedi");
		
	}

	@Override
	public void campaignBuy(Gamer gamer, Game game, Campaign campaign) {
		
		
	}
	

}
