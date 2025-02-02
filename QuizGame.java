import java.util.Scanner;

class Quiz {
    Scanner sc = new Scanner(System.in);
    int score = 0;

    void askQuestion(String question, String[] options, String correctAnswer, String explanation) {
        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Your Answer: ");
        String answer = sc.next();
        if (answer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("-----------------Congratulations! Your Answer Absolutely Correct-----------------!");
            score++;
        } else {
            System.out.println("Wrong! The Correct answer is (" + correctAnswer + ").");
        }
        System.out.println("Explanation:-\n" + explanation + "\n");
    }

    void indiaQuiz() {
        System.out.println("\nWelcome to Do You Know These Things About India Quiz!\n");
        String[][] questions = {
            {"Question 1: Which of the following was inscribed as the World Heritage City by UNESCO?", 
             "a) Jaipur", "b) Ahmedabad", "c) Delhi", "d) Hyderabad", 
             "b", "Ahmedabad was inscribed as the World Heritage City by UNESCO in July 2017."},
            {"Question 2: Who wrote Vande Mataram?", 
             "a) Bankim Chandra Chatterjee", "b) Rabindranath Tagore", "c) R D Burman", "d) Zaverchand Meghani", 
             "a", "Bankim Chandra Chatterjee wrote the national song Vande Mataram. It is a poem written in Sanskrit by Bankim Chandra Chatterjee in his Bengali novel Anandamath."},
            {"Question 3: Which Indian song has won Oscar?", 
             "a) Luka Chupi", "b) Natu Natu", "c) Jai Ho", "d) (b)&(c) both", 
             "d", "Jai Ho (2009) and Natu-Natu (2023) both won Oscar Awards for the category 'Best Original Song'."},
            {"Question 4: Which is currently the tallest statue in the world?", 
             "a) Statue of Unity", "b) Statue of Liberty", "c) BR Ambedkar", "d) Spring Temple Buddha", 
             "a", "Statue of Unity, dedicated to Sardar Vallabhbhai Patel, is the tallest statue in the world at 597 feet (182 meters)."},
            {"Question 5: Chandrayaan-3 made a historic landing on the moon on Which date?", 
             "a) 14 July, 2023", "b) 23 August, 2023", "c) 22 July, 2019", "d) 22 October, 2022", 
             "b", "Chandrayaan-3 made a historic landing on the moon on August 23, 2023."},
            {"Question 6: Which was India's First satellite?", 
             "a) Vikram", "b) Aditya", "c) MOM", "d) Aryabhata", 
             "d", "Aryabhata was India's first satellite, launched on April 19, 1975."},
            {"Question 7: Who was India's second Prime minister?", 
             "a) Jawaharlal Nehru", "b) Lal Bahadur Shastri", "c) Mohandas Gandhi", "d) Sardar Patel", 
             "b", "Lal Bahadur Shastri became India's second Prime Minister after Nehru's death."},
            {"Question 8: Who was India's First Lady Prime Minister?", 
             "a) Indira Gandhi", "b) Draupadi Murmu", "c) Pratibha Patil", "d) Smriti Irani", 
             "a", "Indira Gandhi was India's first female Prime Minister, serving from 1966 to 1977 and again from 1980 until her assassination in 1984."},
            {"Question 9: How Many Times Has India Won The ICC World Cup?(As of 2023)", 
             "a) 1", "b) 2", "c) 3", "d) 4", 
             "b", "India has won the Cricket World Cup twice, in 1983 and 2011."},
            {"Question 10: How Many Indians Have Won Miss World Beauty Pageants?", 
             "a) 3", "b) 4", "c) 5", "d) 6", 
             "d", "India has produced six Miss World titleholders: Reita Faria Powell (1966), Aishwarya Rai (1994), Diana Hayden (1997), Yukta Mookhey (1999), Priyanka Chopra (2000), and Manushi Chillar (2017)."}
        };
        for (String[] q : questions) {
            askQuestion(q[0], new String[]{q[1], q[2], q[3], q[4]}, q[5], q[6]);
        }
        System.out.println("Your final score is: " + score + "/10");
    }

