package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity (name = "Veiculos")
@SequenceGenerator(name="veiculos_seq", sequenceName="veiculos_seq", allocationSize=1)
public class Veiculos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="veiculos_seq")
	private String tipo;
	
	private String modelo;
	
	private String fabricante;
	
	private String placa;
	
	private String cor;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}

