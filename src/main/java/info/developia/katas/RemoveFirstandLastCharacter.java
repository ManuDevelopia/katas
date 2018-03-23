package info.developia.katas;

class Katas8kyu {

    // Remove First and Last Character
    // Sub string could be anice idea too!!!
    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder result = new StringBuilder(str);

        result.deleteCharAt(str.length()-1);
        result.deleteCharAt(0);

        return result.toString();
    }

    // Find the missing letter
    public static char findMissingLetter(char[] array)
    {
        return array[array.length-1]++;
    }
}
