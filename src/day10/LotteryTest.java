package day10;

public class LotteryTest {

	public static void main(String[] args) {
		LotteryGame lotteryGame1 = new LotteryGame(5000);		
				
		for(int i = 0; i < 10; i++) {
			lotteryGame1.playLotteryRound();								
		}
	}
}
