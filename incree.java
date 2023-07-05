package P1;

public class incree {
	public static void main(String[] args){
		int i = 6;
		i++;
		System.out.println(i); 
		++i; 
		System.out.println(i); 
		System.out.println(++i); 
		System.out.println(i++); 
		System.out.println(i); 
		int n,j,k;
		n=j=k=1;
		
		k = j % n--;
		System.out.println(k);
		int a=5,b=3;
		int c=a++ + --b;
		System.out.println(c);
		int x=0,y=0;
		for(int z=0;z<5;z++) {
			if((++x>2) || (++y>2)) {
				x++;
			}
		}
		System.out.print(x + " " + y);
		}
}
