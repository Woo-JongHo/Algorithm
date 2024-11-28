import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        
        
        // 중복 신고는 안되니까 Key: 신고자, Value: 신고한 ID로 구분한다
        HashMap<String, List<String>> reportlist = new HashMap<>();

        // 중복 신고 고려한 신고 목록 만들기
        for (String id : report) {
            String[] parts = id.split(" ");
            String reporter = parts[0];
            String reported = parts[1];

            if (!reportlist.containsKey(reported)) {
                reportlist.put(reported, new ArrayList<>());
            }

            if (!reportlist.get(reported).contains(reporter)) {
                reportlist.get(reported).add(reporter);
            }
            
        }

        // 결과 계산
        for (String reported : reportlist.keySet()) {
            List<String> reporters = reportlist.get(reported);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    int index = getIndex(id_list, reporter);
                    answer[index]++;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < id_list.length; i++) {
            System.out.println(id_list[i] + ": " + answer[i]);
        }

        return answer;
    }

    private int getIndex(String[] id_list, String name) {
        for (int i = 0; i < id_list.length; i++) {
            if (id_list[i].equals(name)) {
                return i;
            }
        }
        return -1; // Not found
    }
}