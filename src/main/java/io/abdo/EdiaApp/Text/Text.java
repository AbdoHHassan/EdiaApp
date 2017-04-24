package io.abdo.EdiaApp.Text;

import javax.persistence.Entity;
import javax.persistence.Id;


//Entity object which maps to the database, with two data members, their getters and setters.

@Entity
public class Text {
	
	@Id 
	public static int GlobalId=0;
	private int id;
	private String title;
	private String text;
	
	public Text(){
		this.id= GlobalId++;
	} 
	
	public Text(String title,String text){
		super();
		this.id = GlobalId++;
		this.title= title;
		this.text= text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	};
	
	
	
	
	
}
