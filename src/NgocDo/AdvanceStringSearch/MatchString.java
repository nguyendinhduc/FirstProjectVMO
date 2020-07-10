package NgocDo.AdvanceStringSearch;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchString {
    public void findPattern( ItemInList item ){
        String searchString = "Namxx 300";

        String[] listSearch = searchString.split(" ");
        String matchString = item.getContent();
        System.out.println(matchString);
        for(String s: listSearch){
            String pattern = "";
            for(int i = 0; i < s.length(); i++) {
                pattern = pattern + Character.toString(s.charAt(i)) ;
                Pattern patternSearch = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
                Matcher matcher = patternSearch.matcher(matchString);
                boolean matchFound = matcher.find() ;
//                System.out.println(pattern+" "+matchFound);
                if(matchFound){
                    item.setPoint(item.getPoint()+1.0f);
                    System.out.println(item.getContent()+" "+item.getPoint());
                }
            }
        }

//        Pattern pattern = Pattern.compile("[w+|3+|s+|c+|h+|l+|s+]", Pattern.CASE_INSENSITIVE);
//        String matchString = "Visit W3Schools!";
//        Matcher matcher = pattern.matcher(matchString);
//        boolean matchFound = matcher.find() ;
//        if(matchFound){
//            System.out.println(matchString);
//        }else{
//            System.out.println("Not found");
//        }
    }


}
