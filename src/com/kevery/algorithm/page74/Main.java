package com.kevery.algorithm.page74;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/**
 * Created by kever
 * 2016/10/1.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        StringOfStack stack = new StringOfStack(5);
        int length = stack.getSts().length;
        InputStreamReader reader = new InputStreamReader(new FileInputStream("/Users/kever/text/demo.text"));
        int c;
        while ((c=reader.read()) != -1) {
            String item = Character.toString((char) c);
            if (!item.equals("-")) {
                stack.push(item);
            }else if(!stack.isEmpty()){
                System.out.println(stack.pop());
            }
        }
        System.out.println("^"+stack.size()+"left");
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }

}
