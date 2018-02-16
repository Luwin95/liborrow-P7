package org.liborrow.webservice.model.transformer.contract;

import java.util.Set;

import org.liborrow.webservice.model.dto.UserDTO;
import org.liborrow.webservice.model.entities.UserAccount;

public interface UserAccountTransformer {
	UserDTO toUserDto(UserAccount user, boolean isParent, String classParentName);
	public Set<UserDTO> toUsersDTO(Set<UserAccount> users, boolean isParent, String classParentName);
	UserAccount toUserAccountEntity(UserDTO user, boolean isParent, String classParentName);
	public Set<UserAccount> toUsersAccountEntities(Set<UserDTO> users, boolean isParent, String classParentName);
}
