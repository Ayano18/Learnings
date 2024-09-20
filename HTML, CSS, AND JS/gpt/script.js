const quizForm = document.getElementById("quiz-form");
const question = document.getElementById("question");
const options = document.querySelectorAll("input[type='radio'] + span");
const feedback = document.getElementById("feedback");

const questions = [	{		question: "What is the capital of France?",		options: ["Paris", "London", "Berlin", "Madrid"],
		answer: "Paris"
	},
	{
		question: "What is the largest country in the world?",
		options: ["Russia", "China", "USA", "Canada"],
		answer: "Russia"
	},
	{
		question: "What is the highest mountain in the world?",
		options: ["Mount Everest", "K2", "Kangchenjunga", "Lhotse"],
		answer: "Mount Everest"
	}
];

let currentQuestion = 0;
let score = 0;

function showQuestion() {
	const q = questions[currentQuestion];
	question.textContent = q.question;
	options[0].textContent = q.options[0];
	options[1].textContent = q.options[1];
	options[2].textContent = q.options[2];
	options[3].textContent = q.options[3];
    options[4].textContent = q.options[4];