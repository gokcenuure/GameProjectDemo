package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface ShopService {
	
   void buy(Gamer gamer, Game game);
  
   void campaignBuy(Gamer gamer, Game game, Campaign campaign);
   
   
}
