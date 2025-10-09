public class Test4 {

	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "Java";
		
		boolean isEqual1 = str1.equals(str2);
		boolean isEqual2 = str1.equalsIgnoreCase(str2);
		
		int compare1 = str1.compareTo(str2);
		int compare2 = str1.compareToIgnoreCase(str2);
		
		System.out.println(isEqual1);
		System.out.println(isEqual2);

		System.out.println(compare1);
		System.out.println(compare2);
	}
}