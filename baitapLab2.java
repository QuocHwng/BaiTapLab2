import java.util.Scanner;
public class baitapLab2
{
	public static void menu()
	{
		
	}

	public static void ptbac1(double a, double b)
	{
		double x;
		if (a == 0)
		{
			if (b == 0)
			{
				System.out.println("Phuong trinh vo so nghiem");
			}
			else
			{
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else
		{
			x = -b/a;
			System.out.println("Nghiem cua phuong trinh bac nhat la: " + x);
		}
	}

	public static void ptbac2(double a, double b, double c)
	{
		double x, del, x1, x2;
		if (a == 0) 
	{
	    if (b == 0) 
	    {
			if (c == 0) 
			{
		    	System.out.println("Phuong trinh vo so nghiem");
			} 
			else 
			{
		    	System.out.println("Phuong trinh vo nghiem");
			}
	    } 
	    else 
	    {
			System.out.println("Phuong trinh co nghiem = " + (-c / b));
	    }
	} 
	else 
	{ 
	    del = b * b - 4 * a * c;
	    if (del < 0) {
		System.out.println("Phuong trinh vo nghiem");
	    } else if (del == 0) {
		x1 = x2 = -b / (2 * a);
		System.out.println("Phuong trinh co nghiem kep: " + x1);
	    } else {
		x1 = (-b + Math.sqrt(del)) / (2 * a);
		x2 = (-b - Math.sqrt(del)) / (2 * a);
		System.out.println("Phuong trinh co 2 nghiem phan biet la: x1 = " + x1 + "\nx2 = " + x2);
			}
		}
	}

	public static void tiendien(int SoDien)
	{
		int tien;
		if (SoDien < 50)
		{
			tien = SoDien*1000;
			System.out.println("So tien can tra la: " + tien);
		}
		else
		{
			tien = 50*1000+(SoDien-50)*1200;
			System.out.println("So tien can tra la: " + tien);
		}
	}

	public static void socp(int n)
	{		
		double i = Math.sqrt(n);
		if (i*i == n)
		{
			System.out.println(n + " la so chinh phuong");
		}
		else
		{
			System.out.println(n + " khong phai la so chinh phuong");
		}
	}

	public static void xeploai(double Diemtrungbinh)
	{
		if (Diemtrungbinh < 5.0)
		{
			System.out.println("Xep loai kem");
		}
		else if (Diemtrungbinh < 7.0)
		{
			System.out.println("Xep loai trung binh");
		}
		else if (Diemtrungbinh < 8.0)
		{
			System.out.println("Xep loai kha");
		}
		else
		{
			System.out.println("Xep loai gioi");
		}
	}

	public static void docso(int so)
	{
		int tram = so/100;
		int chuc = so%100/10;
		int dv = so%100%10;
		if ((tram<=9) && ((chuc<=9) && (chuc!=0)) && ((dv<=9) && (dv!=0)))
		{
			System.out.println(tram + " tram " + chuc + " muoi " + dv);
		}
		else if ((tram<=9) && (chuc<=9) && ((dv<=9) && (dv!=0)))
		{
			System.out.println(tram + " tram " + "linh " + dv);
		}
		else if ((tram<=9) && ((chuc<=9) && (chuc!=0)) && (dv<=9))
		{
			System.out.println(tram + " tram " + chuc + " muoi");
		}
		else
		{
			System.out.println(tram + " tram");
		}
	}

	public static void giaithuawhile(int n)
	{
		if (n == 0)
		{
			System.out.println("Giai thua cua " + n + " la: 1");
		}
		else
		{
			int i=1;
			int j=2;
			while (j<=n)
			{
				i = i*j; j++;
			}
			System.out.println("Giai thua cua " + n + " la: " + i);
		}
	}

	public static void giaithuadowhile(int n)
	{
		if (n == 0)
		{
			System.out.println("Giai thua cua " + n + " la: 1");
		}
		else
		{
			int i=1;
			int j=2;
			do
			{
				i = i*j; j++;
			} while(j<=n);
			System.out.println("Giai thua cua " + n + " la: " + i);
		}
	}

	public static void main(String[] args)
	{
		int nhap;
		Scanner input = new Scanner(System.in);
		menu();
		do
		{
			System.out.print("\nSu lua chon cua ban la: "); nhap = input.nextInt();
			switch (chon)
			{
				case 1:
				{
					System.out.print("Nhap so a bat ky = "); double a = input.nextDouble();
					System.out.print("Nhap so b bat ky = "); double b = input.nextDouble();
					ptbac1(a,b);
				} break;
				case 2:
				{
					System.out.print("Nhap so a bat ky = "); double a = input.nextDouble();
					System.out.print("Nhap so b bat ky = "); double b = input.nextDouble();
					System.out.print("Nhap so c bat ky = "); double c = input.nextDouble();
					ptbac2(a,b,c);
				} break;
				case 3:
				{
					System.out.print("Nhap so dien = "); int SoDien = input.nextInt();
					tiendien(SoDien);
				} break;
				case 4:
				{
					System.out.print("Nhap so nguyen n = "); int n = input.nextInt();
					socp(n);
				} break;
				case 5:
				{
					System.out.print("Nhap so Diem Trung Binh = "); double Diemtrungbinh = input.nextDouble();
					xeploai(Diemtrungbinh);
				} break;
				case 6:
				{
					int so;
					System.out.print("Nhap so co 3 chu so = "); so = input.nextInt();
					while ((so<100) || (so>999))
					{
						System.out.print("Nhap so co 3 chu so = "); so = input.nextInt();
						if ((so>99) && (so<1000))
						{
							docso(so);
						}
					}
				} break;
				case 7:
				{
					System.out.print("Nhap so n = "); int n = input.nextInt();
					giaithuawhile(n);
				} break;
				case 8:
				{
					System.out.print("Nhap so n = "); int n = input.nextInt();
					giaithuadowhile(n);
				} break;
			} while (nhap != 0);
		}
	}
}