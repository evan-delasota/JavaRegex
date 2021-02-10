import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
  public static void main(String[] args) {
    boolean matchFound;
    /*
    // First parameter is the regex pattern being used. so "C+" or "1[a-z]9"
    // Second parameter are reserved for flags, ex: Pattern.CASE_INSENSITIVE / .LITERAL / .UNICODE_CASE
    */
    Pattern pattern = Pattern.compile("w3Schools", Pattern.CASE_INSENSITIVE); 
    Matcher matcher = pattern.matcher("Visit W3Schools!");

    matchFound = matcher.find();

    if (matchFound) {
      System.out.println("Match has been found.\n");
    } else {
      System.out.println("Match hasn't been found\n");
    }
  }
}

// Meta Characters to be aware of:
// |        Finds a match for any one of the patterns separated by |, so dog | cat | fish
// .        Find just one instance of any character
// ^        Finds a match as the beginning of a string as in: ^Hello
// $        Finds a match at the end of the string as in: World$
// \d       Finds a digit
// \s       Finds a whitespace character
// \b    	  Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
// \\uxxxx   Find the Unicode character specified by the hexadecimal number xxxx

// Quantifiers
// n+       Matches any string that contains at least one n
// n*       Mathces any string that contains zero or more occurrences of n
// n?       Matches any string that caontains zero or one occurrences of n (Lazy regex)
// n{x}     Matches any string that contains a sequence of X n's
// n{x, y}  Matches any string that contains a sequence of X to Y n's
// n{x, }   Matches any string that contains a sequence of at least X n's
