class Handson4 {

	public static void main(String[] args) {
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Shayan", 123456);
		contactsList.addContact("Supratim", 789563);
		contactsList.addContact("Tanmoy", 458759);

		//checking the existence of a key
		if(contactsList.doesKeyExist("Subhra")){
			System.out.println("Key exists");
		} else{
			System.out.println("Key doesn't exist");
		}
		//checking the existence of a value
		if(contactsList.doesValueExist(789563)){
			System.out.println("Value exists");
		} else {
			System.out.println("Value doesn't exist");
		}
		//Iterator to loop through map key
		System.out.println();
		System.out.println("LIST OF CONTACTS");
		System.out.println("----------------");
		contactsList.listAllContacts();
	}

}
