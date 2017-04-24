package io.abdo.EdiaApp.Text;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//Controller responsible for routing  http requests

@RestController
public class TextController {
	
	@Autowired
	private TextService textService;

	
	//declare end point for texts
	@RequestMapping("/texts")
	public  List<Text> getAllTexts(){
		return textService.getAllTexts();
	}
	
	//endpoint for adding text
	@RequestMapping(method=RequestMethod.POST, value="/texts")
	public void addTopic(@RequestBody Text text){
		textService.addText(text);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/texts/{id}")
	public void deleteText(@PathVariable String id){
		textService.deleteText(id);
	}
	
	
	
}
	
