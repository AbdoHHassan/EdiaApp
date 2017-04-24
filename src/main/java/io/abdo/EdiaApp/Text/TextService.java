package io.abdo.EdiaApp.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TextService {
	
	@Autowired
	private TextRepository textRepository;
	
	public List<Text> getAllTexts(){
		//return topics;
		List<Text> texts = new ArrayList<>();
		//add elements to texts list // expression
		textRepository.findAll()
		.forEach(texts::add);
		return texts;
	}
	public Text getText(String id){
		return textRepository.findOne(id);
	}
	
public void addText(Text text){
	textRepository.save(text);
}


public void updateText(String id, Text text){
	textRepository.save(text);
}

public void deleteText(String id){
	textRepository.delete(id);
	}
}
