var container = $('div.container');
$('input#get').click(function(){
	$.ajax({
		type: 'GET',
		url:'http://localhost:8080/texts',
		dataType: 'json',
		success: function(data){
			$.each(data, function(index,item){
				$.each(item, function(key, value){
					container.append(key + ': ' +value+'</br>');
				}); 
				container.append('<br/></br>');
			});
					}
	});
})