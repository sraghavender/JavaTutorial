package com.raghavender.collections.funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

    @Override
    public String get() {
        return "hello";
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList();
        SupplierDemo supplierDemo = new SupplierDemo();
        System.out.println(list.stream().findAny().orElseGet(supplierDemo));

    }




}