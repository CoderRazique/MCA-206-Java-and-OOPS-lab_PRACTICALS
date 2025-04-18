// 9. Write a Java program for Parameterized Constructor.

public class assignment9_ParametrizeConstructor {
    public static class personDetails {
        String nm;
        int age;
        String work;

        public personDetails(String nm, int age, String work) {
            this.nm = nm;
            this.age = age;
            this.work = work;
        }

        public void printDetails() {
            System.out.println("Name of person : " + nm);
            System.out.println("Age of person : " + age);
            System.out.println("Work of person : " + work);
        }
    }

    public static void main(String[] args) {
        personDetails pd = new personDetails("Razique", 22, "tudent");
        pd.printDetails();
    }
}
