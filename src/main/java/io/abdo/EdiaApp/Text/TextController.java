package io.abdo.EdiaApp.Text;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
	
	@Autowired
	private TextService textService;

	@RequestMapping("/texts")
	public  List<Text> getAllTexts(){
		return textService.getAllTexts();
	}
	
	@RequestMapping("/texts/{id}")
	public Text getText(@PathVariable String id){
		return textService.getText(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/texts")
	public void addText(@RequestBody Text text){
		textService.addText(text);
		
		
	}
	@RequestMapping(method=RequestMethod.PUT, value="/texts/{id}")
	public void updateText(@RequestBody Text text, @PathVariable String id){
		textService.updateText(id, text);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/texts/{id}")
	public void deleteText(@PathVariable String id){
		 textService.deleteText(id);
	}
	
}
