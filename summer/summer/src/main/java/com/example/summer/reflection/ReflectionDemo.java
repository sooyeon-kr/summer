package com.example.summer.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object object = new Car();
//        object.ride();이거 안됨, 하고 싶음

        Class carClass = object.getClass();

//        너를 그것처럼 만들어줄게!
        Method ride = carClass.getMethod("ride");

//        ride를 오브젝트에 붙여준다.
        ride.invoke(object, null);

//        com.example.reflection.Car car = new com.example.reflection.Car();
//        car.ride();
    }
}

class Car{
    public void ride(){
        System.out.println("ride~~~~");
    }    
}


