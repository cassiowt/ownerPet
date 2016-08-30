package managedbean;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Dono;

@ManagedBean
@SessionScoped
public class DonoMB {
	
	private Dono dono;
	private ArrayList<Dono> donos;
	
	public DonoMB() {
		
	}
	
	public Dono getDono() {
		return dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	
	

}
