package Exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GemStones {

    public static int gemstones(List<String> arr) {
        // Write your code here
        Map<String, Integer> result = new HashMap<>();
        String compare = arr.get(0);
        for (int i = 0; i < compare.length(); i++) {
            result.put(compare.charAt(i) + "", 0);
        }

        for (int i = 1; i < arr.size(); i++) {
            String word = arr.get(i);
            for (String key : result.keySet()) {
                if (word.indexOf(key) != -1) {
                    result.put(key, result.get(key) + 1);
                }
            }
        }

        Long r =result.entrySet()
                .stream()
                .filter(key -> key.getValue() + 1 == arr.size())
                .count();
        return  r.intValue();
    }

    /*
     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String arrItem = bufferedReader.readLine();
            arr.add(arrItem);
        }

        int result = gemstones(arr);

        System.out.println(String.valueOf(result));
    * */
}
