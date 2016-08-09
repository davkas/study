package com.davkas.jvm;

/**
 * 虚拟机栈和本地方法栈溢出测试
 * VM args:-Xss128k
 * Created by davkas on 16/8/6.
 */
public class JavaVMStackSOF {

    private int stackLength = 1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Exception {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack lenath:"+ oom.stackLength);
            throw new Exception("xxx",e);
        }
    }

}
