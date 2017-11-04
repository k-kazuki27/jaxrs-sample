/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.app;

import com.google.common.collect.Lists;
import java.util.List;

/**
 *
 * @author kawabata
 */
public class Database {

    private static final List<Fruits> LIST = Lists.newArrayList(new Fruits("りんご", 100), new Fruits("みかん", 200));

    static public List<Fruits> getAll() {
        return LIST;
    }

    static public Fruits get(String name) {
        return LIST.stream().filter(f -> f.getName().equals(name)).findFirst().get();
    }

    static public void add(Fruits fruit) {
        LIST.add(fruit);
    }

    static public void delete(String name) {
        LIST.remove(LIST.stream().filter(f -> f.getName().equals(name)).findFirst().get());
    }
}
