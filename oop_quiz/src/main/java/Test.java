public class Test {

        public static void main(String[] args) {

            Demo obj1=new Demo();
            Demo obj2=obj1;

            obj1.a+=1;
            obj2.b+=1;

            System.out.println("Values of obj1: ");
            obj1.print();

            System.out.println("Values of obj2: ");
            obj2.print();
        }
    }

    class Demo{
        int a, b;

        public Demo() {
            a=10;
            b=20;
        }


        public void print(){

            System.out.println("a: " + a + ",b " + b);
        }

}
