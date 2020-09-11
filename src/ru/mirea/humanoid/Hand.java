package ru.mirea.humanoid;

public class Hand {
    String handOrientation;

    public Hand(String handOrientation) {
        this.handOrientation = handOrientation;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handOrientation='" + handOrientation + '\'' +
                '}';
    }
}
