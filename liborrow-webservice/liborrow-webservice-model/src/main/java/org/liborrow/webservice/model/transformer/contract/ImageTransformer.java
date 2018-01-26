package org.liborrow.webservice.model.transformer.contract;

import java.util.Set;

import org.liborrow.webservice.model.dto.ImageDTO;
import org.liborrow.webservice.model.entities.Image;

public interface ImageTransformer {
	ImageDTO toImageDTO(Image image, boolean isParent, String classParentName);
	Set<ImageDTO> toImagesDTO(Set<Image> images, boolean isParent, String classParentName);
	Image toImageEntity(ImageDTO image, boolean isParent, String classParentName);
	Set<Image> toImagesEntities(Set<ImageDTO> images, boolean isParent, String classParentName);
}
