package Application.compositePattern;

public interface LibroStruttura {

	public int GetNumeroPagine();

	void addSezioneFiglia(LibroStruttura ls);

	void addSezioniPadre(LibroStruttura ls);
}
