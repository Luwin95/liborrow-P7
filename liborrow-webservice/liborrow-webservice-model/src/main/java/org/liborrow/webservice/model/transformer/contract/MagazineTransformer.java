package org.liborrow.webservice.model.transformer.contract;

import java.util.Set;

import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.entities.Magazine;

public interface MagazineTransformer {

	MagazineDTO toMagazineDTO(Magazine magazine, boolean isParent, String classParentName);
	Set<MagazineDTO> toMagazinesDTO(Set<Magazine> magazines, boolean isParent, String classParentName);
}
