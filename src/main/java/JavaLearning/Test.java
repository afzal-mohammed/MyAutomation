package JavaLearning;

//input string:: 123He45llo98 
//
//123451198
//Hello
// Program to separate numbers and alphabets. Multiple ways
class Test{
	
	public void separateCharsByASCII(String input) {
		char chars[] = input.toCharArray();
		String alpha = "";
		String num = "";
		String spChars = "";
		int count=0;
		for(int i=0; i< chars.length ; i++) {
			int ch = (int) chars[i];
			System.out.println(ch);
			if((ch>=97 && ch<=122) || (ch>=65 && ch<=90)) {
				alpha = alpha + chars[i];
			}else if(ch >= 48 && ch <= 57){
				num = num + chars[i];
			}else {
				spChars = spChars + chars[i];
			}
		}
		System.out.println("Alphabet:: " + alpha);
		System.out.println("Number:: " + num);
		System.out.println("Special Characters:: " + spChars);
	}
	
	public void separateCharsByRegEx(String input) {
		System.out.println(input.replaceAll("[0-9]", ""));
		System.out.println(input.replaceAll("[a-z A-Z]", ""));
	}
	
	public void separateCharsByCharacterClass(String input) {
		char chars[]= input.toCharArray();
		String aplha = "";
		String num = "";
		String spChar = "";
		for(int i=0; i< chars.length; i++) {
			if(Character.isAlphabetic(chars[i])) {
				aplha = aplha + chars[i];
			}else if(Character.isDigit(chars[i])) {
				num = num + chars[i];
			}else {
				spChar = spChar + chars[i];
			}
			
		}
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.separateCharsByASCII("fs.<dfgd425/NBHM;'486");
		t.separateCharsByRegEx("afd750987305LKJLK09809");
	}
}