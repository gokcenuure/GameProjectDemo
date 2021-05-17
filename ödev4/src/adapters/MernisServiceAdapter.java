package adapters;

import java.rmi.RemoteException;

import abstracts.ValidationService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ValidationService{

	@Override
	public boolean validation(Gamer gamer) {
		
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		 try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName(),
					  gamer.getLastName(), gamer.getDateOfBirth().getYear());
		 
		 } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
		
		
	}

}
