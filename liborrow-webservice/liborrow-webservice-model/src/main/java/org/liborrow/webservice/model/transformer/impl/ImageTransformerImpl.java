package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.ImageDTO;
import org.liborrow.webservice.model.entities.Image;
import org.liborrow.webservice.model.transformer.contract.ImageTransformer;

public class ImageTransformerImpl implements ImageTransformer {

	@Override
	public ImageDTO toImageDTO(Image image, boolean isParent, String classParentName) {
		ImageDTO imageTransformed = new ImageDTO();
		imageTransformed.setId(image.getId());
		imageTransformed.setAlt(image.getAlt());
		imageTransformed.setPath(image.getPath());
		imageTransformed.setTitle(image.getTitle());
		return imageTransformed;
	}
	
	@Override
	public Set<ImageDTO> toImagesDTO(Set<Image> images, boolean isParent, String classParentName) {
		Set<ImageDTO> imagesDTO = new HashSet<>();
		for(Image image : images)
		{
			imagesDTO.add(toImageDTO(image,isParent, classParentName));
		}
		return imagesDTO;
	}
	
	@Override
	public Image toImageEntity(ImageDTO image, boolean isParent, String classParentName) {
		Image imageTransformed = new Image();
		imageTransformed.setId(image.getId());
		imageTransformed.setAlt(image.getAlt());
		imageTransformed.setPath(image.getPath());
		imageTransformed.setTitle(image.getTitle());
		return imageTransformed;
	}
	
	@Override
	public Set<Image> toImagesEntities(Set<ImageDTO> images, boolean isParent, String classParentName) {
		Set<Image> imagesTransformed = new HashSet<>();
		for(ImageDTO image : images)
		{
			imagesTransformed.add(toImageEntity(image,isParent, classParentName));
		}
		return imagesTransformed;
	}
}
