package Application.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements LibroStruttura {
	private int numeroPagine;
	private List<LibroStruttura> sezioneFiglia = new ArrayList<>();
	private List<LibroStruttura> sezioniPadre = new ArrayList<>();

	@Override
	public int GetNumeroPagine() {
		return this.numeroPagine;
	}

	public List<LibroStruttura> getSezioneFiglia() {
		return sezioneFiglia;
	}

	public List<LibroStruttura> getSezioniPadre() {
		return sezioniPadre;
	}

	@Override
	public void addSezioniPadre(LibroStruttura ls) {
		sezioniPadre.add(ls);

	}

	@Override
	public void addSezioneFiglia(LibroStruttura ls) {
		sezioneFiglia.add(ls);
		numeroPagine += ls.GetNumeroPagine();
	}

}
