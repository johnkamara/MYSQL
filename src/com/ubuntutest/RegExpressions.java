package com.ubuntutest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressions {

    //patterns in real life

    String Email = "johnsimbo2009@gmail.com";
    String pat = "[a-zA-Z0-9.]+@[a-z]+.[a-z](2,3)";

    //johmsimbo3009@gmail.com


    Pattern compile = Pattern.compile(pat);
    Matcher matcher = compile.matcher(Email);  //true-validation success

}
