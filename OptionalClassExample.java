package com.wiprotrain5;

import java.util.Optional;

class User {
    private String userName;

    // Constructor to initialize userName
    public User(String userName) {
        this.userName = userName;
    }

    // Getter method to return Optional of userName
    public Optional<String> getUserName() {
        return Optional.ofNullable(userName);
    }
}

public class OptionalClassExample {

    public static void main(String[] args) {
    	
        User user = new User("Anirudh");

        // Get the Optional object containing userName
        Optional<String> optionalUser = user.getUserName();

        // Check if the value is present and if it's equal to "Anirudh"
        if (optionalUser.isPresent() && optionalUser.get().equalsIgnoreCase("Anirudh")) {
            System.out.println("Name is equal to Anirudh");
        } else {
            System.out.println("Not same");
        }
    } // Closing brace for main method
} 