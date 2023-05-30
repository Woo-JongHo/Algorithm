class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int count_x = 0;
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("x")) {
                String arr_x = arr[i].replace("x", "");
                if (arr_x.length() == 0) {
                    count_x = count_x + 1;
                } else {
                    count_x = count_x + Integer.parseInt(arr_x);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].contains("x") && !arr[i].equals("+")) {
                num = num + Integer.parseInt(arr[i]);
            }
        }

        if (num == 0) {
            if (count_x == 0) {
                return "0";
            } else if (count_x == 1) {
                return "x";
            } else {
                return count_x + "x";
            }
        } else {
            if (count_x == 0) {
                return Integer.toString(num);
            } else if (count_x == 1) {
                return "x + " + num;
            } else {
                return count_x + "x + " + num;
            }
        }
    }
}