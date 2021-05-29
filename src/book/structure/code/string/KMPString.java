package book.structure.code.string;

import java.util.ArrayList;
import java.util.List;

/**
 * KMP模式匹配算法
 */
public class KMPString {
    /**
     * next数组获取
     */
    public List<Integer> getKMPNext(char[] tList){
        List<Integer> nextList = new ArrayList<>();
        //第一位写死next[0] = 0,分析T串循环从i = 1开始
        int i = 1, j = 0;
        nextList.add(j);
        nextList.add(j);
        while(i < tList.length - 1 ){
            if(tList[i] == tList[j]){
                j++;
                i++;
                nextList.add(j);
            }else if (j ==0){
                i++;
                nextList.add(j);
            }else{
                //若不等，回溯
                j = nextList.get(j);
            }
        }
        return nextList;
    }

    /**
     * next数组获取
     */
    public List<Integer> getKMPNextval(char[] tList){
        List<Integer> nextList = new ArrayList<>();
        //第一位写死next[0] = 0,分析T串循环从i = 1开始
        int i = 1, j = 0;
        nextList.add(j);
        nextList.add(j);
        while(i < tList.length - 1 ){
            if(tList[i] == tList[j]){
                j++;
                i++;
                //nextval 优化点
                if(tList[i] != tList[j]){
                    nextList.add(j);
                }else {
                    nextList.add(nextList.get(j));
                }
            }else if (j ==0){
                i++;
                nextList.add(j);
            }else{
                //若不等，回溯
                j = nextList.get(j);
            }
        }
        return nextList;
    }

    /**
     * 简单kmp算法
     */
    public Integer kmp(char[] sList, char[] tList){
        List<Integer> nextList = getKMPNext(tList);
        Integer i = 0, j = 0;
        while(i < sList.length && j < tList.length){
            if(sList[i] == tList[j]){
                ++i;
                ++j;
            }else if(j != 0){
                j = nextList.get(j);
            }else {
                ++i;
            }
        }
        return j < tList.length ? 0 : i-tList.length;
    }

    public static void main(String[] args){
        KMPString kmpString = new KMPString();
        List<Integer> nextList = kmpString.getKMPNext("ababaaaba".toCharArray());
        System.out.println(nextList.toString());
        List<Integer> nextValList = kmpString.getKMPNextval("ababaaaba".toCharArray());
        System.out.println(nextValList.toString());
        Integer result = kmpString.kmp("aaaaaaba".toCharArray(),"aab".toCharArray());
        System.out.println("result = "+result);
    }
}
