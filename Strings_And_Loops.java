class Strings_And_For_Loops {
    public static void main(String[] args) {

        int myLoopControlVariable = 0;

        while (myLoopControlVariable++ <= 12){
            System.out.println("myLoopControlVariable is... " + myLoopControlVariable );
        }

        System.out.printf("Hello and welcome to Daniel's Strings & Loops Practice!");;


        String[] myStrArray = {"this", "that", "the other"};

        for (int i = 0; i < 3; i++) {
            System.out.println("myStrArray[" + i + "] = " + myStrArray[i]);
        }
    }
}