package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity (name = "Servidores")
@SequenceGenerator(name="servidor_seq", sequenceName="servidor_seq", allocationSize=1)
public class Servidores {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="_seq")
	private String name;
	
	private String telefone;
	
	private int ramal;
	
	private int sala;
	
	private String cargo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
}
