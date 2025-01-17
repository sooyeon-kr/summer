package generic;

public class GenericClassDemo {

    public static void main(String[] args) {
        BoxObject boxObject = new BoxObject();
        boxObject.obj = new Object();
        System.out.println(BoxObject.obj.toString());

        BoxGeneric<Object> boxGeneric = new BoxGeneric<Object>();
        boxGeneric.t = new Object();
        System.out.println(boxGeneric.t.toString());

        
        BoxObject boxComponent = new BoxObject();
        boxComponent.obj = new Component();
//        다운 캐스팅 필요, 왜 써?! Generic 쓰자!
        Component component = (Component)boxComponent.obj; 
        System.out.println(component.sayHi()); 

        BoxGeneric<Component> boxGenericComponent = new BoxGeneric<Component>();
        boxGenericComponent.t = new Component();
        System.out.println(boxGenericComponent.t.sayHi());

        /*
        String str1 = (String) boxObject.obj; // 런타임 시점에 에러 잡음
        String str2 = (String) boxGenericComponent.t; // 컴파일 시점에서 에러 잡음

         */


    }
}
class Component {

    public String sayHi(){
        return "SayHi";
    }
}
class BoxGeneric<T>{
    T t;
    String field;
}

class BoxObject{
    public static Object obj;
    String field;
}
