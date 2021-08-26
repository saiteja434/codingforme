package modern.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public final class Strings9 {

    private Strings9() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static String joinByDelimiterV1(char delimiter, String... args) {

        if (args == null || args.length == 0) {
            // or throw IllegalArgumentException
            return "";
        }

        StringBuilder result = new StringBuilder();

        int i = 0;
        for (i = 0; i < args.length - 1; i++) {
            result.append(args[i]).append(delimiter);
        }

        result.append(args[i]);

        return result.toString();
    }

    public static String joinByDelimiterV2(char delimiter, String... args) {

        if (args == null || args.length == 0) {
            // or throw IllegalArgumentException
            return "";
        }
        int[] intArray={1,8,2,9};
        //String Array Declarations
        String[] strArr= {"Raju","Bheem","Kumar"};
        String[]namesArr= new String[]{"kumaru","prevaen","pallem"};
        
        
        List<String>nameList=Arrays.asList("sai","teja","gundapu");
        //List.of("Sai","Teja","Gundam");
        String joined=Arrays.stream(namesArr).collect(Collectors.joining("-"));
        System.out.println(joined);
        
        return Arrays.stream(args, 0, args.length)
                .collect(Collectors.joining(String.valueOf(delimiter)));
    }

    public static String joinByDelimiterV3(char delimiter, String... args) {
        
        if (args == null || args.length == 0) {
            // or throw IllegalArgumentException
            return "";
        }

        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));

        for (String arg : args) {
            joiner.add(arg);
        }

        return joiner.toString();
    }
}
