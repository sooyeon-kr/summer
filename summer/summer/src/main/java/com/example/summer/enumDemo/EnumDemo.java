package com.example.summer.enumDemo;

public class EnumDemo {
    private static int outerStaticVal=5;
    private int outerVal = 10;

    private InnerClass1 inner1;
    private InnerClass2 inner2;

    public class InnerClass1{
        private int innerVal = outerVal;
        private static int innerStaticVal=outerStaticVal;
        public int getInnerVal() {
            return innerVal;
        }
        public void setInnerVal(int innerVal) {
            this.innerVal = innerVal;
        }
        public int getInnerStaticVal() {
            return innerStaticVal;
        }
        public void setInnerStaticVal(int innerStaticVal) {
//            static변수는 객체보다 클래스로 접근하는 것이 맞다.
//            this.innerStaticVal = innerStaticVal;
            InnerClass1.innerStaticVal = innerStaticVal;

        }
    }

    public static class InnerClass2{
//        static이 아닌 outerValue는 static 클래스가 접근할 수 없다.
//        private int innerVal = outerVal;
        private static int innerStaticVal=outerStaticVal;


//        static이 아닌 outerValue는 static 클래스가 접근할 수 없다.
//        public int getInnerVal() {
//            return innerVal;
//        }
//        public void setInnerVal(int innerVal) {
//            this.innerVal = innerVal;
//        }
        public int getInnerStaticVal() {
            return innerStaticVal;
        }
        public void setInnerStaticVal(int innerStaticVal) {
//            static변수는 객체보다 클래스로 접근하는 것이 맞다.
//            this.innerStaticVal = innerStaticVal;
            InnerClass2.innerStaticVal=innerStaticVal;
        }
    }
    public void handleInnerClass1(InnerClass1 inner1){
        inner1.innerVal = outerVal;
        System.out.println(inner1.innerVal);
    }

    public void handleInnerClass2(InnerClass2 inner2){
        inner1.innerVal = outerVal;
        System.out.println(inner1.innerVal);
    }

    public static void main(String[] args) {
        EnumDemo enumDemo = new EnumDemo();
        
        //인스턴스(내부) 클래스 사용 방법
        enumDemo.inner1 = new EnumDemo().new InnerClass1();
        enumDemo.handleInnerClass1(enumDemo.inner1);
        
        //정적(내부)클래스 사용 방법
        enumDemo.handleInnerClass2(enumDemo.inner2);
    }

}
