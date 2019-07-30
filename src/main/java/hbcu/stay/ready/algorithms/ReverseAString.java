package hbcu.stay.ready.algorithms;

public class ReverseAString {

    public String reverseAString(String input){

        int x = 0;
        int y = input.length() - 1;

        while(x != y){

            char firstLetter = input.charAt(x);
            char secondLetter = input.charAt(y);

            input = input.substring(0,x) + Character.toLowerCase(secondLetter) + input.substring(x+1);
            input = input.substring(0,y) + Character.toLowerCase(firstLetter) + input.substring(y+1);

            x++;
            y--;
        }




        return capatalizeString(input);
    }

    private static String capatalizeString(String input){
        input = input.substring(0,1).toUpperCase() + input.substring(1);
        for (int i = 1; i < input.length(); i++){
            if(input.charAt(i) == ' '){
                input = input.substring(0,i) + " " + input.substring(i+1, i+2).toUpperCase() + input.substring(i+2);
            }
        }
        return input;
    }


}
