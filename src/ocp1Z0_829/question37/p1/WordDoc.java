package ocp1Z0_829.question37.p1;

non-sealed abstract class WordDoc extends Doc{
    private String word;
    public WordDoc(String name,String word) {
        super(name);
        this.word = word;
    }

    public void print() {
        System.out.println("WordDoc");
    }

//    public static void main(String[] args) {
//        Doc doc = new Doc();
//        doc.make();
//    }
}
