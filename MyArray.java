public class MyArray {
        //    int unSortArray[] = {2,1,4,5,2,34};
////    {1,2,3,4,7,5}
//    for(int i = 1 ; i < unSortArray.length ; i++){
//        i=i-1;
//        if(unSortArray[i] < unSortArray[i++]){
//            System.out.println("Clear"+unSortArray[i]);
//        }
//        else{
//            int temp=0;
//            unSortArray[i] = temp;
//            unSortArray[i] = unSortArray[i+1];
//            unSortArray[i+1] = temp;
//            System.out.println(unSortArray[i]);
//            i--;
//        }
//
//    }

//    for (int i = 0 ; i < unSortArray.length ; i++){
//        System.out.println(unSortArray[i]+"holllll");
//    }




    public int[] insertionSorting(int[] list){

        int j,key,temp;

        for (int i = 1 ; i < list.length ; i++){

            key = list[i];
            j=i-1;

            while (j >=0 && key<list[j]){
                temp = list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
                j--;
            }
        }
        return list;
    }

}
