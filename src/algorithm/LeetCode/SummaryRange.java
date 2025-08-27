package algorithm.LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SummaryRange {
    List<String> ranges = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

    }

    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (i != nums.length -1 && nums[i] + i+1 == nums[i+1]) {
                continue;
            } else {
                if (i == nums.length - 1){
                    ranges.add(i + "");
                } else {
                    ranges.add(i + "->" + (i+1));
                }
            }
        }
        return ranges;
    }
}
