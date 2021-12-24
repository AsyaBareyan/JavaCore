package chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap=Apple.RED_DEL;
        System.out.println("znachenie ap: "+ap);
        System.out.println();

        ap=Apple.GOLDEN_DEL;
        if (ap==Apple.GOLDEN_DEL){
            System.out.println("peremennaya ap soderjit GOLDEN_DEL.\n");
            switch (ap){
                case JONATHAN:
                    System.out.println("sort JONATHAN krasni");
                    break;
                case GOLDEN_DEL:
                    System.out.println("sort JONATHAN jyolti");
                    break;
                case RED_DEL:
                    System.out.println("sort REDDEL krasni");
                    break;
                case WINESAP:
                    System.out.println("sort Winesap krasni");
                    break;
                case CORTLAND:
                    System.out.println("sort CORTLAND krasni");
                    break;
            }

        }
    }
}
