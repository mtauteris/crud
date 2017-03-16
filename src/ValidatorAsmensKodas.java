import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("default.ValidatorAsmensKodas")
public class ValidatorAsmensKodas implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent component, Object value) throws ValidatorException {
	StringBuilder asmensKodas = new StringBuilder();
	String asmensKodasValue = value.toString();

	if ((asmensKodasValue.startsWith("4", 0)) || (asmensKodasValue.startsWith("3", 0))) {
	    asmensKodas.append(asmensKodasValue);
	} else {
	    FacesMessage msg = new FacesMessage("Asmens kodas turi prasidėti 4 arba 3");
	    msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	    throw new ValidatorException(msg);
	}
	if (asmensKodasValue.length() != 11) {
	    FacesMessage msg = new FacesMessage("Asmens turi susidėti iš 11 skaitmenų");
	    msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	    throw new ValidatorException(msg);
	}

    }

}
