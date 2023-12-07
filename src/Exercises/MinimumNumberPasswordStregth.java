package Exercises;

public class MinimumNumberPasswordStregth {

    public static int minimumNumber(int n, String password) {
        String  numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        // Return the minimum number of characters to make the password strong
        int remaining=4;
        boolean lower = false, num = false ,upper = false,spec= false,len=false;

        for (int i = 0; i < password.length() ; i++) {
            String ch= password.charAt(i)+"";

            if(!num && numbers.indexOf(ch) != -1 )
            {
                num=true;
                remaining--;
            }
            if(!lower && lower_case.indexOf(ch) != -1 )
            {
                lower=true;
                remaining--;
            }

            if(!upper && upper_case.indexOf(ch) != -1 )
            {
                upper=true;
                remaining--;
            }
            if(!spec && special_characters.indexOf(ch) != -1 )
            {
                spec=true;
                remaining--;
            }
        }

        if(password.length() < 6 && remaining + password.length() < 6){

            remaining += 6 - (remaining + password.length()) ;
        }


        return remaining;
    }
}
