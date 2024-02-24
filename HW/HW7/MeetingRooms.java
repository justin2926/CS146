import java.util.Arrays;

public class MeetingRooms {
    public static void main(String[] args) {
        MeetingRooms m = new MeetingRooms();

        int[][] a = {   {0, 30},
                        {5, 10},
                        {15, 20}
                    };

        int[][] b = {   {0, 1},
                        {1, 2},
                        {2, 3}
                    };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "] = "
                        + a[i][j]);
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("b[" + i + "][" + j + "] = "
                        + b[i][j]);
            }
        }

//        System.out.println(m.minMeetingRooms(a));
//        System.out.println(m.minMeetingRooms(b));
    }

    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals);
        int min = 0;

//        for (int i = 0; i < intervals.length; i++) {
//            for (int j = 0; j < intervals[i].length; j++) {
//
//            }
//        }
        return 0;
    }
}