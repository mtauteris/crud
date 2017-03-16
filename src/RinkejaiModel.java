import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class RinkejaiModel {
    private List<Rinkejas> rinkejai = new ArrayList<Rinkejas>();
    private Rinkejas redaguojamasRinkejas = null;

    public Rinkejas searchRinkejasById(int id) {
	Rinkejas foundRinkejas = null;
	for (Rinkejas rinkejas : rinkejai) {
	    if (rinkejas.getId().equals(id)) {
		foundRinkejas = rinkejas;
	    }
	}
	return foundRinkejas;
    }

    public List<Rinkejas> getRinkejai() {
	return rinkejai;
    }

    public void setRinkejai(List<Rinkejas> rinkejai) {
	this.rinkejai = rinkejai;
    }

    public Rinkejas getRedaguojamasRinkejas() {
	return redaguojamasRinkejas;
    }

    public void setRedaguojamasRinkejas(Rinkejas redaguojamasRinkejas) {
	this.redaguojamasRinkejas = redaguojamasRinkejas;
    }

}
