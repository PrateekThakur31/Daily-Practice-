package com.demo.practice;

import java.util.*;
public class Strings {
    public static void main(String[] args) {

//        String s = "Hello";
//        String s2= "Prateek";
//        String s1="Thakur";
//        System.out.println(s1.length());
//        System.out.println(s2.charAt(4));
//        System.out.println(s2.indexOf('e'));
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s.compareTo(s2));
//        System.out.println(s2.contains("tik"));
//        System.out.println(s1.startsWith("r"));
//        System.out.println(s1.toLowerCase().toUpperCase());
//        System.out.println(s2.concat( s1));
//        System.out.println(s1+" "+s2);
//        System.out.println(s1.substring(0,3));


//        String s= "physics";
//        for(int i=0; i<=7;i++) {
//            for (int j=i+1; j<7; j++) {
//                System.out.print(s.substring(i,j)+" ");
//            }
//        }

//        String s1= "hello";
//        String s2="hello";
//        String s3= new String("hello");
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3));


//        StringBuilder str=new StringBuilder("Hello");
//        str.append("World");
//        //str.setCharAt(0,'M');
//        str.insert(5,' ');
//        System.out.println(str);
//        str.deleteCharAt(5);
//        System.out.println(str);


        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
//        str.reverse();
//        System.out.println(str);

        for(int i=0;i<str.length();i++){
            boolean flag=true;
            char ch = str.charAt(i);
            int asci=(int)ch;
            if(asci>=97)flag=false;
            if (flag == true) {
                asci +=32;
                char dh =(char)asci;
                str.setCharAt(i,dh);
            }else{
                asci -=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
