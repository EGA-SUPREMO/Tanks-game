package qef.statmayin;

import qef.statmayin.statj.agordjMenu.AgordjMenu;
import qef.statmayin.statj.butikMenu.ButikMenu;
import qef.statmayin.statj.elektLudantjnmenu.ElektLudantjnmenu;
import qef.statmayin.statj.komencLudMenu.KomencLudMenu;
import qef.statmayin.statj.komencMenu.KomencMenu;
import qef.statmayin.statj.lud.Ludperant;
import qef.statmayin.statj.yargxLudMenu.YargxLudMenu;

public class Statperant {
	
	private Statlud[] statj;
	private Statlud nunStat;
	
	public Statperant() {
		ekStatj();
		definNunStatn();
	}

	private void ekStatj() {
		statj = new Statlud[8];
		statj[0] = new KomencMenu();
		statj[2] = new Ludperant();
		statj[3] = new KomencLudMenu();
		statj[4] = new YargxLudMenu();
		statj[5] = new AgordjMenu();
		statj[6] = new ElektLudantjnmenu((KomencLudMenu) statj[3]);
		statj[7] = new ButikMenu();
	}
	
	private void definNunStatn() {
		nunStat = statj[2];
	}

	public void yangxNunStatn(final int posici) {
		nunStat = statj[posici];
	}
	
	public void yangxNunStatn() {
		nunStat = statj[nunStat.nunStat()];
	}

	public Statlud nunStatn() {
		return nunStat;
	}
	
	public boolean qStatludn() {
		return nunStat == statj[2];
	}
	public boolean qStatButikMenun() {
		return nunStat == statj[7];
	}
	
	public void gxisdatig() {
		nunStat.gxisdatig();
	}
	
	public void desegn() {
		nunStat.desegn();
	}
	
}