package org.liborrow.webservice.model.xmladapter;

import java.util.Set;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.hibernate.collection.internal.PersistentSet;
import org.liborrow.webservice.model.entities.Author;

public class AuthorSetXmlAdapter extends XmlAdapter<Set<Author>, Set<Author>> {
	@Override
	public Set<Author> marshal(Set<Author> value) throws Exception {
		//PersistentSet is the Hibernate's implementation of Set that handle Lazy-loading etc...
        if (value instanceof PersistentSet) {
            PersistentSet hibernateCollection = (PersistentSet) value;

            //If the data were already loaded you return the collection 
            return hibernateCollection.wasInitialized() ? value : null;
        } else
            return value;
	}
	
	@Override
	public Set<Author> unmarshal(Set<Author> value) throws Exception {
		// TODO Auto-generated method stub
		return value;
	}

}
