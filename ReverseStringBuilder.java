
public class ReverseString {

    public static void main(String[] args) {
        String reverseStringWithReference = getReverseWithReference("Pawan");
        System.out.println("withRefrence: "+reverseStringWithReference);

        String reverseStringWithoutReference = getReverseWithoutReference("Dhankher");
        System.out.println("withoutRefrence: "+reverseStringWithoutReference);


    }

    private static String getReverseWithReference(String reversibleString) {
        String reverseString = "";

        for (int i = 0; i < reversibleString.length(); i++) {
            String reverseCharPosition = reversibleString.substring(reversibleString.length() - i - 1, reversibleString.length() - i);
            reverseString += reverseCharPosition;
        }
        return reverseString;
    }


    private static String getReverseWithoutReference(String reversibleString) {
        String reverseString = "";

        StringBuffer buffer = new StringBuffer(reversibleString);
        buffer.reverse();

        return buffer.toString();
    }

}