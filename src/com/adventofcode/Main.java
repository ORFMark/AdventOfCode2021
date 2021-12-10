package com.adventofcode;

import problems.Problem;
import problems.dayone.SonarSweepPart1;
import problems.dayone.SonarSweepPart2;
import problems.daythree.BinaryDiagnosticPart1;
import problems.daythree.BinaryDiagnosticPart2;
import problems.daytwo.DivePart1;
import problems.daytwo.DivePart2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Problem> problemList = new LinkedList<>();
    List<String> inputList = new LinkedList<>();
    try {
        inputList.add(readInputFromFile("ProblemInput/Day1SonarSweep/SonarSweep.txt"));
        inputList.add(readInputFromFile("ProblemInput/Day1SonarSweep/SonarSweep.txt"));
        inputList.add(readInputFromFile("ProblemInput/Day2Dive/Dive.txt"));
        inputList.add(readInputFromFile("ProblemInput/Day2Dive/Dive.txt"));
        inputList.add(readInputFromFile("ProblemInput/Day3BinaryDiagnostic/BinaryDiagnostic.txt"));
        inputList.add(readInputFromFile("ProblemInput/Day3BinaryDiagnostic/BinaryDiagnostic.txt"));
    } catch (Exception e) {
        System.out.println("Invalid File Path! Can't read input");
        return;
    }
    problemList.add(new SonarSweepPart1());
    problemList.add(new SonarSweepPart2());
    problemList.add(new DivePart1());
    problemList.add(new DivePart2());
    problemList.add(new BinaryDiagnosticPart1());
    problemList.add(new BinaryDiagnosticPart2());
    int dayNumber = 0;
    for (Problem prob : problemList) {
        System.out.printf("Day %d Part %d: ", (dayNumber/2) +1, (dayNumber % 2) + 1);
        System.out.println(prob.run(inputList.get(0)));

        inputList.remove(0);
        dayNumber++;
    }

    }

    public static String readInputFromFile(String filePath) throws IOException {
        FileInputStream in = new FileInputStream(filePath);
        String input = null;
        try {
            input = new String(in.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
        }

        return input;
    }
}

