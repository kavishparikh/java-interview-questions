import java.text.BreakIterator;
import java.util.Locale;
 
public class BreakParagraphToSentences {
    
    private static int count(BreakIterator bi, String source) {
        int counter = 0;
        bi.setText(source);
 
        int lastIndex = bi.first();
        while (lastIndex != BreakIterator.DONE) {
            int firstIndex = lastIndex;
            lastIndex = bi.next();
 
            if (lastIndex != BreakIterator.DONE) {
                String sentence = source.substring(firstIndex, lastIndex);
                System.out.println("sentence = " + sentence);
                counter++;
            }
        }
        return counter;
    }

    
    public static void main(String[] args) {
        String paragraph =
                "Line boundary analysis determines where a text " +
                "string can be broken when line-wrapping. The " +
                "mechanism correctly handles punctuation and " +
                "hyphenated words. Actual line breaking needs to " +
                "also consider the available line width and is " +
                "handled by higher-level software. ";

        String paragraph2 = 
                "This is how I tried to split a paragraph" + 
                " into a sentence. But, there is a problem." + 
                " My paragraph includes dates like Jan.13, 2014" + 
                ", words like U.S and numbers like 2.2. They all " + 
                "got splitted by the above code.";

        // The following method can also be tried 
        /****
        Pattern re = Pattern.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)", Pattern.MULTILINE | Pattern.COMMENTS);
        Matcher reMatcher = re.matcher(str);
        while (reMatcher.find()) {
            System.out.println(reMatcher.group());
        }
        ****/
 
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
 
        int sentences = count(iterator, paragraph2);
        System.out.println("Number of sentences: " + sentences);
    }
     
}