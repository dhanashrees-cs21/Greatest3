package com.cslc.Package3;

public class Greatest3 {
    public String large(int a,int b,int c) {
      int result= c > (a > b ? a : b) ? c : ((a > b) ? a : b);
      return "The  Greatest Number is" + String.valueOf(result);
   }
}
