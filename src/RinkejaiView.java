import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class RinkejaiView {
    @ManagedProperty(value = "#{rinkejaiModel}")
    private RinkejaiModel rinkejaiModel;

    public void create() {
	rinkejaiModel.setRedaguojamasRinkejas(new Rinkejas());
    }

    public void update(Integer id) {
	rinkejaiModel.setRedaguojamasRinkejas(rinkejaiModel.searchRinkejasById(id));
    }

    public void delete(Integer id) {
	rinkejaiModel.getRinkejai().remove(rinkejaiModel.searchRinkejasById(id));
	rinkejaiModel.setRedaguojamasRinkejas(null);
	zinute("Rinkejas pasalintas");
    }

    public void cancel() {
	rinkejaiModel.setRedaguojamasRinkejas(null);
    }

    public void save() {
	Integer id = rinkejaiModel.getRedaguojamasRinkejas().getId();

	if (id != null) {
	    rinkejaiModel.searchRinkejasById(id)
		    .setAsmensKodas(rinkejaiModel.getRedaguojamasRinkejas().getAsmensKodas());
	    rinkejaiModel.searchRinkejasById(id).setVardas(rinkejaiModel.getRedaguojamasRinkejas().getVardas());
	    rinkejaiModel.searchRinkejasById(id).setPavarde(rinkejaiModel.getRedaguojamasRinkejas().getPavarde());
	    rinkejaiModel.searchRinkejasById(id).setTelNumeris(rinkejaiModel.getRedaguojamasRinkejas().getTelNumeris());
	    rinkejaiModel.searchRinkejasById(id).setAdresas(rinkejaiModel.getRedaguojamasRinkejas().getAdresas());
	    rinkejaiModel.searchRinkejasById(id).setGimimoData(rinkejaiModel.getRedaguojamasRinkejas().getGimimoData());

	    zinute("Rinkejo informacija atnaujinta");
	} else {
	    rinkejaiModel.getRedaguojamasRinkejas().setId(rinkejaiModel.getRinkejai().size());
	    rinkejaiModel.getRinkejai().add(rinkejaiModel.getRedaguojamasRinkejas());
	    zinute("Rinkejo duomenys prideti");
	}
    }

    protected void zinute(String zinute) {
	FacesMessage doneMessage = new FacesMessage(zinute);
	FacesContext.getCurrentInstance().addMessage(null, doneMessage);
    }

    public RinkejaiModel getRinkejaiModel() {
	return rinkejaiModel;
    }

    public void setRinkejaiModel(RinkejaiModel rinkejaiModel) {
	this.rinkejaiModel = rinkejaiModel;
    }

}
