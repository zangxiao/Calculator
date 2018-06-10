package com.wyhand.calculator;

public class Tool {
    public boolean check(String inf){//判断可不可以写入字符
        if(inf.length() == 0){
            return false;
        }
        char c = inf.charAt(inf.length()-1);//根据字符取出最后一个字符
        if( c >= '0' && c <= '9'){//说明是数字
            return true;
        }else{
            return false;
        }
    }

    public boolean check2(String inf){//判断可不可以写入（）等字符
        if(inf.length() == 0){
            return false;
        }
        char c = inf.charAt(inf.length()-1);//根据字符取出最后一个字符
        if( c >= '0' && c <= '9'){//说明是数字
            return true;
        } else if( String.valueOf(c).equals("+")){
            return true;
        }else if( String.valueOf(c).equals("-")){
            return true;
        }else if( String.valueOf(c).equals("×")){
            return true;
        }else if( String.valueOf(c).equals("÷")){
            return true;
        } else{
            return false;
        }
    }
}
