class Oddoccurence{
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,3,4,6,6,4};
        int result = 0;

        for(int i = 0; i<arr.length;i++){
            result = result ^ arr[i];
        }
        System.out.println(result);

    }


}
