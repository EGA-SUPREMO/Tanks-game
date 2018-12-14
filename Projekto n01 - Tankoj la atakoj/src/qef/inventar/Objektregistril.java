package qef.inventar;

import qef.Konstantj;
import qef.inventar.armil.Pistol;
import qef.inventar.konsumeblezh.Konsumeblezh;

public class Objektregistril {

	public static Objekt objektjn(final int id) {
		
		switch(id) {
			case 0://-----------------------------------0-499 nur konsumeblajxoj-------------------------------------
				return new Konsumeblezh(id, "a", "");
			case 1:
				return new Konsumeblezh(id, "b", "");
			case 2:
				return new Konsumeblezh(id, "d", "");
			case 500:
				return new Pistol(id, "Acxajxo", "Pistolacxo", 10, 5, false, 0.3,
						Konstantj.ITENER_SONJ_LUDANT + "pom.wav");
			default:
				return new Konsumeblezh(id, "z", "");
		}
		
	}
	
}
