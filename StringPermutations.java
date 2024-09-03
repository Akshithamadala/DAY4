public class StringPermutations {
    public static void permute(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), ans + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        permute("abc", "");
    }
}
