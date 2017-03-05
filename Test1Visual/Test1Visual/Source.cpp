#include <iostream>
#include <stdlib.h>
#include <ctype.h>
#include <stdio.h>
#include <conio.h>

using namespace std;


void print(int a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout << a[i] << " ";
	}
	cout << endl;
}

void swapp(int &x, int &y)
{
	int aux;
	aux = x;
	x = y;
	y = aux;
}

int main()
{

	int a[50];
	int x = 50;
	for (int i = 0; i < 50; i++)
	{
		a[i] = x;
		x--;
	}

	print(a, 50);

	for (int i = 0; i < 49; i++)
	{
		for (int j = i + 1; j < 50; j++)
		{
			if (a[i] > a[j]);
			{
				swapp(a[i], a[j]);
			}
		}
	}

	print(a, 50);


	_getch();
}
