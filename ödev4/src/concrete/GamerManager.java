package concrete;

import abstracts.BaseGamerManager;
import abstracts.GamerService;
import abstracts.ValidationService;
import entities.Gamer;

public class GamerManager extends BaseGamerManager implements GamerService {

	
	ValidationService validationService;
	
	public GamerManager(ValidationService validationService) {
		super();
		this.validationService=validationService;
	}
	
	public void add(Gamer gamer) {
		
		
	if(validationService.validation(gamer)) {
		super.save(gamer);
		System.out.println("Kaydedildi: " + gamer.getFirstName()+ gamer.getLastName());
		
	}else{
	    System.out.println("Basarisiz kayit");	
	}
	}
	public void delete(Gamer gamer) {
		System.out.println("Silindi: " + gamer.firstName+ gamer.lastName);
	}
	public void update(Gamer gamer) {
		System.out.println("Güncellendi: " + gamer.firstName+ gamer.lastName );
	}
	
	}
	
	

