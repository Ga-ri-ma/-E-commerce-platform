package onlineshoping.UTIL;

import java.util.*;
class stackcl{
  static void showpush(Stack st,int a){
    st.push(new Integer(a));
    System.out.println("push("+a+")");
    System.out.println("stack:"+st);
 }
 static void showpop(Stack st){
  System.out.print("pop->");
  Integer a=(Integer)st.pop();
  System.out.println(a);
  System.out.println("stack:"+st);
}
public static void main(String args[]){
  Stack st=new Stack();

 System.out.println("stack:"+st);
 showpush(st,10);
 showpush(st,20);
 showpush(st,30);
 showpop(st);
 showpop(st);
 showpop(st);

 try{
  showpop(st);
}catch(EmptyStackException e){
   System.out.println("empty stack");
  }
 }
}
 
