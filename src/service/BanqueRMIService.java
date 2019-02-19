package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import metier.Compte;

public class BanqueRMIService extends UnicastRemoteObject implements IBanqueRemote
{

	public BanqueRMIService() throws RemoteException 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double conversion(double mt) throws RemoteException {
		return mt*0.15;
	}

	@Override
	public Compte cunsulterCompte(int code) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
