package newshelf;

public interface IBook{

}

enum FictionType {

	Comedy,
	Tragedy,
	GoK
}

record Comic(String Title,int ageOfMainCharacter) implements IBook {
	

	public String getTitle(){
		return this.Title;
	}
	@Override
	public String toString() {
		return "Title: "+this.Title + " Age of Main Character: " + this.ageOfMainCharacter;
	}

	 
	@Override
	public int hashCode() {
		return this.Title.hashCode()+ageOfMainCharacter;
	}

}

record Fiction(String name,FictionType type) implements IBook {

	public String getName(){
		return this.name;
	}

}

record TextBook(String subject) implements IBook {

	public String getSubject(){
		return this.subject;
	}
	@Override
	public String toString() {
		return "Subject: "+this.subject;
	}

}