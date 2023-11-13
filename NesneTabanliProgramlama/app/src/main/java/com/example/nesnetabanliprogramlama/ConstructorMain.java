package com.example.nesnetabanliprogramlama;

public class ConstructorMain {
    public static void main(String[] args) {

        OgrencilerConsExample student1 = new OgrencilerConsExample();

        student1.studentName = "Fidan";
        student1.nationality = "VAN";
        student1.studentNo = 123456;

        System.out.println(student1.studentName);

        OgrencilerConsExample student2 = new OgrencilerConsExample("Begüm","TRABZON",1122334455);
        System.out.println(student2.studentName + " " + student2.nationality + " " + student2.studentNo);
    }
}
