package com.thoughtworks.tdd;

public class FizzBuzz {
    public String fizzBuzz(int i) {
        StringBuilder sb = new StringBuilder();
        if (i % 3 == 0) {
            sb.append("Fizz");
        }
        if (i % 5 == 0) {
            sb.append("Buzz");
        }
        if (i % 7 == 0) {
            sb.append("Whizz");
        }
        if (sb.length() == 0) {
            sb.append(i);
        }
        return sb.toString();
    }
}
