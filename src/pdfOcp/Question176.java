package pdfOcp.question176;

public class Question176 {
    int aCount;
    int tCount;
    int cCount;
    int gCount;

    void setACount(int cCount) {
        this.cCount = cCount;
    }

    void setTCount() {
        this.tCount = tCount;
    }

    int setcCount() {
        return cCount;
    }

    int setgCount(int gCount) {
        gCount = gCount;
        return gCount;
    }

    void setAllCounts(int x){
        this.aCount = tCount = cCount = setgCount(x);
    }

    public int getaCount() {
        return aCount;
    }

    public int gettCount() {
        return tCount;
    }

    public int getcCount() {
        return cCount;
    }

    public int getgCount() {
        return gCount;
    }

    public static void main(String[] args) {
        Question176 q = new Question176();
//        q.setAllCounts(1);
        q.setgCount(1);
        System.out.println(q.getcCount());
        System.out.println(q.getgCount());

        String s = "123";
        s.substring(10);
    }

}
