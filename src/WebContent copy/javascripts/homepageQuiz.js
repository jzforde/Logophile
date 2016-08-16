
var words = ['oeuvre', 'nostomania', 'frigorific', 'vespertide', 'bovarism', 'apocryphal',
'chiaroscuro','rufescent','clowder','gossamer','hoyden','comeuppance'];
	var w = window.innerWidth;
	var h = window.innerHeight;
	var padding = 50;
	var minX = padding, maxX = w - padding;
	var minY = padding, maxY = h - padding;

$(document).ready(function () {
		var b = document.getElementById("button");
		b.style.visibility = "visible";
		$("#button").addClass('hvr-pulse-grow').addClass('fadeInUp').css("visibility","visible");
		wordPlacement();
    }); 

var wordPlacement = function(){
	var initDelay=0;
	for(var i = 0; i < words.length; i ++){
		//todo while loop
		var coordinates = getRandomCoordinates();
		var word = document.createElement('span');
		word.style.display = "none";
		word.className="animatedWords";
		word.style.font="30px 'Open Sans', sans-serif";
		word.style.position = 'absolute';
		word.style.zIndex = '0';
		word.style.color = "#686868";
		word.id = words[i];
		word.innerHTML = words[i];
		document.body.appendChild(word);
		word.style.left= coordinates.Xcoordinate + 'px';
		word.style.top= coordinates.Ycoordinate + 'px';
		var wordId = "#" + words[i];
		
		$(wordId).delay(initDelay).fadeIn(1000).delay(2000).fadeOut(1000);
		initDelay+=1000;
		
	}
	
}

var getRandomCoordinates = function () {
	var coordinates = {};
		coordinates.Xcoordinate = Math.random() * (maxX - minX) + minX;
		coordinates.Ycoordinate = Math.random() * (maxY - minY) + minY;
		return coordinates;
}





/*Fade in word animated functionality
	-Function B will call function A to animate them. Appear and then disappear.  
*/
