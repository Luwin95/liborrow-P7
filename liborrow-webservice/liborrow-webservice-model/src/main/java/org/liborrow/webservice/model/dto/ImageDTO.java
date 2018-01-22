package org.liborrow.webservice.model.dto;

public class ImageDTO {
	
	private long id;

	private String alt;
	
	private String path;
	
	private String title;
	
	public ImageDTO() {}
	
	public ImageDTO(String pAlt, String pPath, String pTitle) {
		this.alt = pAlt;
		this.path = pPath;
		this.title = pTitle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
