package Application.AdapterPattern;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Info {
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;

}
