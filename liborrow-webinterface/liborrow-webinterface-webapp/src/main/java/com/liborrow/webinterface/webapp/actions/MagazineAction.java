package com.liborrow.webinterface.webapp.actions;

import com.liborrow.webinterface.generated.model.MagazineDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class MagazineAction extends AbstractAction {

	MagazineDTO magazine;
	private String idMagazine; 
	
    public String execute() throws Exception {
        magazine = getManagerFactory().getMagazineManager().getMagazineById(Integer.parseInt(idMagazine));
        return "success";
    }

	public String getIdMagazine() {
		return idMagazine;
	}

	public void setIdMagazine(String idMagazine) {
		this.idMagazine = idMagazine;
	}

	public MagazineDTO getMagazine() {
		return magazine;
	}
    
}
