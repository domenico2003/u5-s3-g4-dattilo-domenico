package Application.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Pagina implements LibroStruttura {
	private int numeroPagine = 1;

	private List<LibroStruttura> sezioniPadre = new ArrayList<>();

	@Override
	public int GetNumeroPagine() {
		return this.numeroPagine;
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

	}

}
