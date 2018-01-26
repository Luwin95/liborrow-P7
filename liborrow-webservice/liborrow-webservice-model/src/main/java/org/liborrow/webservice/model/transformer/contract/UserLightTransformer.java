package org.liborrow.webservice.model.transformer.contract;

import java.util.Set;

import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.entities.UserLight;

public interface UserLightTransformer {
	UserLightDTO toUserLightDto(UserLight user, boolean isParent, String classParentName);
	public Set<UserLightDTO> toUsersLightDTO(Set<UserLight> users, boolean isParent, String classParentName);
	UserLight toUserLightEntity(UserLightDTO user, boolean isParent, String classParentName);
	public Set<UserLight> toUsersLightEntities(Set<UserLightDTO> users, boolean isParent, String classParentName);
}
