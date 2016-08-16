var questions = {
	qaArray: [{
		question: 'To prance or jump around excitedly',
		answer: 'cavort',
		options: ['cavort', 'obsolesence', 'definiens', 'shivaree']
	},
	 {
		question: 'To increase in size or intensity',
		answer: 'aggrandize',
		options: ['telesthesia', 'aggrandize', 'oxter', 'agog']
	},
	{
		question: 'Mediocre or ordinary',
		answer: 'middling',
		options: ['gainsay', 'moonbow', 'middling', 'quidnunc']
	},
	{
		question: 'Narrow and rigid in opinion',
		answer: 'hidebound',
		options: ['blithe', 'cynosure', 'syzygy', 'hidebound']
	},
	{
		question: 'To emit a harsh, grating sound',
		answer: 'scroop',
		options: ['scroop', 'bucolic', 'pifle', 'aver']
	}],
	getUserAnswers: function() {
		var userAnswers = [];
		for (i = 0; i < qaArray.length; i ++){
			var selectedAnswer = prompt("Question # " + i + ":" + qaArray[i].question);
			userAnswers.push(selectedAnswer);
		}
		return userAnswers;
	}
	

	//push userAnswer into array. 
}

