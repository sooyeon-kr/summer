package generic;

public class GenericMethodDemo {
    static class innerClass<T>{
        T innerMember;
    }
    public static void main(String[] args) {
        ClassWithGenericMethod<Integer> classWithGenericMethod = new ClassWithGenericMethod<>();
        classWithGenericMethod.genericMethod(7, 8);
        classWithGenericMethod.<Integer>genericMethod(7, 8);
        classWithGenericMethod.<Long>genericMethod(7L, 8L);

//        타입 추론 한 것
//        classWithGenericMethod.<Long>genericMethod(7L, 8L);
        classWithGenericMethod.genericMethod(7L, 8L);
        classWithGenericMethod.genericMethod(7, "*");
        classWithGenericMethod.genericMethod("88", "**");



    }
}
class GenericClass<C>{
    C c;

//    제네릭 클래스
    public void methodC(C c){
    }
//    제네릭 메소드
    public <M> void methodM(){

    }

//    제네릭 클래스에서 정한 반환형인데, 반환형도 제네릭
    public C methodCReturnC(C c){
        return c;
    }

//    이거 자체적으로도 쓰려고!, 제네릭 메소드지만 클래스가 받아온 제네릭을 사용하기도 함
//     자체적으로 사용한다는 건, 매개변수 혹은 반환타입에 자체적인 타입을 사용할 수 있음
//    타입을 사용할 수 있는 곳곳에 살 수 있다.
    public <M> M methodCWithGM(M m){
        return m;
    }

//    제네릭 메소드인데, 반환타입은 클래스가 받아온거 쓰려고
    public <G> C multiMethod(){
        return null;
    }

//    제네릭 메소드인데, 반환타입은 클래스가 받아온거 쓰려고
//    파라미터로 내가 독립적으로 가능하고, 클래스가 받아온 값도 가능하고
//     한쪽은 클래스거, 한쪽은 클래스거
//    반환타입은 클래스거
    public <G> C multiMethodWithGM(G g, C c){
        return c;
    }





}
class ClassWithGenericMethod<T> {
    T t; // 클래스단에서 받아온 T(제네릭 클래스가 받아온 T)


    /**
     *
     *
     *
     */


//    나 메소드 안에서 제네릭 따로 쓸거야,
//    나머지 셋이 그 따로 쓰는 T;
    public <T> T genericMethod(T t1, T t2) {
        return t1;
    }
// 자체적으로


}

