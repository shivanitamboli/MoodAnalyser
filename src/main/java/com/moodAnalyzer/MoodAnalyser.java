package com.moodAnalyzer;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.contains("sad"))
				return "sad";
			else
				return "Happy";
		} catch (NullPointerException exception) {
			return "Happy";
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Mood Analyser");

	}
}
