public class RobotBoundedInCircle {
    public static void main(String[] args) {
        String instructions = "GG";
        boolean out = (new RobotBoundedInCircle()).isRobotBounded(instructions);
        System.out.println(out);
    }

    // if north j++
    // if south j--
    // if east i++
    // if west i--
    public boolean isRobotBounded(String instructions) {
        if(instructions.length() == 0){
            return false;
        }
        int i = 0, j = 0, k = 0, count=1;
        String direction = "North";
        for(char ch: instructions.toCharArray()) {
            if (ch == 'G') {
                switch (direction) {
                    case "North" -> j++;
                    case "South" -> j--;
                    case "East" -> i++;
                    case "West" -> i--;
                }
            } else if (ch == 'L') {
                direction = switch (direction) {
                    case "North" -> "West";
                    case "South" -> "East";
                    case "East" -> "North";
                    default -> "South";
                };

            } else if (ch == 'R') {
                direction = switch (direction) {
                    case "North" -> "East";
                    case "South" -> "West";
                    case "East" -> "South";
                    default -> "North";
                };
            }



        }
        if(i==0 && j==0){
            return true;
        }
        return !direction.equals("North");
    }
}