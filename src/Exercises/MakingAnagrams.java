package Exercises;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {
    String a = "absdjkvuahdakejfnfauhdsaavasdlkj";
    String b = "djfladfhiawasdkjvalskufhafablsdkashlahdfa";
      //  System.out.println(makingAnagrams(a, b));
    public static int makingAnagrams(String s1, String s2) {
        // Write your code here
        Map<String, Integer> result = new HashMap<>();
        Map<String, Integer> result2 = new HashMap<>();
        int r = 0;
        for (int i = 0; i < s1.length(); i++) {
            String ch1 = s1.charAt(i) + "";
            result.put(ch1, result.containsKey(ch1) ? result.get(ch1) + 1 : 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            String ch2 = s2.charAt(i) + "";
            result2.put(ch2, result2.containsKey(ch2) ? result2.get(ch2) + 1 : 1);
        }

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (!result2.containsKey(entry.getKey())) {
                r+=entry.getValue();
            } else {
                r = (result2.get(entry.getKey()) != entry.getValue()) ? r + Math.abs(result2.get(entry.getKey()) - entry.getValue()) : r;
                result2.remove(entry.getKey());
            }
        }
        Integer r1 =result2.entrySet()
                .stream()
                .mapToInt(key -> key.getValue())
                .sum();

        return r + r1;
    }
}
