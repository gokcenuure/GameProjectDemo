package main;



import java.util.Date;

import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.GamerManager;
import concrete.ShopManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
	Gamer gamer1=new Gamer(7,"Gökcenur","Ev",new Date(2000,12,25),"44500789922");
	
	Game game1=new Game(3,"oyun1",123);
	Game game2=new Game(4,"oyun2",234);

	Campaign campaign1=new Campaign(1,"kampanya1",40);
	Campaign campaign2=new Campaign(2,"kampanya2",30);

	GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
	
	gamerManager.add(gamer1);
	System.out.println("*******************************");
	
	GameManager gameManager=new GameManager();
	
	gameManager.add(game1);
	gameManager.add(game2);
	System.out.println("*******************************");

	CampaignManager campaignManager=new CampaignManager();
	
	campaignManager.add(campaign1);
	campaignManager.add(campaign2);
	System.out.println("*******************************");
   
	ShopManager shopManager=new ShopManager();
	
	shopManager.buy(gamer1, game1);
	shopManager.buy(gamer1, game2);
	System.out.println("*******************************");

	
	
	
	}

}
