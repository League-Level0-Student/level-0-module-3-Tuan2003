import javax.swing.JOptionPane;

public class horoScope {
public static void main(String[] args) {
String userInput = JOptionPane.showInputDialog("What is your star sign?");

String returnText;
	if(userInput.equalsIgnoreCase("aries")) {
	returnText = "Its a good day for settling work issues and focusing on your personal life, where you need to be honest.\r\n" + 
			"\r\n" + 
			"Uranus is the focus for strong energy in your house, coming from various sources. For you this makes it the perfect time to settle work issues so you can focus on your personal life a bit more. Be honest with yourself and be realistic. Being idealistic is good for your optimism, but it can back fire and bring you feelings of failure. Be modest in your outlook.";
		
	}
	else	if(userInput.equalsIgnoreCase("taurus")) {
	returnText = "With so many options today you should see your life as an adventure and be playful.\r\n" + 
			"\r\n" + 
			"Youll have so many options and opportunities today the problem is going to be deciding what to go for and what to leave alone. Employ your sense of adventure and see your life as a playground. You can choose to do anything right now and it will work out well. Your sense of adventure will help you to try new things out and to not be afraid of the unknown.";
	}
	else	if(userInput.equalsIgnoreCase("gemini")) {
		returnText = "Dont get annoyed when your plans are changed last minute today, this will be to your advantage.\r\n" + 
				"\r\n" + 
				"You may be annoyed when your plans are changed at the last minute today, but try to keep your emotions under control. If you can take a step back and prepare to be flexible youll see that this unexpected change will actually work out in your favour. Be ready to adapt to this last minute adjustment and there will be great advantages for you.";
		}
	else	if(userInput.equalsIgnoreCase("cancer")) {
		returnText = "Ignore those who try to bring you down today and keep going forward with your high energy.\r\n" + 
				"\r\n" + 
				"You have great energy and forward momentum today and you can get a lot done, but as always some people around you will be jealous and will seek to stand in your way. Ignore these people and dont let anyone talk you down, youre doing great. Keep looking forward and keep the people around you who support you and recognise your abilities.";
		}
	else	if(userInput.equalsIgnoreCase("leo")) {
		returnText = "Your usual great communication skills are boosted even more today, giving you top conversations skills.\r\n" + 
				"\r\n" + 
				"Energy is strong in your communication today, Leo, meaning you can have deep and meaningful conversations and get your point across in all areas of your life. You are a good communicator anyway, so this extra energy means youll also be able to persuade others over to your way of thinking. Use this energy well today and strive for better connections.";
		}
	else	if(userInput.equalsIgnoreCase("virgo")) {
		returnText = "Its a great day for love and romance and there will be opportunities for love for everyone today.\r\n" + 
				"\r\n" + 
				"Theres extra energy in your personal life today and its a great day for love and romance. Its especially strong for any single Virgos who have a high chance of finding someone special today. But whether you are single or in a relationship, keep an eye out of opportunities in your love life and be sure to take advantage of them.";
		}
	else	if(userInput.equalsIgnoreCase("libra")) {
		returnText = "When you feel like history is repeating itself today, stop and think before you react, it may not be.\r\n" + 
				"\r\n" + 
				"You will be in a situation today that will feel as if it is history repeating itself. You are ready to use the lessons youve learnt form the past, which is great, but before you do anything stop and take a closer look at the situation. This may not be the same situation as last time at all, or things may not be heading as they did before. Think before you react.";
		}
	else	if(userInput.equalsIgnoreCase("scorpio")) {
		returnText = "You dont yet have all the information about a situation at work, so dont make any decisions today.\r\n" + 
				"\r\n" + 
				"Dont make any decisions about a situation at work today, you dont have all the information yet. You might think you know whats going on, but you only have bits of information and gossip and hearsay to go on, and thats not the same as having all the facts. Wait this out, watch and see what happens, youll have all the knowledge about this soon.";
		}
	else	if(userInput.equalsIgnoreCase("sagittarius")) {
		returnText = "If you feel trapped in a role others created for you today, its not too late to change this.\r\n" + 
				"\r\n" + 
				"You may feel trapped in a certain area of your life today, because you feel you have to do things that others expect you to do rather than what you want to do. Although others may think they know whats best for you, the role you are playing right now isnt the real you. Its never too late to change and be who you want to be, you just need the courage to step forward.";
		}
	else if(userInput.equalsIgnoreCase("capricorn")) {
		returnText = "As the Moon enters your house today it will tone down your emotions so you can see clearly.\r\n" + 
				"\r\n" + 
				"The Moon enters Capricorn today, and it will help you to tone down the emotions you are displaying to all around you. These emotions are surface only and perhaps an expected reaction rather than the truth of how you feel. This will help you to see more clearly, without your emotions clouding your judgement, and youll recognise what needs doing.";
		}
	else	if(userInput.equalsIgnoreCase("aquarius")) {
		returnText = "Its time to move forward today and to view the past with distance and to put it in its place.\r\n" + 
				"\r\n" + 
				"Understand today that while you cant change the past you can change the way you view it and how you allow it to affect you. You are moving on from the past now, into a new and brighter future, and its time to deal with these demons once and for all. Claim your power back and put yourself in control by burying old wounds and moving on.";
		}
	else	if(userInput.equalsIgnoreCase("pisces")) {
		returnText = "Your dreams from last night hold the answer to what someone is feelings about you.\r\n" + 
				"\r\n" + 
				"The dreams you had last night will be very important to your day today, so write them down and study them. There are messages in your dreams, especially regarding the mystery of how someone feels about you. The answer to this is in your dreams but it may need to be decoded. Spend some time thinking through the symbolism and meanings of your dreams.";
		}else {
			returnText = "That is not a star sign!";
		}	
	
JOptionPane.showMessageDialog(null, returnText);
}
}
