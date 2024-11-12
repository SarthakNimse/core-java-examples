package addition;

public class Addition {
        public void add_nos_int() {
            int no1 = 10;
            int no2 = 20;

            System.out.println("Addition of no1 and no2 is " + (no1 + no2));

        }

        public void add_nos_float() {
            float no1 = 1.2f;
            float no2 = 2.3f;

            System.out.println("Addition of no1 and no2 is " + (no1 + no2));

        }

        public void add_nos_double() {
            double no1 = 45.56;
            double no2 = 352.4;

            System.out.println("Addition of no1 and no2 is " + (no1 + no2));
        }

        public void add_nos_long() {

            long no1 = 46841246;
            long no2 = 4861853;

            System.out.println("Addition of no1 and no2 is " + (no1 + no2));
        }

        public static void main(String[] args) {

            Addition demo = new Addition();
            demo.add_nos_int();
            demo.add_nos_float();
            demo.add_nos_double();
            demo.add_nos_long();


        }
    }

