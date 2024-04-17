package com.strong.java.datastructure;

/**
 * @author: strong
 * @since: 2024/4/11 19:57
 * @description:
 */
public class compareVersion {
    public static void main(String []args){
        String version1 = "1.11";
        String version2 = "1.10.1";


        System.out.println(Compareversion(version1,version2));
    }

    public static int  Compareversion( String version1,String version2){

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int maxLength = Math.max(v1.length, v2.length);

        for (int i = 0; i < maxLength; i++) {

            int v1Number = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int v2Number = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            int compare = Integer.compare(v1Number, v2Number);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }


        
}
