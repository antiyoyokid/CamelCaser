public class CamelCaser{
        public static String camelCase(String inputString){


        if(inputString==null){ //Getting the specifications out of the way
            throw new IllegalArgumentException(ErrorConstants.NULL_INPUT);
        }

        if(inputString.equals("")){ //Getting those edge cases out of the way
            return(inputString); //returns if empty string is sent in
        }
        String lowercase = inputString.toLowerCase(); //converting everything to lower case so that CAPS never bothers me
        while(lowercase.substring(0,1).equals(" ")){ //if space if the first thing the user inputs, it breaks my code. Now it doesn't
            lowercase=lowercase.substring(0+1); //ignore it and start from whenever its not a space
        }
        char[]arr=lowercase.toCharArray(); //take everything to char array
        StringBuffer sb=new StringBuffer(); //easier to fix bufferStrings according to StackExchange


        for(int i=0;i<arr.length;i++){
            if(!(Character.isLetter(arr[i])||Character.isDigit(arr[i])||Character.isWhitespace(arr[i]))){

                throw new IllegalArgumentException(ErrorConstants.INVALID_CHARACTER); //exception for bad input
            }
            if(Character.isWhitespace(arr[i])){
                if(Character.isDigit(arr[i+1])){ //makes sure words don't start with numbers
                    throw new IllegalArgumentException(ErrorConstants.INVALID_FORMAT);
                }
                arr[i+1]= Character.toUpperCase(arr[i+1]); //changes the letter to Uppercase
            }
            if(arr[i]!= ' '){
                sb.append(arr[i]); //joins the word together if there is space

            }
        }
        String ha= sb.toString(); //converts it back to a string, because strings are cool
        return ha; //returns the the string
    }
}
