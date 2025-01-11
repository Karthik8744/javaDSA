public class ShortestPath {

    // Time Complexity
    static void shortestPath (String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'N') {
                y++;
            }
            else if (dir == 'S') {
                y--;
            }
            else if (dir == 'E') {
                x++;
            }
            else if (dir == 'W') {
                x--;
            }
        }
        double dis = Math.sqrt((x * x) + (y * y));

        System.out.println("The shortest distance is " + dis);
    }

    public static void main(String[] args) {
        String directions = "WNEENESENNN";
        shortestPath(directions);
    }
}
