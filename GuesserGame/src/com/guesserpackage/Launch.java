package com.guesserpackage;

import java.util.Scanner;


class Guesser 
{
	private int gnum;
	String gname;

	void guessNum()
	{
		System.out.println(gname + "guess a number");
		Scanner scan=new Scanner(System.in);
		gnum=scan.nextInt();
	}
	int getGnum()
	{
		return gnum;
	}
	Guesser(String gname)
	{
		this.gname=gname;
	}

}
	class Player
	{
		private int pnum;
		String pname;

		void guessNum()
		{
			System.out.println(pname + "guess a number");
			Scanner scan=new Scanner(System.in);
			pnum=scan.nextInt();
		}

		int getPnum()
		{
			return pnum;
		}

		Player(String pname)
		{
			this.pname=pname;
		}
	}

	class Umpire
	{
		int no_from_guesser;
		int no_from_p1;
		int no_from_p2;
		int p1score,p2score;
		String gname,p1name,p2name;

		void askName()
		{
			System.out.println("guesser whats your name");
			Scanner scan=new Scanner(System.in);
			gname=scan.nextLine();

			System.out.println("player1 whats your name");
			p1name=scan.nextLine();

			System.out.println("player2 whats your name");
			p2name=scan.nextLine();

		}

		void askGuesser()
		{
			Guesser g=new Guesser(gname);
			g.guessNum();

			no_from_guesser=g.getGnum();
		}

		void askPlayers()
		{
			Player p1=new Player(p1name);
			p1.guessNum();
			no_from_p1=p1.getPnum();

			Player p2=new Player(p1name);
			p2.guessNum();
			no_from_p2=p2.getPnum();
		}

		void Compare()
		{
			if(no_from_guesser==no_from_p1&&no_from_guesser==no_from_p2)
			{
				System.out.println("it is a draw");
			}
			else if(no_from_guesser==no_from_p1)
			{
				System.out.println(p1name + "has guessed correct");
				p1score++;
			}
			else if(no_from_guesser==no_from_p2)
			{
				System.out.println(p2name + "has guessed correct");
				p2score++;
			}
			else
			{
				System.out.println("please continue");
			}
		}

		void disp()
		{
			System.out.println(p1name + "score is" +p1score);
			System.out.println(p2name + "score is" +p2score);

			if(p1score==p2score)
			{
				System.out.println("draw");
			}
			else if(p1score>p2score)
			{
				System.out.println(p1name + "has won");
			}
			else
			{
				System.out.println(p2name + "has won");
			}
		}

	}


class Launch
{

	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.askName();

		System.out.println("enter the rounds");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();

		for(int i=1;i<=n;i++)
		{
			u.askGuesser();
			u.askPlayers();
			u.Compare();
		}

		u.disp();

	}
}
