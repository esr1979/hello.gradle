package com.example.hellogradle;
import java.io.PrintStream;

public class HelloGradle {

    public static void main(String[] args) {

        print(System.out);

    }

    public static void print(PrintStream out) {

        out.print("Hello, Gradle!");

    }


}
