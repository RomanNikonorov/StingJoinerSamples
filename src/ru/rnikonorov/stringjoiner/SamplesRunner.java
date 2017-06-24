package ru.rnikonorov.stringjoiner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Roman Nikonorov on 24.06.17.
 *         StringJoiner Samples
 * @see java.util.StringJoiner
 */
public class SamplesRunner {

    public static void main(final String args[]) {
        final List<String> stringsToJoin =
                new ArrayList<>(Arrays.asList("First string", "Second string", "Third string"));
        final String delimiter = ", ";

        System.out.println("Old-style \"for\" result: " + SampleFor.processJoin(stringsToJoin,delimiter));
        System.out.println("StringJoiner result: " + SampleStringJoiner.processJoin(stringsToJoin,delimiter));
        System.out.println("StringUtils join result: " + SampleStringUtilsJoin.processJoin(stringsToJoin,delimiter));
    }
}
