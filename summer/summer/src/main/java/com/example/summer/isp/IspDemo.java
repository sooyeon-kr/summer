package com.example.summer.isp;

interface MainInterface{
    void methodA();
    void methodB();
}


class ImplA implements MainInterface{
    @Override
    public void methodA() {
        System.out.println("implA");
    }

    @Override
    public void methodB() {
        //
    }
}

class ImplB implements MainInterface{
    @Override
    public void methodB() {
        System.out.println("impleB");
    }

    @Override
    public void methodA() {
        //
    }
}




public class IspDemo {
    public static void main(String[] args) {
        ispMethod(new ImplA());
        ispMethod(new ImplB());
    }

    public static void ispMethod(MainInterface mainInterface){

    }
}
