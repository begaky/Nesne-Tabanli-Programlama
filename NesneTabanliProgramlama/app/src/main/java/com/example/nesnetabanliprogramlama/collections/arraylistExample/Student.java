package com.example.nesnetabanliprogramlama.collections.arraylistExample;

import androidx.annotation.Nullable;

public class Student implements Comparable<Student> {

    private int okulNo;
    private String name;

    public Student() {
    }

    public Student(int tcNo, String name) {
        this.okulNo = tcNo;
        this.name = name;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return new String(this.name).compareTo(student.getName());
    }

    @Override
    public int hashCode() {
        return this.okulNo;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this.okulNo == ((Student)obj).getOkulNo()){
            return true;
        }else{
            return false;
        }
    }
}
