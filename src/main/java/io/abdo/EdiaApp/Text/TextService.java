package io.abdo.EdiaApp.Text;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TextService {
	
	@Autowired
	private TextRepo textRepo;

	public List<Text> getAllTexts() {
		//return topics
		List<Text> texts = new ArrayList<>();
		//add elements to topics list
		textRepo.findAll()
		.forEach(texts::add);
		return texts;
		
	}

	public void addText(Text text) {
		textRepo.save(text);
		
	}

	public void deleteText(String id) {
		// TODO Auto-generated method stub
		
	}




}
