package org.liborrow.webservice.model.utilsobject;

import java.util.Date;

public class BookCriterias {
	private String title;
	private String editor;
	private Date release;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public Date getRelease() {
		return release;
	}
	public void setRelease(Date release) {
		this.release = release;
	}
	
}
