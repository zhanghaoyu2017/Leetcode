package com.hiasenna.puyuan;

import javax.tools.Tool;

/**
 * @ClassName Single
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/17-20:58
 * @Version 1.0
 **/
public class Single {
    private static Single single;

    public static Single getSingle() {
        if (single == null) {
            single = new Single();
        }
        return single;
    }

    public static String getStr(String s) {
      int len = s.length();
      String res = "";
      int count = 0;
      for (int i =1;i<=len;i++){
          String tmp = s.substring(0,i);
          String[] arr = s.split(tmp);
          if (arr.length == 0){
              count = i;
              break;
          }
      }
      res += len/count+"";
      res += s.substring(0,count);
      return  res;
    }
}
class TestSingle {
    public static void main(String[] args) {
        String s = "xyxyx";
        String result = "";
        Single single = Single.getSingle();
        result = single.getStr(s);
        System.out.println(result);
    }
}