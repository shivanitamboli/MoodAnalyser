package com.moodAnalyzer;

public class MoodAnalyser {
	public static String analyseMood(String message) {
		if (message.contains("sad"))
			return "sad";
		else
			return "Happy";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Mood Analyser");
		String message = "i am sad";
		System.out.println(analyseMood(message));
	}
}
