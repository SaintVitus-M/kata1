package org.ulpgc.is2;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Vit", "Mikula", LocalDate.of(2000, 4, 6));
        System.out.println(p1);
        System.out.println(p1.getAge());
    }
}