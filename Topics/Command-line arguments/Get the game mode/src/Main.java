class Problem {
    public static void main(String[] args) {
        String res = "default";
        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals("mode")) {
                res = args[i + 1];
                break;
            }
        }
        System.out.println(res);
    }
}