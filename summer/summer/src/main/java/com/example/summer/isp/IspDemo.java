package com.example.summer.isp;
interface CommonInterface{
}
interface MainInterface extends CommonInterface {
}
interface AMainInterface extends CommonInterface{
    void methodA();
}
interface BMainInterface extends CommonInterface{
    void methodB();
}
class ImplA implements AMainInterface{
    public void methodA() {
        System.out.println("implA");
    }
}

class ImplB implements BMainInterface{
    public void methodB() {
        System.out.println("impleB");
    }
}




public class IspDemo {
    public static void main(String[] args) {
        ispMethod(new ImplA());
        ispMethod(new ImplB());
    }
    
//  오버로딩으로 해결하기
    public static void ispMethod(AMainInterface mainInterface) {
        mainInterface.methodA();
    }
    public static void ispMethod(BMainInterface mainInterface) {
        mainInterface.methodB();
    }
                                                           
//   instanceof로 해결하기
    public static void ispMethod(CommonInterface commonInterface){
       if(commonInterface instanceof ImplA){
           ImplA implA = (ImplA) commonInterface;
           implA.methodA();
       }else if(commonInterface instanceof ImplB){
           ImplB implB = (ImplB) commonInterface;
           implB.methodB();
       }

       //혹은
        ((ImplA) commonInterface).methodA();
        ((ImplB) commonInterface).methodB();

        GenericIsp<AMainInterface> genericIspA = new GenericIsp<AMainInterface>();
        genericIspA.ispMethod(new ImplA());

//        현재 B가 들어가지 못함
//        genericIspA.isMethod(new ImplB());

        GenericIsp<BMainInterface> genericIspB = new GenericIsp<BMainInterface>();
        genericIspB.ispMethod(new ImplB());

    }




}
class GenericIsp<T> {
    public void ispMethod(T abInterface) {
        if (abInterface instanceof AMainInterface)
            ((AMainInterface) abInterface).methodA();
        else if (abInterface instanceof BMainInterface)
            ((BMainInterface) abInterface).methodB();
    }
}

/*
*
[1] 매개변수로 받아서 사용하는 메소드를 오버로딩
package com.example.summer.isp;

interface AInterface {
    void methodA();
}

interface BInterface {
    void methodB();
}

class ImplA implements AInterface{

    @Override
    public void methodA() {
        System.out.println("implA");
    }
}

class ImplB implements BInterface {

    @Override
    public void methodB() {
        System.out.println("implB");
    }
}

public class IspDemo {
    public static void main(String[] args) {
        ispMethod(new ImplA());
        ispMethod(new ImplB());
    }

    public static void ispMethod(ImplA implA) {
        implA.methodA();
    }

    public static void ispMethod(ImplB implB) {
        implB.methodB();
    }
}

[2] 상위 인터페이스를 만들어서, 팔다리 접어서 들어간 구현체를 instancof + 캐스팅을 활용하여 팔다리 다시 폄
package com.example.summer.isp;

interface ABInterface {

}

interface AInterface extends ABInterface{
    void methodA();
}

interface BInterface extends ABInterface{
    void methodB();
}

class ImplA implements AInterface{

    @Override
    public void methodA() {
        System.out.println("implA");
    }
}

class ImplB implements BInterface {

    @Override
    public void methodB() {
        System.out.println("implB");
    }
}

public class IspDemo {
    public static void main(String[] args) {
        ispMethod(new ImplA());
        ispMethod(new ImplB());
    }

    public static void ispMethod(ABInterface abInterface) {
        if (abInterface instanceof AInterface)
            ((AInterface) abInterface).methodA();
        else if (abInterface instanceof BInterface)
            ((BInterface) abInterface).methodB();
    }
}

[3] 제네릭
package com.example.summer.isp;

interface ABInterface {

}

interface AInterface extends ABInterface{
    void methodA();
}

interface BInterface extends ABInterface{
    void methodB();
}

class ImplA implements AInterface{

    @Override
    public void methodA() {
        System.out.println("implA");
    }
}

class ImplB implements BInterface {

    @Override
    public void methodB() {
        System.out.println("implB");
    }
}

public class IspDemo {
    public static void main(String[] args) {
        GenericIsp<AInterface> genericIspA = new GenericIsp<>();
        genericIspA.ispMethod(new ImplA());

        GenericIsp<BInterface> genericIspB = new GenericIsp<>();
        genericIspB.ispMethod(new ImplB());
    }
}

class GenericIsp<T> {
    public void ispMethod(T abInterface) {
        if (abInterface instanceof AInterface)
            ((AInterface) abInterface).methodA();
        else if (abInterface instanceof BInterface)
            ((BInterface) abInterface).methodB();
    }
}
*
*
*
* */