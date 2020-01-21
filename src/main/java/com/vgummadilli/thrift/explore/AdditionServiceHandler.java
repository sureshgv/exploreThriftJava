package com.vgummadilli.thrift.explore;
import org.apache.thrift.TException;

public class AdditionServiceHandler implements AdditionService.Iface {
    public int add(int a, int b) throws TException {
        return a + b;
    }
}
