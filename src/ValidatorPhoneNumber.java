import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("default.ValidatorPhoneNumber")
public class ValidatorPhoneNumber implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent component, Object value) throws ValidatorException {
	StringBuilder telefonoNumeris = new StringBuilder();
	String telefonoNumerisValue = value.toString();

	if ((!telefonoNumerisValue.startsWith("3", 0) || telefonoNumerisValue.length() != 11)) {
	    FacesMessage msg = new FacesMessage("Telefono numeris turi prasidėti 3");
	    msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	    throw new ValidatorException(msg);
	} else {
	    telefonoNumeris.append(telefonoNumerisValue);

	}
    }

}
