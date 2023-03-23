import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int start = 0;
        System.out.println(start);
        for (int i = 0; i < haystackArr.length && needleArr[0] == haystackArr[i]; i++) {
                System.out.println(start);
                start = haystackArr[i];
            System.out.println(start);
                System.out.println(haystackArr[i]);
        }
        System.out.println(start);
        for (int i = start; i > needleArr.length ; i++) {
            if (needleArr[i] == haystackArr[i]){
                System.out.println(haystackArr[i]);
                return start;
            }
        }
       return -1;
    }
}
