public class MoveHyphenToFront {
    public static String MoveHyphen(String str) {
        if (str == null) return null; // Check for null input

        StringBuilder hyphens = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '-') hyphens.append(ch); // Collect hyphens
            else result.append(ch);           // Collect other characters
        }
        return hyphens.append(result).toString(); // Combine and return result
    }

    public static void main(String[] args) {
        System.out.println(MoveHyphen("Move-Hyphens-to-Front")); // Output: "---MoveHyphenstoFront"
        System.out.println(MoveHyphen("String-Compare"));        // Output: "--StringCompare"
    }
}
