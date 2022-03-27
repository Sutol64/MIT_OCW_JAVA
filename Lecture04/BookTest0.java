public class BookTest0 {
	public static void main(String[] args) {
		double lengthLeft= 1.0;	// Remaining space on bookshelf
		int booksPlaced= 1;		// Books on shelf so far
		double length= 0.1;		// Length of book
		//double length01 = 0.2;
		//double length02 = 0.3;
		//double length03 = 0.4;
		//double length04 = 0.5;
		// Your code here: try to place items of length 0.1, 0.2,
		// 0.3, 0.4 and 0.5 on shelf. Loop while enough space
		//double total = lengthLeft;
		//double l = 0;
		while(lengthLeft > 0) {
			lengthLeft = Math.abs(lengthLeft - length);
			length = length + 0.1;
			booksPlaced++;
		}
		System.out.println("Books placed: "+ booksPlaced);
		System.out.println("Length left: "+ lengthLeft);
	}		
}