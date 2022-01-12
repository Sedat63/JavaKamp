package Concrete;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPlayer(Player player) throws NumberFormatException, RemoteException {
		
		return false;
	}

}
