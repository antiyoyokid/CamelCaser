public class CamelCaser{
        public static String camelCase(String inputString){
//YourCodeHere

        if(inputString==null){
            throw new IllegalArgumentException(ErrorConstants.NULL_INPUT);
        }

        if(inputString.equals("")){
            return(inputString);
        }
        String lowercase = inputString.toLowerCase();
        if(lowercase.substring(0,1).equals(" ")){
            lowercase=lowercase.substring(1);
        }
        char[]arr=lowercase.toCharArray();
        StringBuffer sb=new StringBuffer();


        for(int i=0;i<arr.length;i++){
            if(!(Character.isLetter(arr[i])||Character.isDigit(arr[i])||Character.isWhitespace(arr[i]))){

                throw new IllegalArgumentException(ErrorConstants.INVALID_CHARACTER);
            }
            if(Character.isWhitespace(arr[i])){
                if(Character.isDigit(arr[i+1])){
                    throw new IllegalArgumentException(ErrorConstants.INVALID_FORMAT);
                }
                arr[i+1]= Character.toUpperCase(arr[i+1]);
            }
            if(arr[i]!= ' '){
                sb.append(arr[i]);

            }
        }
        String ha= sb.toString();
        return ha;
    }
}
