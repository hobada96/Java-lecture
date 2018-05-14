public class Movie05 {
    String title;
    String directedBy;
    int runningTime;
    String releaseDate;
    String Date;

    static String runTime;


    Movie04(String title, String directedBy, int runningTime, String releaseDate) {
        this.title = title;
        this.directedBy = directedBy;
        this.runningTime = runningTime;
        this.releaseDate = releaseDate;
        runTime = setRunningTime(runningTime);
        Date = setReleaseDate(releaseDate);
    }

    static String setRunningTime(int runningTime) {
        int time;
        int minute;
        time = runningTime / 60;
        minute = runningTime % 60;
        return runTime = time + "시간" + minute + "분";
    }

    public String setReleaseDate(String releaseDate) {
        String Year = releaseDate.substring(0,4);
        String month = releaseDate.substring(4,6);
        String day = releaseDate.substring(6,8);
        return Year + "년" + month + "월" + day + "일";
    }

    @Override
    public String toString() {
        return "제목 : " + title + "\n감독 : " + directedBy + "\n상영시간 : " + runTime + "\n개봉일 : " + Date;
    }

}