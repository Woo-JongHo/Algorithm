class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String temp = "";
        int[] arr = new int[3];
        int idx = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                temp += c;
            } else {
                if (!temp.isEmpty()) {
                    arr[idx] = (int) Math.pow(Integer.parseInt(temp), 1);
                    idx++;
                    temp = "";
                }

                switch (c) {
                    case 'S':
                        break;
                    case 'D':
                        arr[idx - 1] = (int) Math.pow(arr[idx - 1], 2);
                        break;
                    case 'T':
                        arr[idx - 1] = (int) Math.pow(arr[idx - 1], 3);
                        break;
                    case '*':
                        arr[idx - 1] *= 2;
                        if (idx > 1) {
                            arr[idx - 2] *= 2;
                        }
                        break;
                    case '#':
                        arr[idx - 1] *= -1;
                        break;
                }
            }
        }

        for (int score : arr) {
            answer += score;
        }

        return answer;
    }
}