public class ArraySorting {


    public static void main(String[] args) {

        ArraySorting as=new ArraySorting();
        //as.sort();

        QuickSort qs=new QuickSort();
        BubbleSort bs=new BubbleSort();
        as.sort(qs);
        as.sort(bs);

        //MyLambda myLambda=()-> System.out.println("Sorting the array");

        Sorting nolambda=new QuickSort();
        nolambda.sort();

        Sorting quicksort=()-> System.out.println("Quick Sorting");
        as.sort(quicksort);


        Sorting bubblesort=()-> System.out.println("Bubble Sorting");
        as.sort(bubblesort);


        as.sort(()-> System.out.println("Quick Sorting"));
        as.sort(()-> System.out.println("Bubble Sorting"));
    }

    private void sort(Sorting sorting){
        sorting.sort();
    }

    interface MyLambda{
        void print();
    }
}
