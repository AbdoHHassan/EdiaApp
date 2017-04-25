package io.abdo.EdiaApp.Text;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Text {
	
	@Id
	private String id;
	private String title;
	private String body;

	Timestamp timestamp = new Timestamp(System.currentTimeMillis());

	private long added=timestamp.getTime();;
	
	
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
	public long getAdded() {
		return added;
	}
	public void setAdded(long added) {
		this.added = added;
	}

}