    void generalKnowledge() {
        System.out.println("Welcome to the General Knowledge Quiz!");
        String[][] questions = {
            {"Question 1: What is the pH value of the human body?", 
             "a) 9.2 to 9.8", "b) 7.0 to 7.8", "c) 6.1 to 6.3", "d) 5.4 to 5.6", 
             "b", "The pH range of the human body is 7.0-7.8, depending on the part of the body."},
            {"Question 2: Elections to panchayats in state are regulated by", 
             "a) Gram panchayat", "b) Nagar Nigam", "c) Election Commission of India", "d) State Election Commission", 
             "d", "Elections to panchayats are regulated by the State Election Commission."},
            {"Question 3: Which of the given cities is located on the bank of river Ganga?", 
             "a) Patna", "b) Mathura", "c) Gwalior", "d) Bhopal", 
             "a", "Patna is located on the bank of the river Ganga."},
            {"Question 4: The driving force of an ecosystem is", 
             "a) Carbon Monooxide", "b) Biogas", "c) Solar Energy", "d) Carbon Dioxide", 
             "c", "Solar energy is the driving force of an ecosystem."},
            {"Question 5: Digestion of food in human beings begins in which part of the alimentary canal?", 
             "a) Liver", "b) Kidney", "c) Mouth", "d) Large intestine", 
             "c", "Digestion begins in the mouth when food is chewed."},
            {"Question 6: Which Vitamin is Soluble in Water?", 
             "a) A", "b) B", "c) C", "d) D", 
             "b", "Vitamin B complex and Vitamin C are water-soluble."},
            {"Question 7: Which of the following is a scalar quantity?", 
             "a) Force", "b) Pressure", "c) Momentum", "d) Acceleration", 
             "b", "Pressure is a scalar quantity as it has magnitude but no direction."},
            {"Question 8: Salt is obtained from sea water through which process.", 
             "a) Adsorption", "b) Evaporation", "c) Sublimation", "d) Absorption", 
             "b", "Salt is obtained from seawater through evaporation."},
            {"Question 9: Which of the given vitamins is responsible for blood clotting?", 
             "a) A", "b) B", "c) K", "d) D", 
             "c", "Vitamin K is responsible for blood clotting."},
            {"Question 10: The concept of gravity was discovered by which famous physicist?", 
             "a) Bhaskaracharya", "b) Aryabhatta", "c) Isaac Newton", "d) Albert Einstein", 
             "c", "Isaac Newton discovered gravity when he saw a falling apple."}
        };
        for (String[] q : questions) {
            askQuestion(q[0], new String[]{q[1], q[2], q[3], q[4]}, q[5], q[6]);
        }
        System.out.println("Your final score is: " + score + "/10");
    }

    void mathQuiz() {
        System.out.println("\nWelcome to Math Quiz!\n");
        String[][] questions = {
            {"Question 1: What is 555 + 555 + 123?", 
             "a) 1233", "b) 1103", "c) 1223", "d) 1123", 
             "a", "500+500+100+50+50=1200+10+23=1233"},
            {"Question 2: What is 15 times 12?", 
             "a) 162", "b) 164", "c) 172", "d) 180", 
             "d", "15*10=150+15+15=180"},
            {"Question 3: What is 5^3?", 
             "a) 15", "b) 125", "c) 75", "d) 8", 
             "b", "5*5*5=125"},
            {"Question 4: Subtract 54 from 693", 
             "a) 639", "b) 747", "c) 654", "d) 3742", 
             "a", "93-54=39=>ans=639"},
            {"Question 5: What is 1/4 written as a decimal?", 
             "a) 0.75", "b) 0.5", "c) 0.15", "d) 0.25", 
             "d", "100/4=25==>ans= 0.25"},
            {"Question 6: Find the median of the following data: 7, 9, 12, 13, 16", 
             "a) 10", "b) 11", "c) 12", "d) 9", 
             "c", "middle value is 12"},
            {"Question 7: What is 2500 divided by 2?", 
             "a) 1500", "b) 1250", "c) 2550", "d) 5000", 
             "b", "2400/2=1200+100/2=1250"},
            {"Question 8: What is three fifth of 100?", 
             "a) 60", "b) 30", "c) 20", "d) 50", 
             "a", "(3*100)/5 = 3*20=60"},
            {"Question 9: Which of the following is not an integer?", 
             "a) 123", "b) 0", "c) -43", "d) 2.6", 
             "d", "Integer is a whole number.It does not have decimal part"},
            {"Question 10: What is the missing number? 6 + (7 + 3) = (_ + 8) + 3", 
             "a) 6", "b) 5", "c) 3", "d) 7", 
             "b", "6+7+3=16 ==> 16-8-3=5"}
        };
        for (String[] q : questions) {
            askQuestion(q[0], new String[]{q[1], q[2], q[3], q[4]}, q[5], q[6]);
        }
        System.out.println("Your final score is: " + score + "/10");
    }

    void endQuiz() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Thank You! Hope You Enjoyed And Got Some Knowledge From Our Quiz!");
        System.out.println("-----------------------------------------------------------------");
    }
}

class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quiz q = new Quiz();
        System.out.print("Enter Your First Name: ");
        String firstName = sc.next();
        System.out.print("Enter Your Last Name: ");
        String lastName = sc.next();
        System.out.println("Your pin is 5380");
        String userid = firstName.toLowerCase() + lastName.toLowerCase() + "@gmail.com";
        System.out.println("Your id is: " + userid);
        System.out.print("Enter the four-digit pin: ");
        int password = sc.nextInt();
        if (password == 5380) {
            System.out.println("------Login Successful------");
            System.out.println("\nWelcome To Our Fun And Knowledgeable Quiz Game!\n");
            System.out.println("There are 3 Sections According to their difficulty in This Quiz Game\n");
            while (true) {
                System.out.println("1: Easy Level: Math Quiz \n2: Medium Level: Do You Know These Things About India \n3: Hard Level: General Knowledge \n4: Exit The Quiz\n");
                System.out.print("Enter Your Choice: ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1: q.mathQuiz(); q.endQuiz(); break;
                    case 2: q.indiaQuiz(); q.endQuiz(); break;
                    case 3: q.generalKnowledge(); q.endQuiz(); break;
                    case 4: System.out.println("Thank You For Using Our System"); return;
                    default: System.out.println("Invalid Choice. Please Enter Choice Between 1 to 4 Only!");
                }
            }
        } else {
            System.out.println("Sorry! Login Unsuccessful");
        }
    }
}
