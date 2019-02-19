package app;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import service.BanqueRMIService;


public class SreveurRMI {

	public static void main(String[] args) 
	{
		try 
		{	
			// creation de l'annuaire
			LocateRegistry.createRegistry(1234);
			
			// creation de l'obj
			BanqueRMIService od = new BanqueRMIService();
			
			//publication de l'obj od dans l'annuaire
			Naming.rebind("rmi://localhost:1234/BK", od);
			
			System.out.println("Serveur Demarre");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
