package Application.AdapterPattern;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class UserData implements DataSource {
	private String nomeCompleto;
	private int eta;

	public UserData(DataSource ds) {
		this.nomeCompleto = ds.getNomeCompleto();
		this.eta = ds.getEta();
	}
}
