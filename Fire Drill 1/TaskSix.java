/*Print the multiples of each of the result from TaskFour (4 16 64 256 1024 8 64 512 4096 32768)
*/


public class TaskSix {
    public static void main(String[] args) {

    int multiplesOfFour = 4;
	for(int count = 0; count < 5; count++) {
	System.out.print(multiplesOfFour + " ");
	multiplesOfFour *= 4;
	}

    int multiplesOfEight = 8;
	for(int count = 0; count < 5; count++) {
	System.out.print(multiplesOfEight + " ");
	multiplesOfEight *= 8;
	}
    }
}
