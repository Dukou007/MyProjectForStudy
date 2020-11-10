package com.jettech.main;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : dukou_caiqin@163.com
 * @date: 2020/11/11  5:23
 * @description: java List去除重复数据的五种方式
 */
public class RemoveTheSame {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        System.out.println(numbersList);
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList);
        // linkedhashset
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
        System.out.println(listWithoutDuplicates);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // 。使用steam的distinct()
        List<Integer> list = numbersList.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //HashSet不能添加重复数据的特性
        HashSet<Integer> set = new HashSet<Integer>(numbersList.size());
        ArrayList<Integer> arrayList = new ArrayList<>(numbersList.size());
        for (Integer i : numbersList) {
            if (set.add(i)) {
                arrayList.add(i);
            }
        }
        numbersList.clear();
        numbersList.addAll(arrayList);
        System.out.println(numbersList);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //利用List的contains方法循环遍历,重新排序,只添加一次数据,避免重复：
        for (Integer i : numbersList) {
            if (!set.contains(i)) {
                arrayList.add(i);
            }
        }
        numbersList.clear();
        numbersList.addAll(arrayList);
        System.out.println(numbersList);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // 双重for循环去重

        for (int i = 0; i < numbersList.size(); i++) {
            for (int j = 0; j < numbersList.size(); j++) {
                if (i != j && numbersList.get(i) == numbersList.get(j)) {
                    list.remove(list.get(j));
                }
            }

        }
        System.out.println(numbersList);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
