import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Rinkejas {
    private Integer id;
    private String vardas;
    private String pavarde;
    private Long asmensKodas;
    private Long telNumeris;
    private String adresas;
    private Date gimimoData;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getVardas() {
	return vardas;
    }

    public void setVardas(String vardas) {
	this.vardas = vardas;
    }

    public String getPavarde() {
	return pavarde;
    }

    public void setPavarde(String pavarde) {
	this.pavarde = pavarde;
    }

    public Long getAsmensKodas() {
	return asmensKodas;
    }

    public void setAsmensKodas(Long asmensKodas) {
	this.asmensKodas = asmensKodas;
    }

    public Long getTelNumeris() {
	return telNumeris;
    }

    public void setTelNumeris(Long telNumeris) {
	this.telNumeris = telNumeris;
    }

    public String getAdresas() {
	return adresas;
    }

    public void setAdresas(String adresas) {
	this.adresas = adresas;
    }

    public Date getGimimoData() {
	return gimimoData;
    }

    public void setGimimoData(Date string) {
	this.gimimoData = string;
    }

}
