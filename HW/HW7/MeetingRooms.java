public class MeetingRooms {
    public static void main(String[] args) {
        MeetingRooms m = new MeetingRooms();

        int[][] a = { {0, 30}, {5, 10}, {15, 20}};

        System.out.println(m.minMeetingRooms(a));;
    }

    public int minMeetingRooms(int[][] intervals) {
        return intervals.length;
    }
}