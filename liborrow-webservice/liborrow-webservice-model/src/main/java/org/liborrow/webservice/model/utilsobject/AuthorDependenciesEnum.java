package org.liborrow.webservice.model.utilsobject;

public enum AuthorDependenciesEnum {
	AUTHOR_BOOKS("author_books"),
	AUTHOR_CITIZENSHIPS("author_citizenships");
	
	private String name = "";
	
	private AuthorDependenciesEnum(String name) {
		this.name = name;
	}
	
	public String toString(){
	    return name;
	}
}
