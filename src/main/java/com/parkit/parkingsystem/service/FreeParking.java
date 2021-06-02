package com.parkit.parkingsystem.service;


import java.util.Scanner;
class FreeParking {
public static void main(String[] args)
{
try (Scanner input = new Scanner(System.in)) {
	int hr1, mn1;
	System.out.print("Horaire entree (hr mn)? ");
	hr1 = input.nextInt();
	mn1 = input.nextInt();
	int hr2, mn2;
	System.out.print("Horaire sortie (hr mn)? ");
	hr2 = input.nextInt();
	mn2 = input.nextInt();
	//System.out.print("Etes-vous un(e) habitué(e)? ");*/
	int dm = (hr2 * 60 + mn2) - (hr1 * 60 + mn1);
	double prix = 0.0;
	if (dm <= 30)
	{
	prix = 0;
	}
	else if (dm <= 30)
	{
	prix = 6.0;
	}
	else
	{
	prix = 8.0;
	}
	System.out.println("==> Duree (min) : " + dm);
	System.out.println("==> Prix (euro) : " + prix);
}
}
}