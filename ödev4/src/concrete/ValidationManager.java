package concrete;

import abstracts.ValidationService;
import entities.Gamer;

public class ValidationManager implements ValidationService{

	@Override
	public boolean validation(Gamer gamer) {
		
		return true;
	}

}
