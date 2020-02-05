public class Runner {

    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 5));
        System.out.println(nearHundred(90));
        System.out.println(stringSplosion("hello"));
        System.out.println(helloName("Kate"));
        System.out.println(bobThere("hellothere"));
        System.out.println(gHappy("Matt"));
        int[] b = {4,5,6};
        System.out.println(sum3(nums = b));
        int[] a = {1,2,3};
        System.out.println(lucky13(nums = a ));
        System.out.println(cigarParty(5, true));
        System.out.println(noTeenSum(5,6,7));
    }



        public static boolean parrotTrouble ( boolean talking, int hour){
            if (hour < 7 && talking == true || hour > 20 && talking == true) {
                return true;
            } else {
                return false;
            }

        } //warmup

        public static boolean nearHundred(int n) {
            if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
                return true;
            } else {
                return false;
            }
        } //warmup

        public static String stringSplosion(String str) {
            String newStr = "";
            for (int i = 0; i < str.length() + 1; i++) {
                newStr += str.substring(0, i);
            }
            return newStr;
        } //warmup 2

        public static String helloName(String name) {
            String helloName = "Hello " + name + "!";
            return helloName;

        } //string1

        public static boolean bobThere(String str) {


            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")) {
                    return true;
                }
            }
            return false;
        } //string2

        public static boolean gHappy(String str) {
            boolean x = false;
            if (str.equals("")) {
                x = true;
            }

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.substring(i, i + 1).equals("g") && str.substring(i + 1, i + 2).equals("g")) {
                    x = true;
                }
            }
            return x;
        } //string3

        public static int sum3(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            return sum;
        } //array1

        public static boolean lucky13(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1 || nums[i] == 3) {
                    return false;
                }
            }
            return true;
        }//array2

        //array3

        public static boolean cigarParty(int cigars, boolean isWeekend) {
            if (isWeekend == false) {
                if (cigars >= 40 && cigars <= 60) {
                    return true;
                } else {
                    return false;
                }
            }
            if (isWeekend == true) {
                if (cigars >= 40) {
                    return true;
                } else {
                    return false;
                }
            }
            return true;
        } //logic1

        public static int noTeenSum(int a, int b, int c) {
            if (a >= 13 && a < 15 || a > 16 && a <= 19) {
                a = 0;
            }
            if (b >= 13 && b < 15 || b > 16 && b <= 19) {
                b = 0;
            }
            if (c >= 13 && c < 15 || c > 16 && c <= 19) {
                c = 0;
            }
            return a + b + c;
        } //logic2

}


