package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void testSinglyLinkedConstructor(){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        Assert.assertNotNull(list);
    }
    @Test
    public void testAddNode(){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!";

        list.add(str1);
        list.add(str2);
        list.add(str3);
        Assert.assertEquals("Hello", list.get(0));
    }
    @Test
    public void testRemoveNode(){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!";

        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.remove(2);
        Assert.assertFalse(list.contains(str3));
    }
    @Test
    public void testContainsNode(){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!";

        list.add(str1);
        list.add(str2);
        list.add(str3);
        Assert.assertFalse(list.contains(str2));
    }
    @Test
    public void testFindNode(){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!";

        list.add(str1);
        list.add(str2);
        list.add(str3);
        Assert.assertEquals(1, list.find(str2));
    }
    @Test
    public void testSizeNode(){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!";

        list.add(str1);
        list.add(str2);
        list.add(str3);
        Assert.assertEquals(3, list.size());
    }
    @Test
    public void testGetNode(){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!";

        list.add(str1);
        list.add(str2);
        list.add(str3);
        Assert.assertEquals("!", list.get(2));
    }



}

