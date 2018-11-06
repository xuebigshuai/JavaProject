package test;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/31.
 */
public class OrderBy {
    public static void main(String[] args) {
        int t=0,m=0;
        boolean flag=true;
        /**
         * 冒泡排序（倒序）
         */
       int[] arr={1,25,3,2,5,3,7,8,9,10};
       for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-1-i;j++){
                t=arr[j];
                if(arr[j]<arr[j+1]){
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
           }

       }
        /**
         * 选择排序(倒序)
         */
        /*for(int i=0;i<arr.length-1;i++){
            t=arr[i];
            m=i;
            for(int j=i;j<arr.length-1;j++){
               if(t<a
               rr[j+1]){
                   m=j+1;
                  t=arr[j+1];
               }
            }
            arr[m]=arr[i];
            arr[i]=t;
        }*/
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }



    }
}
