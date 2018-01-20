package org.liborrow.webservice.model.transformer.contract;

import java.util.Set;

import org.liborrow.webservice.model.dto.CitizenshipDTO;
import org.liborrow.webservice.model.entities.Citizenship;

public interface CitizenshipTransformer {

	CitizenshipDTO toCitizenshipDTO(Citizenship citizenship, boolean isParent, String classParentName);
	Set<CitizenshipDTO> toCitizenshipsDTO(Set<Citizenship> citizenships, boolean isParent, String classParentName);
}
