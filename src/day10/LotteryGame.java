package day10;

import java.util.Scanner;
import java.util.Random;
// Each lottery game round will randomly pick a number from 1-25
// Each round, the player could buy X amount of bet with a selected number 1-25
// If the number you selected matches the number picked by the lottery machine,
// you will win 2 times, otherwise, you lose the money you bet.

// Object-Oriented Design

// Visibility 
// Accessibility

public class LotteryGame {

	private int numPlayerSelected;
	private int numWinning;
	private int playerBalance;
	private int playerBet;
	private int totalWins;
	private int totalLosts;
	
	// constructor  构造函数
	public LotteryGame() {
		System.out.println("Calling Constructor Function Now!");
		depositBalance();
	}
	
	public LotteryGame(int balance) {
		playerBalance = balance;
	}
	
	public LotteryGame(int playerBalance, int totalWins, int totalLosts) {
		this.playerBalance = playerBalance;
		this.totalWins = totalWins;
		this.totalLosts = totalLosts;
	}
	
	private void generateWinningNumber() {
		System.out.println("Now generating the winning number today ... ");
		Random r = new Random();
		numWinning = r.nextInt(25);	// 0-25	
		System.out.println("The winning number has been generated.");
	}
	
	private void askPlayerNumber() {
		System.out.println("Please select the number to bet (1-25): ");
		Scanner s = new Scanner(System.in);
		numPlayerSelected = s.nextInt();
		System.out.println("Got your selection. Number: " + numPlayerSelected);
	}
	
	private int getBalance() {
		return playerBalance;
	}
	
	private void depositBalance() {
		System.out.println("Please deposit your balance: ");
		Scanner s = new Scanner(System.in);
		playerBalance = s.nextInt();
		System.out.println("Deposit confirmation: $" + playerBalance);
	}
	
	private void setBetAmount() {
		System.out.println("Please make your bet ($1 - $10,000): ");
		Scanner s = new Scanner(System.in);
		playerBet = s.nextInt();
		while(playerBet > playerBalance) {
			System.out.println("Cheater! You need more money play!");
			System.out.println("Please make your bet ($1 - $10,000): ");
			playerBet = s.nextInt();
		}		
		System.out.println("Got your bet. You bet: $" + playerBet);			
	}
	
	private void showResult() {
		System.out.println("****************************");
		System.out.println("YOUR BALANCE: " + playerBalance);
		System.out.println("TOTAL  WINS : " + totalWins);
		System.out.println("TOTAL  LOSTS: " + totalLosts);
		System.out.println("****************************");
	}
	
	private void processLottery() {
		System.out.println("The winning number today is: " + numWinning);
		if (numWinning == numPlayerSelected) {
			System.out.println("Congratulations! You win!");
			playerBalance = playerBalance + playerBet * 25;
			totalWins++;
		} else {
			System.out.println("Sorry. Try agin!");
			playerBalance = playerBalance - playerBet;
			totalLosts++;
			if (playerBalance <= 0) {
				System.out.println("Loser! You are running out of money. Come back with more cash!");
			}
		}
	}
	
	public void playLotteryRound() {		
		askPlayerNumber();
		setBetAmount();
		generateWinningNumber();
		processLottery();
		showResult();
	}
	
	public void playLotteryRound(int totalRounds) {
		for(int i = 0; i < totalRounds; i++) {
			askPlayerNumber();
			setBetAmount();
			generateWinningNumber();
			processLottery();
			showResult();
		}
	}
}
