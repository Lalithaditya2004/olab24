package newshelf;

public interface IBook{

}

enum FictionType {

	Comedy,
	Tragedy,
	GoK
}

record Comic(String Title,int ageOfMainCharacter) implements IBook {
	

}

record Fiction(String name,FictionType type) implements IBook {


}

record TextBook(String subject) implements IBook {


}