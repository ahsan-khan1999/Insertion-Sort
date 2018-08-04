public class TestSorting {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        int newArray[]={2,1,3,5,7,4,0};
        myArray.insertionSorting(newArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);

        }
    }
}
