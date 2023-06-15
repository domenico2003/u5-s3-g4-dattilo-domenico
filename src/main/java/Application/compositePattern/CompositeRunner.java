package Application.compositePattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CompositeRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("######################### COMPOSITE #########################");

		Pagina pagina1 = new Pagina();
		Pagina pagina2 = new Pagina();
		Pagina pagina3 = new Pagina();
		Pagina pagina4 = new Pagina();
		Pagina pagina5 = new Pagina();
		Pagina pagina6 = new Pagina();

		Sezione sezione1 = new Sezione();
		Sezione sezione2 = new Sezione();
		Sezione sezione3 = new Sezione();

		pagina1.addSezioniPadre(sezione1);
		pagina2.addSezioniPadre(sezione1);
		pagina3.addSezioniPadre(sezione2);
		pagina4.addSezioniPadre(sezione2);
		pagina5.addSezioniPadre(sezione3);
		pagina6.addSezioniPadre(sezione3);

		sezione1.addSezioneFiglia(pagina1);
		sezione1.addSezioneFiglia(pagina2);
		sezione2.addSezioneFiglia(pagina3);
		sezione2.addSezioneFiglia(pagina4);
		sezione3.addSezioneFiglia(pagina5);
		sezione3.addSezioneFiglia(pagina6);

		Sezione sp1 = new Sezione();
		sezione1.addSezioniPadre(sp1);
		sezione2.addSezioniPadre(sp1);

		sp1.addSezioneFiglia(sezione2);
		sp1.addSezioneFiglia(sezione1);

		Libro libro = new Libro();

		sp1.addSezioniPadre(libro);
		sezione3.addSezioniPadre(libro);

		libro.addSezioneFiglia(sp1);
		libro.addSezioneFiglia(sezione3);

		System.out.println("pagine libro: ");
		System.out.println(libro.GetNumeroPagine());

		System.out.println("pagine sotto-sezioni: ");
		libro.getSezioneFiglia().forEach(sezioni -> System.out.println(sezioni.GetNumeroPagine()));

	}

}
