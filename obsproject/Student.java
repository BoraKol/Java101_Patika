package obsproject;

import java.util.function.IntToDoubleFunction;

public class Student {
    String name;
    String studNo;
    int classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course c1, Course c2, Course c3) {
        this.name = name;
        this.classes = classes;
        this.studNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        //calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int c1, int c2, int c3, int c1Verbal, int c2Verbal, int c3Verbal) {

        if ((c1 >= 0 && c1 <= 100) && (c1Verbal >= 0 && c1Verbal <= 100)) {
            this.c1.note = (int) (c1 * 0.8 + c1Verbal * 0.2);
        }

        if ((c2 >= 0 && c2 <= 100) && (c2Verbal >= 0 && c2Verbal <= 100)) {
            this.c2.note = (int) (c2 * 0.8 + c2Verbal * 0.2);
        }

        if ((c3 >= 0 && c3 <= 100) && (c3Verbal >= 0 && c3Verbal <= 100)) {
            this.c3.note = (int) (c3 * 0.8 + c3Verbal * 0.2);
        }
    }
    public void isPass() {
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3;
        System.out.println(this.c1.name+" Dersi not hesabi : %70 sınav notu, %30 sozlu notu olarak hesaplanmistir");
        System.out.println(this.c2.name+" Dersi not hesabi : %70 sınav notu, %30 sozlu notu olarak hesaplanmistir");
        System.out.println(this.c3.name+" Dersi not hesabi : %70 sınav notu, %30 sozlu notu olarak hesaplanmistir");
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.c1.note);
        System.out.println("Fizik Notu : " + this.c2.note);
        System.out.println("Kimya Notu : " + this.c3.note);

    }
}