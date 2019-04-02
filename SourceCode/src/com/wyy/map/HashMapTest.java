package com.wyy.map;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("a","A");
        map.put("a","B");
        map.put("c","C");
        map.put("d","D");


        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }

        Iterator<Map.Entry<String,String>> iterable = map.entrySet().iterator();
        while (iterable.hasNext()){
            Map.Entry entry = iterable.next();
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }

        User user1 = new User("wyy",23);
        User user2 = new User("wsd",21);

        Map<User,String> userMap = new java.util.HashMap<>();

        userMap.put(user1,"wyy");
        userMap.put(user2,"wsd");

        System.out.println(user1.hashCode());
        System.out.println(userMap.get(user1));

        user1.setName("whj");
        System.out.println(user1.hashCode());
        System.out.println(userMap.get(user1));

        user1.setName("wyy");
        System.out.println(user1.hashCode());

        System.out.println(userMap.get(user1));

        userMap.put(null,null);

        for (Map.Entry<User,String> set:userMap.entrySet()) {
            System.out.println(set.getKey()+"     "+set.getValue());
        }

        System.out.println("=====================");

        userMap.put(null,"111");
        for (Map.Entry<User,String> set:userMap.entrySet()) {
            System.out.println(set.getKey()+"     "+set.getValue());
        }

        System.out.println("=====================");

        userMap.put(null,"222");
        userMap.put(user1,null);
        userMap.put(user2,null);
        for (Map.Entry<User,String> set:userMap.entrySet()) {
            System.out.println(set.getKey()+"     "+set.getValue());
        }
    }

}

class User{

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) &&
                age.equals(user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
