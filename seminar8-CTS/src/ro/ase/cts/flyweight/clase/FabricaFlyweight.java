package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {

	private Map<String, FlyWeightAbstract> clienti;

	public FabricaFlyweight() {
		this.clienti = new HashMap<String, FlyWeightAbstract>();
	}
	
	public FlyWeightAbstract getClient(String nrTel) {
		Client client = (Client) clienti.get(nrTel);
		if(client == null)
		{
			client = new Client("X",nrTel,"x@gmail.com");
			clienti.put(nrTel, (FlyWeightAbstract) client);
		}
		return (FlyWeightAbstract) client;
	}
}