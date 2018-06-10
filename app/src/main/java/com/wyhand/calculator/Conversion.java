package com.wyhand.calculator;


public class Conversion {
    //"十进制转换到其它进制：int x = 123 ;
    public String TentoNi(int x) {
        String str = "0";
        str = Integer.toHexString(x);      ///10进制转换成16进制的字符串
        return str;
    }

    public String TentoTe(int x){
        String str = "0";
        str = String.valueOf(x);
        return str;
    }

    public String TentoEi(int x){
        String str = "0";
        str = Integer.toOctalString(x) ;     ///10进制转换成8进制的字符串
        return str;
    }

    public String TentoEr(int x) {
        String str = "0";
        str = Integer.toBinaryString(x);///10进制转换成2进制的字符串
        System.out.println("!!!" + str);
        return   str;
    }

}
