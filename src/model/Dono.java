package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="DONOS")
public class Dono implements Serializable{
	
	private static final long serialVersionUID = -4389930028651511687L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	@OneToOne
	private Animal animal;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	private String foto;
	
	public Dono() {
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "Dono [id=" + id + ", nome=" + nome + ", animal=" + animal + ", sexo=" + sexo + ", foto=" + foto + "]";
	}
	
	
}
