package com.strong.java.datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: strong
 * @since: 2024/3/29 23:07
 * @description:
 */
public class MostFrequentElement {
    public static int findMostFrequentElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        int mostFrequentElement = nums[0];
        int maxFrequency = 1;

        for (int num : nums) {
            //更新频率映射表
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);

            //更新最大频率和对应元素
            if (count > maxFrequency) {
                mostFrequentElement = num;
                maxFrequency = count;

            }

        }
        return mostFrequentElement;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int mostFrequent = findMostFrequentElement(nums1);
        System.out.println("出现次数最多的元素是：" + mostFrequent);
    }

}
