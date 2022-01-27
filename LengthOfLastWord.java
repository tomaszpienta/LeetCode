public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        char[] chars = s.toCharArray();
        int cout = 0;
        for (int i = s.length(); i-- > 0; ) {
            if ((int) chars[i] != 32) {
                cout++;
            }
            if ((int) chars[i] == 32 && cout > 1) {
                break;
            }
        }
        return cout;
    }

    public static void main(String[] args) {
//        new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  "));
    }
}
