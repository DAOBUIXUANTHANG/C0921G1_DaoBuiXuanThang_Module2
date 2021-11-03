package ss4_lop_va_doi_tuong_trong_java.bai_tap.lop_stop_watch;

public class XayDungLopStopWatch {
    public static void main(String[] args) {
        StopWatch time1 = new StopWatch();

        int arr1[] = new int[]{1,2,3,4,5,6,7,8,9,2,3,4,5,6};
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max){
                max = arr1[i];
            }
        }
        time1.stop();

        System.out.println("thuat toan tim so lon nhat: " + max);
        System.out.println("thoi gia bat dau " + time1.getStartTime());
        System.out.println("thoi gia ket thuc " + time1.getEndTime());
        System.out.println("tong thoi gian: " + time1.getElapedTime());
    }
}
