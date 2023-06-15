package Application.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Libro implements LibroStruttura {
	private int numeroPagine;
	private List<LibroStruttura> sezioneFiglia = new ArrayList<>();
	private List<String> autori = new ArrayList<>();

	@Override
	public int GetNumeroPagine() {
		return this.numeroPagine;
	}

	public void addautori(String au) {
		autori.add(au);
	}

	public List<LibroStruttura> getSezioneFiglia() {
		return sezioneFiglia;
	}

	public List<String> getAutori() {
		return autori;
	}

	@Override
	public void addSezioniPadre(LibroStruttura ls) {
	}

	@Override
	public void addSezioneFiglia(LibroStruttura ls) {
		sezioneFiglia.add(ls);
		numeroPagine += ls.GetNumeroPagine();

	}

}
