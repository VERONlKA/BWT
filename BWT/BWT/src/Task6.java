public class Task6 {
    public static void main(String[] args) {
        String original = "Анна";
        if (original.toLowerCase().equals(reverse(original))){
            System.out.println("Слово є палідромом");
        }else {
            System.out.println("Дане слово не є палідромом");
        }
    }
    public static String reverse (String str){
        String rev = "";
        String orig = str.replaceAll("\\s+", "").toLowerCase();
        char[] charStr = orig.toCharArray();
        for (int i = charStr.length-1; i>=0;i-- ){
            rev += charStr[i];
        }
        return rev;
    }
}
