package io.abdo.EdiaApp.Text;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Text {
	
	@Id
	private String id;
	private String title;
	private String body;
	
	
	public Text(){
		
		
	}
	public Text(String id, String title, String body) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
	}
	
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

}
