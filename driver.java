package pack;

public class driver {
	public static void main(String[] args)
	{
		List<String> disciples = new theSinglyLinkedList<>();
		//storing the 12 disciples names
		disciples.append("Peter"); 
        disciples.append("James");
        disciples.append("John");
        disciples.append("Andrew");
        disciples.append("Philip");
        disciples.append("Bartholomew");
        disciples.append("Matthew");
        disciples.append("Thomas");
        disciples.append("James the Less");
        disciples.append("Simon");
        disciples.append("Thaddeus");
        disciples.append("Judas Iscariot");
        
        //remove the one that betrayed Jesus
        disciples.remove("Judas Iscariot");
        
        //sorting the names in alphabetical order
        disciples.sort();
        
        // print the disciples in reverse order 
        System.out.println("The Disciples are:");
        disciples.printReverse();
	}
}
