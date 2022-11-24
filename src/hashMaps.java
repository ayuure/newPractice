import java.util.HashMap;

public class hashMaps {
    public static void main(String[] args){
        HashMap<String, Integer> examsScores= new HashMap<String,Integer>();
        examsScores.put("Math", 75);
        examsScores.put("social Studies", 90);
        examsScores.put("english", 80);
        System.out.println(examsScores.toString());
        System.out.println(examsScores.get("english"));
        examsScores.putIfAbsent("Maths", 80);
        System.out.println(examsScores);
        examsScores.replace("english",40);
        System.out.println(examsScores);
        System.out.println(examsScores.getOrDefault("Religion", -1));
        //examsScores.clear();
        System.out.println(examsScores.size());
        //remove method to remove
        examsScores.remove("Maths");
        System.out.println(examsScores.toString());
        //check if a key is there;

        System.out.println(examsScores.containsKey("english"));
        System.out.println(examsScores.containsValue(Integer.valueOf(90)));

        examsScores.forEach((subject,score)->{
            System.out.println(subject+"-"+ score);
        });

        examsScores.forEach((subject, score)->{
            examsScores.replace(subject, score-10);
        });
        System.out.println(examsScores);
    }
}
