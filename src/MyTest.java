public class MyTest{

    public static void main(String[] args) {
        String s = "()";
        System.out.println(compareTheBrackets(s));

        String s1 = "[]";
        System.out.println(compareTheBrackets(s1));

        String s2 = "{}";
        System.out.println(compareTheBrackets(s2));

        String s3 = "(]";
        System.out.println(compareTheBrackets(s3));

        String s4 = "([{})]";
        System.out.println(compareTheBrackets(s4));

        String s5 = "{[()]}";
        System.out.println(compareTheBrackets(s5));

        String s6 = "{[(){}]()}";
        System.out.println(compareTheBrackets(s6));

        String s7 = "{[{(}{)}]()}";
        System.out.println(compareTheBrackets(s7));
    }

    private static String compareTheBrackets(String str) {
        int len = str.length();

        if(len > 1) {
            Boolean flag = true;
            String newStr = str;

            while(flag) {
                String oriStr = newStr;
                newStr = myReplaceStr(newStr);

//				System.out.println(newStr);

                if(oriStr.equals(newStr) || newStr.length() < 2)
                    flag = false;
            }

            return newStr.length() == 0 ? "true" : "false";
        } else {
            return "false";
        }
    }


    private static String myReplaceStr(String str) {
        String newStr = str.replace("[]", "").replace("()", "").replace("{}", "");

        return newStr;
    }
}



