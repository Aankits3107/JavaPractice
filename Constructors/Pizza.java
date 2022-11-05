package Constructors;

public class Pizza {

    String braed;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.braed = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.braed = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce) {
        this.braed = bread;
        this.sauce = sauce;
    }

    Pizza(String bread) {
        this.braed = bread;
    }
}
