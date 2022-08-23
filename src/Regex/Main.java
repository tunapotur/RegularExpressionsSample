package Regex;

import java.util.regex.*;

public final class Main {
    public static void main(String[] args) {
        String articleToJournalAndSeries = "\\w+:\\w+,\\w+,\\w+ [\\w ]+";
        System.out.println(Pattern.matches(articleToJournalAndSeries, "TACO:tacotaco,2012,Great Architecture"));
        System.out.println(Pattern.matches(articleToJournalAndSeries, "TSE:abc2017,2017,Classes Methods and More"));
        System.out.println(Pattern.matches(articleToJournalAndSeries, "TSE:mvp2015,2015,Model Consistency"));
        System.out.println(Pattern.matches(articleToJournalAndSeries, "TSE:mvp2016,2016,Better Model Consistency"));
        System.out.println(Pattern.matches(articleToJournalAndSeries, "ICSA:rr2017,2017,Components still have no interfaces"));
        System.out.println(Pattern.matches(articleToJournalAndSeries, "ICSME:component2022,2022,Sorting Components"));
        System.out.println(Pattern.matches(articleToJournalAndSeries, "ICSME:evo22,2022,Software Evolution"));

    }
}
