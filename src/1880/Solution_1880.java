public class Solution_1880 {
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int fl = firstWord.length();
        int sl = secondWord.length();
        int tl = targetWord.length();
        int fn = wordToNum(fl, firstWord);
        int sn = wordToNum(sl, secondWord);
        int tn = wordToNum(tl, targetWord);
        return tn==(fn+sn);
    }

    public static int wordToNum(int l, String s){
        int n = 0;
        int i = 0;
        while(i<l){
            n += (s.charAt(i)-'a')*Math.pow(10, (l-1-i));
            i++;
        }
        return n;
    }

    public static void main(String[] args){
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";
        System.out.println(isSumEqual(firstWord,secondWord,targetWord));
    }
}

