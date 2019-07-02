package Mcq;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public class TestMcq {


    public static void main(String[] args) {
        Message.main(args);


    }
}

class Message {

    static void main(String [] args) {
        System.out.println("Welcome! " + args[1]);
    }
}