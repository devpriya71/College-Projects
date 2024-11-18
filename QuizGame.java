import java.util.*;
class Quiz{
	Scanner sc = new Scanner(System.in);
    void indiaQuiz(){
		int score = 0;
		System.out.println("\nWelcome to Do You Know These Things About India Quiz!\n");
		//Que-1
		System.out.println("Question 1: Which of the following was inscribed as the World Heritage City by UNESCO?");
		System.out.println("a) Jaipur  b) Ahmedabad  c) Delhi  d) Hyderabad ");
		System.out.print("Your Answer: ");
		String answer1 = sc.next();

		if (answer1.equalsIgnoreCase("b")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		} else {
			System.out.println("Wrong! The The Correct answer is (b).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Ahmedabad was inscribed as the World Heritage City by UNESCO July 2017.\n");
		//Que-2
		System.out.println("Question 2: Who wrote Vande Mataram?");
		System.out.println("a) Bankim Chandra Chatterjee b) Rabindranath Tagore  c) R D Burman d) Zaverchand Meghani ");
		System.out.print("Your Answer: ");
		String answer2 = sc.next();

		if (answer2.equalsIgnoreCase("a")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		} else {
			System.out.println("Wrong! The The Correct answer is (a).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Bankim Chandra Chatterjee wrote the national song Vande Mataram. It is a poem written in Sanskrit by Bankim\nChandra Chatterjee in his Bengali novel Anandamath. It later was made the National Song of our country.\n");
		//Que-3
		System.out.println("Question 3: Which Indian song has won Oscar? ");
		System.out.println("a) Luka Chupi b) Natu Natu c) Jai Ho d) (b)&(c) both ");
		System.out.print("Your Answer: ");
		String answer3 = sc.next();

		if (answer3.equalsIgnoreCase("d")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		} else {
			System.out.println("Wrong! The The Correct answer is (b)&(c) both.");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Jai Ho(2009)and Natu-Natu(2023) both won Oscar Award for the category 'Best Original Song'.\n");
		//Que-4
		System.out.println("Question 4: Which is currently the tallest statue in the world? ");
		System.out.println("a) Statue of Unity b) Statue of Liberty c) BR Ambedkar d) Spring Temple Buddha ");
		System.out.print("Your Answer: ");
		String answer4 = sc.next();

		if (answer4.equalsIgnoreCase("a")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		}else{
			System.out.println("Wrong! The The Correct answer is (a).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Statue of Unity, a monument dedicated to the politician Sardar Vallabhbhai Patel, one of the founders of\nmodern India. The sculpture is located in the province of Gujarat,next to the mouth of the Narmada River.\nAt a height of 597 feet(182 meters), it's currently the tallest statue in the world.\n");
		
		//Que-5
		System.out.println("Question 5: Chandrayaan-3 made a historic landing on the moon on Which date?");
		System.out.println("a) 14 July,2023 b) 23 August,2023 c) 22 July,2019 d) 22 October,2022 ");
		System.out.print("Your Answer: ");
		String answer5 = sc.next();

		if (answer5.equalsIgnoreCase("b")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		} else {
			System.out.println("Wrong! The The Correct answer is (b).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Chandrayaan-3 made a historic landing on the moon on August 23. The lander module,named Vikram, and the\nrover, Pragyan, touched down on the Shiva Shakti Point.\n");
		
		//Que-6
		System.out.println("Question 6: Which was India's First satellite?");
		System.out.println("a) Vikram b) Aditya c) MOM d) Aryabhata ");
		System.out.print("Your Answer: ");
		String answer6 = sc.next();

		if (answer6.equalsIgnoreCase("d")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		} else {
			System.out.println("Wrong! The The Correct answer is (d).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Aryabhata. The Aryabhata spacecraft, named after the famous Indian astronomer, was India's first satellite;\nit was completely designed and fabricated in India and launched by a Soviet Kosmos-3M rocket from Kapustin \nYar on April 19, 1975.\n");
		
		//Que-7
		System.out.println("Question 7: Who was India's second Prime minister?");
		System.out.println("a) Jawaharlal Nehru b) Lal Bahadur Shastri c) Mohandas Gandhi d) Sardar Patel ");
		System.out.print("Your Answer: ");
		String answer7 = sc.next();

		if (answer7.equalsIgnoreCase("b")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		} else {
			System.out.println("Wrong! The Correct answer is (b).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("After Nehru's death,Gulzarilal Nanda served as an Acting PM of India and then Lal Bahadur Shastri became \nthe 2nd PM of India.\n");
		
		//Que-8
		System.out.println("Question 8: Who was India's First Lady Prime Minister?");
		System.out.println("a) Indira Gandhi b) Draupadi Murmu c) Pratibha Patil d) Smriti Irani ");
		System.out.print("Your Answer: ");
		String answer8 = sc.next();

		if (answer8.equalsIgnoreCase("a")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		} else {
			System.out.println("Wrong! The The Correct answer is (a).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Indira Gandhi became India's first female head of government or Prime Minister.She served as Prime Minister\nfor three consecutive terms (1966-77) and a fourth term from 1980 until she was assassinated in 1984.\n");
		
		//Que-9
		System.out.println("Question 9: How Many Times Has India Won The ICC World Cup ");
		System.out.println("a) 1 b) 2 c) 3 d) 4 ");
		System.out.print("Your Answer: ");
		String answer9 = sc.next();

		if (answer9.equalsIgnoreCase("b")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		} else {
			System.out.println("Wrong! The The Correct answer is (b).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("India has won the Cricket World Cup twice, once in 1983 and then in 2011.India finished as runners-up in \n2003 and 2023.\n");
		
		//Que-10
		System.out.println("Question 10: How Many Indians Have Won Miss World Beauty Pageants?");
		System.out.println("a) 3 b) 4 c) 5 d) 6 ");
		System.out.print("Your Answer: ");
		String answer10 = sc.next();

		if (answer10.equalsIgnoreCase("d")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		} else {
			System.out.println("Wrong! The The Correct answer is (d).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("India has produced six Miss World titleholders. The first Indian to win the coveted crown was Reita Faria \nPowell in 1966, followed by Aishwarya Rai in 1994, Diana Hayden in 1997,Yukta Mookhey in 1999, Priyanka\nChopra in 2000, and Manushi Chillar in 2017.\n");
		System.out.println("Your final score is: " + score + "/10");
	}
	void generalKnowledge(){
		int score= 0;
		System.out.println("Welcome to the General Knowledge Quiz!");
		//Que-1
		System.out.println("Question 1: What is the pH value of the human body?");
		System.out.println("a) 9.2 to 9.8  b) 7.0 to 7.8  c) 6.1 to 6.3  d) 5.4 to 5.6 ");
		System.out.print("Your Answer: ");
		String answer1 = sc.next();

		if(answer1.equalsIgnoreCase("b")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		}else{
			System.out.println("Wrong! The The Correct answer is (b).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("The pH range of the human body under favorable conditions is 7.0-7.8. Usually,it depends on the part of \nthe body. Saliva is usually about 7.1 to 7.5, blood needs to be 7.35 to 7.45,stomach acid is 1.5 to 3.5, \nand urine can range from 4.6 to 8.0, depending on what you have been eating or drinking, and how much \nwater you have been drinking. pH is maintained in the body through three important mechanisms; respiratory \ncontrol, renal control, and buffer systems.\n");
		//Que-2
		System.out.println("Question 2: Elections to panchayats in state are regulated by");
		System.out.println("a) Gram panchayat  b) Nagar Nigam  c) Election Commission of India d) State Election Commission");
		System.out.print("Your Answer: ");
		String answer2 = sc.next();

		if(answer2.equalsIgnoreCase("d")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		}else{
			System.out.println("Wrong! The The Correct answer is (d).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Election to panchayats in the state are regulated by the State Election Commission. State Election \nCommissioner is the leader of the State Election Commission. He controls Local elections like Panchayats. \nHe's appointed by the governor of that state. State Election Commissioner is nominated by the Governor.\n");
		//Que-3
		System.out.println("Question 3: Which of the given cities is located on the bank of river Ganga?");
		System.out.println("a) Patna b) Mathura c) Gwalior d) Bhopal");
		System.out.print("Your Answer: ");
		String answer3 = sc.next();

		if(answer3.equalsIgnoreCase("a")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		}else{
			System.out.println("Wrong! The The Correct answer is (a).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Patna is located on the bank of river Ganga. Gwalior is located on the bank of the river Chambal. Bhopal\nis situated on the bank of the Indravati River. Mathura is situated on the bank of the river Yamuna.\n");
		//Que-4
		System.out.println("Question 4: The driving force of an ecosystem is");
		System.out.println("a) Carbon Monooxide b) Biogas c) Solar Energy d) Carbon Dioxide");
		System.out.print("Your Answer: ");
		String answer4 = sc.next();

		if(answer4.equalsIgnoreCase("c")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		}else{
			System.out.println("Wrong! The The Correct answer is (c).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Solar energy is the driving force of an ecosystem. Solar energy refers to the energy created by heat and \nsunlight. Solar power is produced when solar energy is converted into electricity.\n");
		//Que-5
		System.out.println("Question 5: Digestion of food in human beings begins in which part of the alimentary canal?");
		System.out.println("a) Liver b) Kidney c) Mouth d) Large intestine");
		System.out.print("Your Answer: ");
		String answer5 = sc.next();

		if(answer5.equalsIgnoreCase("c")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		}else{
			System.out.println("Wrong! The The Correct answer is (c).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("The digestion of food in human beings starts in the mouth when they chew. In other words, we can say that \ndigestion begins in the mouth before we have even taken the first bite. When we smell, see or think about \nthe food, our mouth will usually start salivating. When we take our first bite, this saliva mixes with the \nfood to help break it down so that our body can absorb it.\n");
		//Que-6
		System.out.println("Question 6:  Which Vitamin is Soluable in Water?");
		System.out.println("a) A b) B c) C d) D");
		System.out.print("Your Answer: ");
		String answer6 = sc.next();

		if(answer6.equalsIgnoreCase("b")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		}else{
			System.out.println("Wrong! The The Correct answer is (b).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Based on solubility, Vitamins are classified into two classes \nWater-soluble Vitamins - Usually, it includes Vitamin B complex and Vitamin C.\nFat-soluble Vitamins - Usually, it includes Vitamin A, D, E, and K.\n");
		//Que-7
		System.out.println("Question 7: Which of the following is a scalar quantity?");
		System.out.println("a) Force b) Pressure c) Momentum d) Acceleration");
		System.out.print("Your Answer: ");
		String answer7 = sc.next();

		if(answer7.equalsIgnoreCase("b")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		}else{
			System.out.println("Wrong! The Correct answer is (b).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("The pressure is a scalar quantity because it has magnitude but no direction associated with it. Pressure \nrefers to a perpendicular force applied per unit area on a surface. Force, momentum, and acceleration are \nvector quantity because they have magnitude as well as direction.\n");
		//Que-8
		System.out.println("Question 8: Salt is obtained from sea water through which process.");
		System.out.println("a) Adsorption b) Evaporation c) Sublimation d) Absorption");
		System.out.print("Your Answer: ");
		String answer8 = sc.next();

		if(answer8.equalsIgnoreCase("b")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		}else{
			System.out.println("Wrong! The Correct answer is (b).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Salt is obtained from sea water through the evaporation process. Evaporation refers to the process in which\nthe liquid changing into a vapor state. For example, evaporation is water turning into steam.\n");
		//Que-9
		System.out.println("Question 9: Which of the given vitamins is responsible for blood clotting?");
		System.out.println("a) A b) B c) K d) D");
		System.out.print("Your Answer: ");
		String answer9= sc.next();

		if(answer9.equalsIgnoreCase("c")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		}else{
			System.out.println("Wrong! The Correct answer is (c).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Vitamin K is responsible for blood clotting.\n");
		//Que-9
		System.out.println("Question 10: The concept of gravity was discovered by which famous physicist?");
		System.out.println("a) Bhaskaracharya b) Aryabhatta c) Isaac Newton d) Albert Einstein ");
		System.out.print("Your Answer: ");
		String answer10= sc.next();

		if(answer10.equalsIgnoreCase("c")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
			score++;
		}else{
			System.out.println("Wrong! The Correct answer is (c).");
		}
		System.out.println("\nExplaination:-");
		System.out.println("Sir Isaac Newton was an English mathematician and mathematician and physicist who lived from 1642-1727. \nThe legend is that Newton discovered Gravity when he saw a falling apple while thinking about the forces \nof nature.\n");
		System.out.println("Your final score is: " + score+ "/10");
	}
	void mathQuiz(){
		int score = 0;
		System.out.println("\nWelcome to Math Quiz!\n");
		//Que-1
		System.out.println("Question 1: What is 555 + 555 + 123?");
		System.out.println("a) 1233 b) 1103 c) 1223 d) 1123 ");
		System.out.print("Your Answer: ");
		String answer1 = sc.next();

		if (answer1.equalsIgnoreCase("a")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!\n");
			score++;
		} else {
			System.out.println("Wrong! The The Correct answer is (a).\n");
		}
		//Que-2
		System.out.println("Question 2: What is 15 times 12?");
		System.out.println("a) 162 b) 164 c) 172 d) 180 ");
		System.out.print("Your Answer: ");
		String answer2 = sc.next();

		if (answer2.equalsIgnoreCase("d")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!\n");
			score++;
		} else {
			System.out.println("Wrong! The Correct answer is (d).\n");
		}
		//Que-3
		System.out.println("Question 3: What is 5^3?");
		System.out.println("a) 15 b) 125 c) 75 d) 8 ");
		System.out.print("Your Answer: ");
		String answer3 = sc.next();

		if (answer3.equalsIgnoreCase("b")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!\n");
			score++;
		} else {
			System.out.println("Wrong! The Correct answer is (b).\n");
		}
		//Que-4
		System.out.println("Question 4: Subtract 54 from 693");
		System.out.println("a) 639 b) 747 c) 654 d) 3742 ");
		System.out.print("Your Answer: ");
		String answer4 = sc.next();

		if (answer4.equalsIgnoreCase("a")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!\n");
			score++;
		} else {
			System.out.println("Wrong! The Correct answer is (a).\n");
		}
		//Que-5
		System.out.println("Question 5: What is 1/4 written as a decimal?");
		System.out.println("a) 0.75 b) 0.5 c) 0.15 d) 0.25 ");
		System.out.print("Your Answer: ");
		String answer5 = sc.next();

		if (answer5.equalsIgnoreCase("d")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!\n");
			score++;
		} else {
			System.out.println("Wrong! The Correct answer is (d).\n");
		}
		//Que-6
		System.out.println("Question 6: Find the median of the following data: 7, 9, 12, 13, 16");
		System.out.println("a) 10 b) 11 c) 12 d) 9 ");
		System.out.print("Your Answer: ");
		String answer6 = sc.next();

		if (answer6.equalsIgnoreCase("c")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!\n");
			score++;
		} else {
			System.out.println("Wrong! The Correct answer is (c).\n");
		}
		//Que-7
		System.out.println("Question 7: What is 2500 divided by 2?");
		System.out.println("a) 1500 b) 1250 c) 2550 d) 5000 ");
		System.out.print("Your Answer: ");
		String answer7 = sc.next();

		if (answer7.equalsIgnoreCase("b")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!\n");
			score++;
		} else {
			System.out.println("Wrong! The Correct answer is (b).\n");
		}
		//Que-8
		System.out.println("Question 8: What is three fifth of 100?");
		System.out.println("a) 60 b) 30 c) 20 d) 50 ");
		System.out.print("Your Answer: ");
		String answer8 = sc.next();

		if (answer8.equalsIgnoreCase("a")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!\n");
			score++;
		} else {
			System.out.println("Wrong! The Correct answer is (a).\n");
		}
		//Que-9
		System.out.println("Question 9: Which of the following is not an integer?");
		System.out.println("a) 123 b) 0 c) -43 d) 2.6 ");
		System.out.print("Your Answer: ");
		String answer9 = sc.next();

		if (answer9.equalsIgnoreCase("d")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!\n");
			score++;
		} else {
			System.out.println("Wrong! The Correct answer is (d).\n");
		}
		//Que-10
		System.out.println("Question 10: What is the missing number? 6 + (7 + 3) = (_ + 8) + 3");
		System.out.println("a) 6 b) 5 c) 3 d) 7 ");
		System.out.print("Your Answer: ");
		String answer10 = sc.next();

		if (answer10.equalsIgnoreCase("b")) {
			System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!\n");
			score++;
		} else {
			System.out.println("Wrong! The Correct answer is (b).\n");
		}
		System.out.println("Your final score is: " + score + "/10");
	}
	void endQuiz(){
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Thank You!Hope You Enjoyed And Got Some Knowledge From Our Quiz!");
		System.out.println("-----------------------------------------------------------------");
	}
}
class QuizGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean b=true;
		Quiz q = new Quiz();
		System.out.print("Enter Your First Name:");
		String firstName = sc.next();
		System.out.print("Enter Your Last Name:");
		String lastName = sc.next();
		System.out.println("Your pin is 5380");
		String userid = firstName.toLowerCase()+lastName.toLowerCase()+"@gmail.com";
		System.out.println("Your id is: "+userid);
		System.out.print("Enter the four digit pin:");
		int password = sc.nextInt();
		int p = 5380;
		if(password==p){
			System.out.println("------Login Successful------");
			System.out.println("\nWelcome To Our Fun And Knowledgeable Quiz Game!\n");
			System.out.println("There are 3 Sections According to their difficulty in This Quiz Game\n");
			while(b){
				System.out.println("1: Easy Level: Math Quiz \n2: Medium Level: Do You Know These Things About India \n3: Hard Level: General Knowledge \n4: Exit The Quiz\n");
				System.out.print("Enter Your Choice: ");
				int ch = sc.nextInt();
				switch(ch){
					case 1: q.mathQuiz();
							q.endQuiz();break;
					case 2: q.indiaQuiz();
							q.endQuiz();break;
					case 3: q.generalKnowledge();
							q.endQuiz();break;
					case 4: System.out.println("Thank Your For Using Our System");b=false;break;
					default: System.out.println("Invalid Choice.Please Enter Choice Between 1 to 4 Only!");
				}
			}
		}else{
			System.out.println("Sorry! Login Unsuccessful");
		}
    }
}