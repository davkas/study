package com.davkas.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 堆内存溢出异常测试
 *VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * Created by davkas on 16/8/6.
 */
public class HeapOOM {

    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject>  list = new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }

}
