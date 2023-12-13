/**
 * 주사위를 굴리자~!
 */
package game;
public class DirectionGame {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 3) + 1;
        int num2 = (int)(Math.random() * 6) + 1;
        Direction[] values = Direction.values();
        System.out.println(values[num1].getName() +"으로 "
                + values[num1].getScore(num2) + "점");
    }
}
