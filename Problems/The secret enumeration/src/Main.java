public class Main {

    public static void main(String[] args) {
        Secret[] arr = Secret.values();
        int count = 0;
        for (Secret secret : arr) {
            String s = secret.toString();
            if (s.startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

//enum Secret {
//    STAR, CRASH, START, // ...
//}
