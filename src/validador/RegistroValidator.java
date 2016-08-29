package validador;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class RegistroValidator implements Validator {
	
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {

		String email = (String) value;
		String regex = "R[0-9]+";  
		
		if (!email.matches(regex )) {
			FacesMessage message = new FacesMessage();
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
		//	message.setSummary("O Resgistro esta incorreto");
			message.setDetail("O Resgistro esta incorreto, deve ter R no inicio.");
			context.addMessage("cadastroAnimal:Registro", message);
			throw new ValidatorException(message);
		}
	}
}
