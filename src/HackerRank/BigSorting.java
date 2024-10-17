package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigSorting {

    public static List<String>bigSorting(List<String> unsorter){

        Collections.sort(unsorter, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b); // Compare lexicographically if lengths are equal
            } else {
                return Integer.compare(a.length(), b.length()); // Compare by length
            }
        });

        return unsorter;
    }
    public static void main(String[] args) {

    }
}
