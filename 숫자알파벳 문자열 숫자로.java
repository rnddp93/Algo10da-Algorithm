import java.util.ArrayList;
import java.util.List;

public class SolutionOfNumberAlphabetToStringAlphabet {
    public static void main(String[] args){

       System.out.println( solution("one4seveneight"));


    }

    public static int solution(String s) {
        List<String> numberList = new ArrayList<>();
        numberList.add("zero");
        numberList.add("one");
        numberList.add("two");
        numberList.add("three");
        numberList.add("four");
        numberList.add("five");
        numberList.add("six");
        numberList.add("seven");
        numberList.add("eight");
        numberList.add("nine");

        StringBuffer sb = new StringBuffer(s);
        int sLength = sb.length();
        for(int i = 0; i < sLength ; i++ ){
            if(47 < sb.charAt(i) && sb.charAt(i) < 59) continue;
            for(int j = 0; j < numberList.size() ; j++ ){
                if(sb.charAt(i) == numberList.get(j).charAt(0)){
                    if(sb.toString().substring(i,  i + numberList.get(j).length()).equals(numberList.get(j))){
                        sb = sb.delete(i, Math.min(sb.length() ,i + numberList.get(j).length()));
                        sb.insert(i,""+j);
                        sLength = sb.length();
                        break;
                    }else{
                        continue;
                    }

                };
            }
        }
        return Integer.valueOf(sb.toString());
        
        
    }    
}
