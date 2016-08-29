package managedbean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import model.Animal;

@ManagedBean
@SessionScoped
public class AnimalMB {
	private Animal animal = new Animal();
	private List<Animal> animais = new ArrayList<Animal>();

	public String adicionarAnimal() {
		animais.add(animal);

		// Cria um formatador de datas para o padrão dd/MM/yyyy.
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		/*
		 * Envia uma mensagem para a tela informando que foi cadastrado o
		 * contato.
		 */
		String msg = "Animal adicionado: " + " - " + animal.getRaca() + " - "
				+ df.format(animal.getDataNascimento());

		FacesMessage fm = new FacesMessage(msg);
		FacesContext.getCurrentInstance().addMessage("msg", fm);

		animal = new Animal();

		// Retorna para a página de entrada (index.xhtml).
		return "index";
	}

	public void mudaFoto(ValueChangeEvent event) {

		FacesContext context = FacesContext.getCurrentInstance();

		if ("Caos" == event.getNewValue()) {
			animal.setFoto("img/dogue_alemao.jpg");
			context.release();
		} else if ("Gatos" == event.getNewValue()) {
			animal.setFoto("img/gatos.jpg");
			context.release();
		} else if ("Passaros" == event.getNewValue()) {
			animal.setFoto("img/passaros.jpg");
			context.release();
		}
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

}
