package newshelf;

public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		// if (o instanceof Comic c) {
		// 	return ((Comic) o).Title();
		// }
		// else if(o instanceof TextBook t){
		// 	return ((TextBook) o).subject();
		// }	
		// else if(o instanceof Fiction f){
		// 	return ((Fiction) o).name();
		// }
		switch(o){
			case Comic(String Title,int ageOfMainCharacter) -> {
				return Title;
			}
			case Fiction(String name,FictionType type) -> {
				return name;
			}
			case TextBook(String subject) -> {
				return subject;
			}
			default -> {
				return null;
			}
		}
		

	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("Biology");
		System.out.println(getAgeOrTitle(t));
		Fiction f = new Fiction("Harry Potter",FictionType.GoK);
		System.out.println(getAgeOrTitle(f));
		Comic c = new Comic("Avenger's SECRET WARS", 54);
		System.out.println(getAgeOrTitle(c));		
		
	}
}
