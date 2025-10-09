//Daniel Alves - RM:251376
//Hernan Rodrigo - RM:251169
//Professora, eu tive que fazer uma série de alterações no application,properties, incluindo a definição da senha que uso no SQL da minha máquina e a definição da porta dinâmica dele.
//Foi a unica maneira na qual consegui fazer ele funcionar e peço desculpas se isso causar algum transtorno em qualquer teste que a senhora pretenda fazer.

package br.com.etec.cinehas.cinehas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinehasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinehasApplication.class, args);
	}
}
