package Application.AdapterPattern;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class UserDataAdapter implements DataSource {
	private Info info;

	public UserDataAdapter(Info in) {
		this.info = in;
	}

	@Override
	public String getNomeCompleto() {

		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {

		return Period.between(info.getDataDiNascita(), LocalDate.now()).getYears();
	}

}
