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
		
		if (o instanceof Comic c) {
			return ((Comic) o).Title();
		}
		if(o instanceof TextBook t){
			return ((TextBook) o).subject();
		}	
		if(o instanceof Fiction f){
			return ((Fiction) o).name();
		}

		return null;
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("Social Studies");
		Comic c = new Comic("Avengers Dooms Day",54);
		Fiction f = new Fiction("Harry Potter",FictionType.GoK);
		System.out.println(getAgeOrTitle(f));
		System.out.println(getAgeOrTitle(c));
		System.out.println(getAgeOrTitle(t));
		
		
	}
}
