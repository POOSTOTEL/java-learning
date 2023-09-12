package semestr2homework3.services;

import semestr2homework3.models.User;

public class UserParser {
    static User parse(String line) {
        String[] words = line.split(", ");
        return new User(Integer.parseInt(words[0]), words[1]);
    }
}
