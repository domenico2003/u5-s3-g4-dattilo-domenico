package Application.chainOfResponsibilityPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ControllaStipendio {
	private ControllaStipendio next;

	public abstract void check(int stipendio);

	public void goNext(int stipendio) {
		if (this.getNext() != null) {
			next.check(stipendio);
		} else {
			System.out.println("SIAMO ARRIVATI A FINE");
		}
	}
}
