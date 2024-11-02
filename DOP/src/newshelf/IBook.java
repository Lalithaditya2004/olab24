package newshelf;
public sealed interface IBook permits Comic,TextBook,Fiction{

}

enum FictionType {

	Comedy,
	Tragedy,
	GoK
}

record Comic(String Title,int ageOfMainCharacter) implements IBook{
	


}

record Fiction(String name,FictionType type) implements IBook{


}

record TextBook(String subject) implements IBook {


}


