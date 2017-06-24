package ru.rnikonorov.stringjoiner;

import com.sun.deploy.util.StringUtils;

import java.util.Collection;

/**
 * @author  Roman Nikonorov on 24.06.17.
 */
public class SampleStringUtilsJoin {
    static String processJoin (final Collection<String> collectionToJoin, final String delimiter) {
        return StringUtils.join(collectionToJoin, delimiter);
    }
}
