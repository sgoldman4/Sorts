public class Test
{
    public static void main(String[] args)
    {
        int[] arr1 = {328, 812, 1019,
                519, 1011, 408, 406, 214, 1004,
                222, 102, 816, 204, 601, 312,
                713, 604};
        Sorts.printArr(arr1);
        System.out.println();

        Sorts.ascendingSort(arr1);
        Sorts.printArr(arr1);
        System.out.println();

        String[] names = {"Andrew", "Xinyi",
                "Isaiah", "Qian", "Jamil","Richard",
                "Christopher", "Nathanael", "Asllan",
                "Hai Jie", "Philip", "Andrew",
                "Kenny", "Alan", "Awais", "Ivan",
                "Chenxi"};
        Sorts.printArr(names);
        System.out.println();

        Sorts.ascendingSort(names);
        Sorts.printArr(names);
        System.out.println();
    }
}
