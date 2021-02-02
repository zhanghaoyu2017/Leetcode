package com.hiasenna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Q46
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/5-15:57
 * @Version 1.0
 **/
public class Q46 {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(res, list, nums);
        return res;
    }

    // if 满足结束条件:
//     result.add(路径)
//     return
//
//  for 选择 in 选择列表:
//    做选择
//    backtrack(路径, 选择列表)
//    撤销选择
    public void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
                backtrack(res, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }

    public void dfs(List<List<Integer>> res, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                dfs(res, list, nums);
                list.remove(list.size() - 1);
            }
        }
//        Map<Integer,Integer> map = new HashMap<>();
//        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
//            entry.getKey();
//            entry.getValue();
//        }

    }
}
