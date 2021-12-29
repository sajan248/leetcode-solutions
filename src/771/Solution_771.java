public class Solution_771 {
    public static int numJewelsInStones(String jewels, String stones) {
        int[] jewelsMap = new int[52];
        for(char c: jewels.toCharArray()){
            if(c>='a' && c<='z'){
                jewelsMap[c-'a'] = 1;
            }
            else{
                jewelsMap[26+(c-'A')] = 1;
            }
        }
        int ans = 0;
        for(char c: stones.toCharArray()){
            if(c>='a' && c<='z'){
                if(jewelsMap[c-'a']==1) ans++;
            }
            else{
                if(jewelsMap[26+(c-'A')]==1) ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int ans = numJewelsInStones(jewels,stones);
        System.out.println(ans);
    }
}